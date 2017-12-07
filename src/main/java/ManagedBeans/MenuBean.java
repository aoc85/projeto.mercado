package ManagedBeans;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class MenuBean implements Serializable{
	
	private static final long serialVersionUID = 1L; 

	public String entrada() {
		return "entrada.xhtml";
	}
}
