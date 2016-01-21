package com.gdc.nms.test.connectiontest;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;
import java.util.concurrent.TimeUnit;

public class TCPCLient extends PortConnector {
	
	public TCPCLient(){
		
	}
	
	public TCPCLient(String ip,int port){
		this.ip=ip;
		this.port=port;
	}
	/**
	 * 
	 * @param ip
	 * @param port
	 * @param timeOut this value is in miliseconds
	 */
	public TCPCLient(String ip,int port,int timeOut){
		this.ip=ip;
		this.port=port;
		this.timeout=timeOut;
	}
	
	public String sendMessage(String messageToSend){
		 Socket socket;
		 String mensaje=messageToSend;
		 try {
			 socket = new Socket(ip,port);
			 socket.setSoTimeout(timeout);
			 DataOutputStream out = new DataOutputStream(socket.getOutputStream());
			 out.writeUTF(mensaje);
			 InputStream inputStream = socket.getInputStream();
			 DataInputStream in = new DataInputStream(inputStream);
			 mensaje=in.readUTF();
			 socket.close();
			 return mensaje;
		 }catch (Exception e) {
			 return null;
		 }
		 
	}
	
	public static void main(String[] args) {
		PortConnector tcp=new TCPCLient("192.168.207.41",7);
		System.out.println("recibiendo del equipo"+tcp.sendMessage("hola"));;
	}
}
