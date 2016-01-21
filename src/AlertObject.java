import java.math.BigDecimal;

 public  class AlertObject{

		public long id;
		  public long interfaceID ;
		  public long severity;
		  public long tickedID;
		  public long deviceID;
		  public BigDecimal begin,end;
		  
		  public AlertObject(long id,long interfaceID,long severity,long tickedID,long deviceID,BigDecimal begin,BigDecimal end){
			  this.id=id;
			  this.interfaceID=interfaceID;
			  this.severity=severity;
			  this.tickedID=tickedID;
			  this.deviceID=deviceID;
			  this.begin=begin;
			  this.end=end;
		  }
		  
		  public long getId() {
			  return id;
			}
		
		public void setId(long id) {
			this.id = id;
		}
		
		public long getInterfaceID() {
			return interfaceID;
		}
		
		public void setInterfaceID(long interfaceID) {
			this.interfaceID = interfaceID;
		}
		
		public long getSeverity() {
			return severity;
		}
		
		public void setSeverity(long severity) {
			this.severity = severity;
		}
		
		public long getTickedID() {
			return tickedID;
		}
		
		public void setTickedID(long tickedID) {
			this.tickedID = tickedID;
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

		  
		  
		   
		 
		  
		  
		  
	  }