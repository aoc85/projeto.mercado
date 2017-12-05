package com.br.projeto.mercado.DAO;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import com.br.projeto.mercado.models.Produto;

public class ProdutoDAO implements ProdutoDaoInterface<Produto, String>{

	private Session currentSession;
	private Transaction currentTransaction;
	
	public ProdutoDAO() {
		
	}
	
	public Session openCurrentSession() {
		currentSession = getSessionFactory().openSession();
		return currentSession;
	}
	
	public Session openCurrentSessionwithTransaction() {
		currentSession = getSessionFactory().openSession();
		currentTransaction = currentSession.beginTransaction();
		return currentSession;
	}
	
	public void closeCurrentSession() {
		currentSession.close();
	}
	
	public void closeCurrentSessionwithTransaction() {
		currentTransaction.commit();
		currentSession.close();
	}
	
	public static SessionFactory getSessionFactory() {
		Configuration configuration = new Configuration().configure();
		StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties());
		SessionFactory sessionFactory = configuration.buildSessionFactory(builder.build());
		return sessionFactory;		
	}
	
	public Session getCurrentSession() {
		return currentSession;
	}
	
	public void setCurrentSession(Session currentSession) {
		this.currentSession = currentSession;
	}
	
	public Transaction getCurrentTransaction() {
		return currentTransaction;
	}
	public void setCurrentTransaction(Transaction currentTransaction) {
		this.currentTransaction = currentTransaction;
	}
	
	@Override
	public void persist(Produto entity) {
		getCurrentSession().save(entity);
		
	}

	@Override
	public void update(Produto entity) {
		getCurrentSession().update(entity);		
	}

	@Override
	public Produto findById(int id) {
		Produto produto = (Produto) getCurrentSession().get(Produto.class, id);
		return produto;
	}

	@Override
	public void delete(Produto entity) {
		getCurrentSession().delete(entity);		
	}

	@Override
	@SuppressWarnings("unchecked")
	public List<Produto> findAll() {
		List<Produto> produtos = (List<Produto>) getCurrentSession().createQuery("from Produto").list();
		return produtos;
	}

	


}
