package com.gdc.nms.test.connectiontest;

import java.util.concurrent.TimeUnit;

public abstract class PortConnector {
	protected int timeout=(int)TimeUnit.SECONDS.toMillis(10); 
	protected String ip;
	protected int port;
	
	public void setIp(String ip){
		this.ip=ip;
	}
	
	public String getIp(){
		return this.ip;
	}
	
	public void setPort(int port){
		this.port=port;
	}
	
	public int getPort(){
		return this.port;
	}
	
	public int getTimeOut(){
		return this.timeout;
	}
	
	public void setTimeOut(int timeout){
		this.timeout=timeout;
	}
	
	public abstract String sendMessage (String messageToSend);
}
