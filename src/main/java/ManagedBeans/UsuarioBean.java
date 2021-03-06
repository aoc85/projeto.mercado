package ManagedBeans;

import java.io.Serializable;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;

import com.br.projeto.mercado.models.Usuario;
import com.br.projeto.servicos.UsuarioService;

@ManagedBean(name="usuarioBean")
@SessionScoped
public class UsuarioBean implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private String pwd;
	private String name;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	
	public String verifica() {
		UsuarioService usuario = new UsuarioService();
		List<Usuario> lista = usuario.findAll();
		for(Usuario a : lista) {
			if((a.getNome().equals(this.name)) && (a.getPwd().equals(this.pwd))) {
				return "/entrada.xhtml";
			}
		}		
	    return null;
	}
	
	
}
