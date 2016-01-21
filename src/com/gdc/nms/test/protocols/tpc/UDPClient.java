package com.gdc.nms.test.protocols.tpc;
import java.net.*;
import java.io.*;
import java.net.DatagramPacket;

public class UDPClient {
   public static void main(String args[]) {
      DatagramSocket socket = null;
      try {
           socket = new DatagramSocket();
          byte[] m = args[0].getBytes();
          String ip="192.168.207.41";
          InetAddress host = InetAddress.getByName(ip);
          int port = 7;
          DatagramPacket req = new DatagramPacket(m,ip, host, port);
         socket.send(req);
         byte[] n = new byte[1000];
         DatagramPacket rep = new DatagramPacket(n, n.length);
         socket.receive(rep);
         System.out.println("Received "+ new String(rep.getData()));
     } catch (SocketException e) {
          System.out.println("Socket: "+e.getMessage()); 
    } catch (IOException e) {
          System.out.println("IO:" +e.getMessage());                                                                                  
    finally { if (socket != null) socket.close(); }
   }
}
