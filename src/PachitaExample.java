import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.List;

import com.gdc.nms.model.Device;
import com.gdc.nms.server.ServerManager;
import com.gdc.nms.server.tools.cortes.CortesServlet;
import com.gdc.nms.server.tools.cortes.DeviceCutSummary;








public class PachitaExample  {
	
	
	public static void main(String[] args) throws UnknownHostException  {
		List<Device> all = ServerManager.getInstance().getDeviceCache().all();
		for(Device dev:all){
			print("\""+dev.getIp()+"\""+",");
		}
	}
	
	public void hol(Object a){
		System.out.println(a);
	}



	
	
	
	
	
}
	
	

