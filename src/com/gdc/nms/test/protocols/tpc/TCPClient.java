package com.gdc.nms.test.protocols.tpc;
import java.net.*;
import java.io.*;
public class TCPClient {
   public static void main(String args[]) {
      Socket socket = null;
      try {
         socket = new Socket("192.168.208.70",7);
         DataInputStream in = new  DataInputStream(socket.getInputStream()); 
          DataOutputStream out = new DataOutputStream(socket.getOutputStream());
          out.writeUTF("hola");
          String data = in.readUTF();
          System.out.println("Received "+ data);
     } catch (UnknownHostException e) {
    	 e.printStackTrace();

          System.out.println("Sock: "+e.getMessage()); 
     } catch (EOFException e) {
    	 e.printStackTrace();

          System.out.println("EOF: "+e.getMessage());
     } catch (IOException e) {
    	 e.printStackTrace();
          System.out.println("IO:"+e.getMessage());
    } finally { if (socket != null) 
    	try { socket.close(); 
    	}catch(IOException e) {
    		}
    	}
   }
}