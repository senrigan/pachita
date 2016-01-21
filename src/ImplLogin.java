
public class ImplLogin  implements IFace{

	@Override
	public PachitaWS validaLogin(PachitaWS obj) {
		PachitaWS bean=new PachitaWS();
		if(obj.getUsuario().equals("gil") && obj.getPass().equals("123")){
			bean.setMensaje("Usuario correcto");
			bean.setStatus(true);
		}else{
			bean.setMensaje("usuario no se encontro");
			bean.setStatus(false);
		}
		return bean;
	}
	

}
