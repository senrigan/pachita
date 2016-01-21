package threadPool;

import java.math.BigDecimal;

public class CutObject {


	    private String elementAlert="";
	    private String tableId;
	    private String ipDevice;
	    private long deviceID;
	    private BigDecimal begin,end;
	
	    
	    public CutObject(long deviceId,String ipDevice,String tableId,BigDecimal begin,BigDecimal end,String elementAlert){
	    	this.ipDevice=ipDevice;
	    	this.deviceID=deviceId;
	    	this.tableId=tableId;
	    	this.elementAlert=elementAlert;
	    	this.begin=begin;
	    	this.end=end;
	    }
	    
	    
	    public CutObject(){
	    	
	    }

		public String getElementAlert() {
			return elementAlert;
		}

		public void setElementAlert(String elementAlert) {
			this.elementAlert = elementAlert;
		}

		public String getTableId() {
			return tableId;
		}

		public void setTableId(String tableId) {
			this.tableId = tableId;
		}

		public String getIpDevice() {
			return ipDevice;
		}
		public void setIpDevice(String ipDevice) {
			this.ipDevice = ipDevice;
		}

		public long getDeviceID() {
			return deviceID;
		}
		
		public void setDeviceID(long deviceID) {
			this.deviceID = deviceID;
		}
		
		public BigDecimal getBegin() {
			return begin;
		}
		
		public void setBegin(BigDecimal begin) {
			this.begin = begin;
		}
		
		public BigDecimal getEnd() {
			return end;
		}
		
		public void setEnd(BigDecimal end) {
			this.end = end;
		}
	
		
	
	
	@Override
		public String toString() {
			return "CutObject [elementAlert=" + elementAlert + ", tableId="
					+ tableId + ", ipDevice=" + ipDevice + ", deviceID="
					+ deviceID + ", begin=" + begin + ", end=" + end + "]\n";
		}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((begin == null) ? 0 : begin.hashCode());
		result = prime * result + (int) (deviceID ^ (deviceID >>> 32));
		result = prime * result + ((end == null) ? 0 : end.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CutObject other = (CutObject) obj;
		if (begin == null) {
			if (other.begin != null)
				return false;
		} else if (!begin.equals(other.begin))
			return false;
		if (deviceID != other.deviceID)
			return false;
		if (end == null) {
			if (other.end != null)
				return false;
		} else if (!end.equals(other.end))
			return false;
		return true;
	}
	
	

				
				
				

			  
			   
			 
			  
			  
			  
		  
}
