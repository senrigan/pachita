package com.gdc.nms.test.protocols.tpc.test;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

import com.sun.net.httpserver.HttpServer;

public class DateServer {

    /**
     * Runs the server.
     */
    public static void main(String[] args) throws IOException {
    	
    	HttpServer create = HttpServer.create(new InetSocketAddress(1234), 0);
    	create.start();
    	
//    	if(true)
//    		System.exit(1);
//    	ServerSocket socket = new ServerSocket(9999);
//    	
//    	DataInputStream dIn = new DataInputStream(socket.);
//
//    			boolean done = false;
//    			while(!done) {
//    			  byte messageType = dIn.readByte();
//
//    			  switch(messageType)
//    			  {
//    			  case 1: // Type A
//    			    System.out.println("Message A: " + dIn.readUTF());
//    			    break;
//    			  case 2: // Type B
//    			    System.out.println("Message B: " + dIn.readUTF());
//    			    break;
//    			  case 3: // Type C
//    			    System.out.println("Message C [1]: " + dIn.readUTF());
//    			    System.out.println("Message C [2]: " + dIn.readUTF());
//    			    break;
//    			  default:
//    			    done = true;
//    			  }
//    			}
//
//    			dIn.close();
    }
}