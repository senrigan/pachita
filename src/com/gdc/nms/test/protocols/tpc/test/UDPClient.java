package com.gdc.nms.test.protocols.tpc.test;
import java.io.*; import java.net.*; 
public class UDPClient {    
	public static void main(String args[])   
	{  	try{
			BufferedReader inFromUser =new BufferedReader(new InputStreamReader(System.in));      
			DatagramSocket clientSocket = new DatagramSocket();
			  
			InetAddress IPAddress = InetAddress.getByName("192.168.207.41");       
			byte[] sendData = new byte[1024];       
			byte[] receiveData = new byte[1024];       
			String sentence = inFromUser.readLine(); 
			System.out.println("sentencia a enviar"+sentence);
			sendData = sentence.getBytes();       
			DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, IPAddress,7);       
			clientSocket.send(sendPacket);       
			DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);       
			clientSocket.receive(receivePacket);       
			String modifiedSentence = new String(receivePacket.getData());       
			System.out.println("FROM SERVER:" + modifiedSentence);      
			clientSocket.close();    
		}catch(SocketException e){
			e.printStackTrace();
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
}
