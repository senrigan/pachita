package com.gdc.nms.test.connectiontest;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;


public class UDPClient extends PortConnector{
	
	public UDPClient(String ip,int port){
		this.ip=ip;
		this.port=port;
	}
	public UDPClient(String ip,int port,int timeOut){
		this.ip=ip;
		this.port=port;
		this.timeout=timeOut;
	}
	public String sendMessage(String messageToSend) {
		try{
			String message=messageToSend;
			DatagramSocket clientSocket = new DatagramSocket();       
			InetAddress IPAddress = InetAddress.getByName(ip);       
			byte[] sendData = new byte[message.length()];       
			byte[] receiveData = new byte[message.length()];       
			String sentence =message;       
			sendData = sentence.getBytes();       
			DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, IPAddress, 7);
			clientSocket.setSoTimeout(timeout);
			clientSocket.send(sendPacket);       
			DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);       
			clientSocket.receive(receivePacket);       
			String receiveMessage = new String(receivePacket.getData());   
			clientSocket.close();
			return receiveMessage;
		}catch(Exception e){
				return null;
		}
	}
	
	public static void main(String[] args) {
		PortConnector conect=new UDPClient("192.168.207.41",7);
		String sendMessage = conect.sendMessage("hola");
		System.out.println(""+sendMessage);
	}
}
