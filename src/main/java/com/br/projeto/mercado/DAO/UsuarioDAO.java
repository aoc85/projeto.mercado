package com.br.projeto.mercado.DAO;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Table;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import com.br.projeto.mercado.models.Usuario;

public class UsuarioDAO implements UsuarioDaoInterface<Usuario, String> {
	
	private Session currentSession;
	private Transaction currentTransaction;
	
	public UsuarioDAO() {
		
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
	public void persist(Usuario entity) {
		getCurrentSession().save(entity);
		
	}

	@Override
	public void update(Usuario entity) {
		getCurrentSession().update(entity);		
	}

	@Override
	public Usuario findById(String id) {
		Usuario usuario = (Usuario) getCurrentSession().get(Usuario.class, id);
		return usuario;
	}

	@Override
	public void delete(Usuario entity) {
		getCurrentSession().delete(entity);		
	}

	@Override
	@SuppressWarnings("unchecked")
	public List<Usuario> findAll() {
		List<Usuario> usuarios = (List<Usuario>) getCurrentSession().createQuery("from Usuario").list();
		return usuarios;
	}


}
