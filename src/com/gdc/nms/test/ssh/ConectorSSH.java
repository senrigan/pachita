package com.gdc.nms.test.ssh;

import java.io.IOException;

import net.schmizz.sshj.SSHClient;
import net.schmizz.sshj.transport.TransportException;
import net.schmizz.sshj.transport.verification.PromiscuousVerifier;
import net.schmizz.sshj.userauth.UserAuthException;

public class ConectorSSH {
	public static void main(String... args)
            throws IOException, InterruptedException {
        SSHClient ssh = new SSHClient();

		try{
        ssh.setConnectTimeout(10000);
        ssh.addHostKeyVerifier(new PromiscuousVerifier());
//        ssh.authPublickey("usuario");
        ssh.connect("192.168.208.70", 22);
        if(ssh.isConnected()){
        	System.out.println("cambios de shhs");
        }else{
        	System.out.println("no esta conectada al ssh");
        }
        } catch(UserAuthException e){
        	System.out.println("error usuario"+e.getMessage());
        }catch( TransportException e){
        	System.out.println("error transporte"+e.getMessage());
        }catch( IOException e){//erro que no se pudo conectar
        	System.out.println("error de entrada y salida"+e.getMessage());
//        	e.printStackTrace();
        }finally {
            ssh.disconnect();
        }
    }
}
