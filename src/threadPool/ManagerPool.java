package threadPool;

import java.math.BigDecimal;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ManagerPool implements Runnable{
	public static void main(String[] args) {
		ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(1);
		ManagerPool pool=new ManagerPool();
		newFixedThreadPool.execute(pool);
		newFixedThreadPool.shutdown();
		try {
			 newFixedThreadPool.awaitTermination(Long.MAX_VALUE, TimeUnit.NANOSECONDS);
			} catch (InterruptedException e) {
				System.out.println("ocurrio un error ");
				e.printStackTrace();
			}
		System.out.println("que size"+CortesPush.getQue().size());
		Object poll;
		while((poll = CortesPush.getQue().poll())!=null){
			System.out.println("poll"+poll);
			System.out.println("is empaty"+CortesPush.getQue().isEmpty());
			

		}
		
		System.out.println("llego al final");
	}
	
	public void publish (CutObject cut){
		CortesPush.publish(cut);
	}

	@Override
	public void run() {
		for(int i=0;i<5;i++){
			publish(new CutObject(i, "192.168.208."+i, "devicesStat", BigDecimal.ZERO, BigDecimal.TEN, "no hubo error"));

		}
		
	}
}
