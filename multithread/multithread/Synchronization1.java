/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication1;

/**
 *
 * @author ksg
 */
//import java.util.concurrent.*;
//import java.util.concurrent.locks.*;

class Printer1 {
	void print(String msg) {
		System.out.print("[");
                System.out.print(msg);
		try
		{
			Thread.sleep(1000);
		}
		catch(InterruptedException e) {
			System.out.println("Interrupted");
		}
		System.out.println("]");
	}
}

class PrintThread implements Runnable {
	String msg;
	Printer1 printer;
	Thread t;
        //static Lock lock = new ReentrantLock();

	public PrintThread(Printer1 targ,String s) {
		printer = targ;
		msg = s;
		t = new Thread(this);
		t.start();
	}

	public void run() {
            //...........
            //lock.lock();
            //try
            //{
           //synchronized (printer)
           //{
                printer.print(msg);
                //...............
           //}
           //..........
            //}
            //finally
            //{
            //    lock.unlock();
            //}
            
	}
}

public class Synchronization1 {
	public static void main(String args[]) {

		Printer1 printer = new Printer1();
                //Printer1 printer2 = new Printer1();
                //Printer1 printer3 = new Printer1();
                PrintThread ob1 = new PrintThread(printer,"Hello");
		PrintThread ob2 = new PrintThread(printer,"Synchronized");
		PrintThread ob3 = new PrintThread(printer,"World");

		//////////////////////////////////////////////////

		try {
			ob1.t.join();
			ob2.t.join();
			ob3.t.join();
		} catch(InterruptedException e) {
			System.out.println("Interrupted");
		}

                System.out.println();
	}
}