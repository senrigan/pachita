import java.io.Serializable;


public class PachitaWS implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -1562042427797427739L;
	private String usuario;
	private String pass;
	private String mensaje;
	private Boolean status;
	
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getMensaje() {
		return mensaje;
	}
	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	public Boolean getStatus() {
		return status;
	}
	public void setStatus(Boolean status) {
		this.status = status;
	}
	
}
