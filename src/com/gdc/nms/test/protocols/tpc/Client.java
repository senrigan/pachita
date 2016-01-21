package com.gdc.nms.test.protocols.tpc;

import java.lang.* ;
import java.io.* ;
import java.net.* ;
import java.util.* ;
public class Client {
	public static void main ( String [] args)
	{
		System.out.println("args"+args.length);
		int res;
		int num[] = new int[2];
//		if (args.length != 1) {
//			System.out.println("Uso: cliente <host>");
//			System.exit(0);
//		}
		try { // se crea la conexión
			String host = "192.168.207.41";
			Socket sc = new Socket(host, 7); // conexión
			OutputStream ostream = sc.getOutputStream();
			ObjectOutput s = new ObjectOutputStream(ostream);
			num[0] = 5; num[1] = 2; //prepara la petición
			s.writeObject(num);
			s.flush();
			DataInputStream istream = new DataInputStream(sc.getInputStream());
			res = istream.readInt();
			sc.close();
			System.out.println("La suma es " + res);
		}
		catch (Exception e){
			System.err.println("excepcion " + e.toString() );
			e.printStackTrace() ;
		}
	}
}