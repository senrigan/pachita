package com.gdc.nms.test.connectiontest;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.net.ConnectException;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.net.telnet.EchoOptionHandler;
import org.apache.commons.net.telnet.InvalidTelnetOptionException;
import org.apache.commons.net.telnet.SuppressGAOptionHandler;
import org.apache.commons.net.telnet.TelnetClient;
import org.apache.commons.net.telnet.TerminalTypeOptionHandler;
import org.apache.commons.net.telnet.WindowSizeOptionHandler;

import com.gdc.nms.server.cli.LoginException;
import com.gdc.nms.server.cli.OpenStreamReader;
import com.gdc.nms.server.cli.TelnetSession;
import com.gdc.nms.server.cli.TimeoutException;
import com.gdc.nms.test.ssh.ConectorSSH;

public class TelnetMethod {
	private String ip;

   private OpenStreamReader reader;
   private TelnetClient telnetClient;
   private PrintStream writer;
   private int timeOut=(int)TimeUnit.SECONDS.toMillis(20);
	private static  int PORT=23;
	public TelnetMethod(String ip){
		this.ip=ip;
	}
	
	public TelnetMethod(String ip,int timeout){
		this.ip=ip;
		this.timeOut=timeout;
	}
	public static String lastLine(String str) {
        int i = str.lastIndexOf("\n") + 1;
        return i == 0 ? str : str.substring(i);
    }
	
	
	@SuppressWarnings("finally")
	public boolean isConnectable() throws IOException{
		 telnetClient = new TelnetClient();
	     boolean status=false;   
		 try {
	            telnetClient.addOptionHandler(new TerminalTypeOptionHandler("VT100", false, false, true, false));
	            telnetClient.addOptionHandler(new SuppressGAOptionHandler(true, true, true, true));
	            telnetClient.addOptionHandler(new WindowSizeOptionHandler(120, 0, true, false, true, false));
	            telnetClient.addOptionHandler(new EchoOptionHandler(false, false, false, false));
	            System.out.println("empezando a conectar"+ip);
	            
	            telnetClient.connect(ip, PORT);
	            telnetClient.setSoTimeout(timeOut);

	            System.out.println("paso connect");
	            status=true;
	            
	        } catch(ConnectException e){
	        	System.out.println("la conexion "+e.getMessage());
//	        	e.printStackTrace();
	        } catch (InvalidTelnetOptionException e) {
	            e.printStackTrace();

	        } catch (SocketException e) {//el sockect esta cerrado o no se alcanza
	        	e.printStackTrace();
	           // throw new IOException(e);
	        }finally{
	        	return status;
	        }
	        
	        


	}
	
	public void connect(String user , String password){
		
	}
	
	public static void main(String[] args) {
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
		for(String ip:ips){
			TelnetMethod tecl=new TelnetMethod(ip);
			try {
				System.out.println("is conectable"+ip+" "+tecl.isConnectable());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
