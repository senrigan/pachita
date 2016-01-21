package com.gdc.nms.test.protocols.tpc.test;
// File Name GreetingClient.java

import java.net.*;
import java.io.*;

public class GreetingClient
{
   public static void main(String [] args)
   {
	  String ips []={
			  "187.157.72.93", "172.17.4.32", "172.17.4.16", "172.17.4.67", "172.17.4.29", "172.17.4.47",
			  "192.168.246.251", "172.17.4.78", "187.130.27.93", "172.17.4.33", "172.17.4.23", "172.17.4.20",
			  "172.17.4.36", "172.17.4.25", "172.17.4.74", "172.17.4.24", "172.17.4.42", "192.168.205.251",
			  "148.233.144.69", "172.17.4.14", "172.17.4.69", "172.17.4.38", "172.17.4.9", "172.17.4.45", 
			  "172.17.4.17", "172.17.4.13", "172.17.4.10", "172.17.4.46", "172.17.4.81", "172.17.4.50", 
			  "10.252.243.30", "172.17.4.37", "172.17.4.11", "172.17.4.41", "187.218.195.161", "172.17.4.35", 
			  "172.17.4.5", "172.17.4.49", "172.17.4.26", "172.17.4.101", "201.117.58.205", "172.17.4.72", 
			  "172.17.4.71", "172.17.4.43", "172.17.4.58", "172.17.4.21", "172.17.4.27", "187.130.61.97", "172.17.4.77", 
			  "172.17.4.44", "172.17.4.34", "172.17.4.56", "172.17.4.59", "172.17.4.40", "172.17.4.31", "172.17.4.79", "172.17.4.62",
			  "187.130.33.101", "172.17.4.7", "172.17.4.28", "172.17.4.65", "172.17.4.30", "172.17.4.8", "172.17.4.57", "187.218.218.113",
			  "187.218.222.9", "172.17.4.100", "172.17.4.80", "172.17.4.39", "172.17.4.76", "172.17.4.22", "192.168.206.251", "172.17.4.48", 
			  "172.17.4.73"
	  };
//      for(String ip:ips){
          String serverName = "192.168.208.70";

    	  int port = Integer.parseInt("7");
    	  
          try
          {
             System.out.println("Connecting to " + serverName +
    		 " on port " + port);
             Socket client = new Socket(serverName, port);
             System.out.println("Just connected to " 
    		 + client.getRemoteSocketAddress());
             OutputStream outToServer = client.getOutputStream();
             DataOutputStream out = new DataOutputStream(outToServer);
//             out.write(15);
         out.writeUTF("Hello from "
                          + client.getLocalSocketAddress());
             InputStream inFromServer = client.getInputStream();
             DataInputStream in =
                            new DataInputStream(inFromServer);
             System.out.println("Server says " + in.readUTF());
             client.close();
          }catch(IOException e)
          {
             e.printStackTrace();
          }
//      }
      
   }
}