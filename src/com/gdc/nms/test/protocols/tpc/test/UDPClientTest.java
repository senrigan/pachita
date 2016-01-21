package com.gdc.nms.test.protocols.tpc.test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPClientTest {
	private String ip;
	private int port;
	public UDPClientTest(){
		
	}
	
	public UDPClientTest(String ip,int port){
		this.ip=ip;
		this.port=port;
	}
	
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
	
	public String sendMessage(String messageToSend){
		 
		//Definimos el sockets, número de bytes del buffer, y mensaje.
		 int messageSize=messageToSend.length();
		 DatagramSocket socket;
		 InetAddress address;
		 byte[] mensaje_bytes = new byte[messageSize];
		 String message="";
		 mensaje_bytes=message.getBytes();
		 
		//Paquete
		 DatagramPacket paquete;
		 
		 String cadenaMensaje=null;
		 
		DatagramPacket servPaquete;
		 
		byte[] RecogerServidor_bytes = new byte[messageSize];
		 
		 try {
			 socket = new DatagramSocket();
			 //socket.setSoTimeout(5000);
		 
			 address=InetAddress.getByName(ip);
			 
			//do {
				 //mensaje = in.readLine();
			 	 message=messageToSend;
				 mensaje_bytes = message.getBytes();
				 paquete = new DatagramPacket(mensaje_bytes,message.length(),address,port);
				 socket.send(paquete);
				 
				RecogerServidor_bytes = new byte[messageSize];
				 
				//Esperamos a recibir un paquete
				 servPaquete = new DatagramPacket(RecogerServidor_bytes,messageSize);
				 socket.receive(servPaquete);
				 
				//Convertimos el mensaje recibido en un string
				 cadenaMensaje = new String(RecogerServidor_bytes).trim();
				 
				//Imprimimos el paquete recibido
				 //System.out.println(cadenaMensaje);
				 return cadenaMensaje;
			 //} while (!mensaje.startsWith("fin"));
		 }
		 catch (Exception e) {
			 e.printStackTrace();
//		 System.err.println(e.getMessage());
	
		 }
		 
		 return cadenaMensaje;
	}
	
	public static void main(String[] args) {
		/*UDPClientTest udp=new UDPClientTest("192.168.207.70",7);
		udp.sendMessage("mundo");
		*/
		try{
			BufferedReader inFromUser = new BufferedReader(new InputStreamReader(System.in));   
			DatagramSocket clientSocket = new DatagramSocket();       
			InetAddress IPAddress = InetAddress.getByName("192.168.208.70");      
			byte[] sendData = new byte[1024];       
			byte[] receiveData = new byte[1024];       
			String sentence = inFromUser.readLine();       
			sendData = sentence.getBytes();       
			DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, IPAddress, 7);       
			clientSocket.send(sendPacket);       
			DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);       
			clientSocket.receive(receivePacket);       String modifiedSentence = new String(receivePacket.getData());       
			System.out.println("FROM SERVER:" + modifiedSentence);       
			clientSocket.close();
		}catch(Exception e){
			
		}
		
	}
	
}
