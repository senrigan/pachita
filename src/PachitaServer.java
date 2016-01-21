import java.util.List;
import java.util.Set;




import com.gdc.nms.common.Resource;
import com.gdc.nms.model.Device;
import com.gdc.nms.model.DeviceResource;
import com.gdc.nms.model.Interface;
import com.gdc.nms.server.ServerManager;
import com.gdc.nms.server.drivers.snmp.Driver;
import com.gdc.nms.server.drivers.snmp.DriverManager;
import com.gdc.nms.server.drivers.snmp.HuaweiRoutersDriver;
import com.gdc.nms.server.drivers.snmp.mock.MockDriver.MockManager;
import com.gdc.nms.server.eclipselink.SqlInsertableRowDescriptor;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;


public class PachitaServer {
//		public static void main(String[] args) {
//	//	
//			List<Device> all = ServerManager.getInstance().getDeviceCache().all();
//			for (Device device : all) {
//				if(device.isManaged()){
//					if(device.isSnmpable()){
//						if(device.isReachable()){
//							;
//							if(!device.getDeviceResources().isEmpty()){
//								if(!device.getInterfaces().isEmpty()){
//									print("<br>ip"+device.getIp()+"id"+device.getId()+"table id"+device.getStatsTableId());
//									for(Interface inter:device.getInterfaces()){
//										print("<br>inetrface id"+inter.getId()+"ifindex"+inter.getIfIndex());
//									}
//									for(DeviceResource resource:device.getDeviceResources()){
//										print("<br> resources id"+resource.getId());
//									}
//	
//								}
//							}
//							print("ip"+device.getIp()+"id"+device.getId();
//							
//						}
//					}
//				}
//			}
//		}
}
//** run inthe http://192.168.204.20:8080/nms/web/bshexecutor.jsp

/*
 * import java.util.List;

import com.gdc.nms.common.Resource;
import com.gdc.nms.model.Device;
import com.gdc.nms.model.DeviceResource;
import com.gdc.nms.server.ServerManager;
import com.gdc.nms.server.drivers.snmp.Driver;
import com.gdc.nms.server.drivers.snmp.DriverManager;
import com.gdc.nms.server.eclipselink.SqlInsertableRowDescriptor;

Device device=ServerManager.getInstance().getDeviceCache().byIp("192.168.220.252");
		
		Driver driv=DriverManager.getInstance().getDriver(device);
		try{
          print(driv.getClass());
			List lisreso=driv.getDeviceResources();
			for(DeviceResource reso:lisreso){
	print(reso.getResourceType());
				SqlInsertableRowDescriptor stats = driv.getStats(reso, 10, "");
				print(stats);
				

            }
		}catch(Exception ex){
			
		}finally{
			driv.unbind();
		}
 */
/*
import java.util.List;

import org.snmp4j.smi.OID;
import org.snmp4j.smi.Variable;

import com.gdc.nms.common.Resource;
import com.gdc.nms.model.Device;
import com.gdc.nms.model.DeviceResource;
import com.gdc.nms.server.ServerManager;
import com.gdc.nms.server.drivers.snmp.Driver;
import com.gdc.nms.server.drivers.snmp.DriverManager;
import com.gdc.nms.server.drivers.snmp.HuaweiRoutersDriver;
import com.gdc.nms.server.eclipselink.SqlInsertableRowDescriptor;
		
		Device device=ServerManager.getInstance().getDeviceCache().byIp("192.168.220.252");
		int INSTANCE=603979777;
		int[] HW_ENTITY_CPU_USAGE = new int[] { 1, 3, 6, 1, 4, 1, 2011, 5, 25, 31, 1, 1, 1, 1, 5 };
		Driver driv=DriverManager.getInstance().getDriver(device);
		OID oid=new OID(HW_ENTITY_CPU_USAGE,
		        new int[] { INSTANCE });
		
		try{
			List<DeviceResource> lisreso=driv.getDeviceResources();
			print(driv.getClass());
			for(DeviceResource reso:lisreso){
				print(reso.getResourceType());
				SqlInsertableRowDescriptor stats = driv.getStats(reso, 10, "");
				Variable cpuUsageVar=driv.getSnmpConnector().get(oid);
				print("cpuUsage "+ cpuUsageVar);
				print("stast"+stats);
				
				
			}
			
		}catch(Exception ex){
			
		}finally{
			driv.unbind();
		}
*/