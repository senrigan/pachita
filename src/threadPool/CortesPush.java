/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package threadPool;


import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;


/**
 *
 * @author senrigan
 */
public class CortesPush {
	private static BlockingQueue<Object> queue = new LinkedBlockingQueue<Object>();


     public static synchronized void clean() {
        queue.clear();
    }

    public static synchronized void publish(CutObject o) {
        queue.offer(o);
        System.out.println("bloquinkque size"+queue.size());
    }
    
    
    public static synchronized BlockingQueue<Object> getQue(){
    	return queue;
    }
    
//    public static class Data {
//
//        int row;
//        String col;
//        String data;
//
//        public Data(int row, String col, String data) {
//            this.row = row;
//            this.col = col;
//            this.data = data;
//        }
//
//        public Data(String col, String data) {
//            this(0, col, data);
//        }
//
//        public int getRow() {
//            return this.row;
//        }
//
//        public void setRow(int row) {
//            this.row = row;
//        }
//
//        public String getCol() {
//            return this.col;
//        }
//
//        public void setCol(String col) {
//            this.col = col;
//        }
//
//        public String getData() {
//            return this.data;
//        }
//
//        public void setData(String data) {
//            this.data = data;
//        }
//    }

}
