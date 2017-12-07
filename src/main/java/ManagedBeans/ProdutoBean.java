package ManagedBeans;

import java.io.Serializable;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import com.br.projeto.mercado.models.Produto;
import com.br.projeto.servicos.ProdutosService;

@ManagedBean
@RequestScoped
public class ProdutoBean implements Serializable {

	private static final long serialVersionUID = 1L;
	String produto;
	double preco;
	double quantidade;
	String unidade;
	int id;
	private List<Produto> listaProduto;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getpreco() {
		return preco;
	}

	public void setpreco(double preco) {
		this.preco = preco;
	}

	public double getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(double quantidade) {
		this.quantidade = quantidade;
	}

	public String getUnidade() {
		return unidade;
	}

	public void setUnidade(String unidade) {
		this.unidade = unidade;
	}

	public String getProduto() {		
		return produto;
	}

	public void setProduto(String produto) {
		this.produto = produto;
	}

	public List<Produto> getListaProduto() {
		ProdutosService pService = new ProdutosService();
		listaProduto = pService.findAll();
		return listaProduto;
	}

	public void excluir(int id) {
		ProdutosService pService = new ProdutosService();
		pService.delete(id);
	}

	public void editar(int id) {

	}

	public void adicionar(String nome, double preco, int qtde, String unidade) {
		
		
		Produto novo = new Produto(nome, qtde, unidade, preco);
		ProdutosService produtoService = new ProdutosService();
		produtoService.persist(novo);
	}
	
	

}
