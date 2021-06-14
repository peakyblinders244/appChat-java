class ChildThread implements Runnable {
	String name; 
	Thread t;
	
	ChildThread(String threadname) {
		name = threadname;
		t = new Thread(this, name);
		System.out.println("New thread: " + t);
		t.start();
	}

	public void run() {
		try {
			for(int i = 0; i <= 10; i++) {
				System.out.println(name + ": " + i);
				Thread.sleep(200);
			}
		} catch (InterruptedException e) {
			System.out.println(name + " interrupted.");
		}
		System.out.println(name + " exiting.");
	}
}



class MainThread4 {
	public static void main(String args[]) {
		ChildThread t1 = new ChildThread("T1");
		ChildThread t2 = new ChildThread("T2");
		ChildThread t3 = new ChildThread("T3");
		
		System.out.println("Thread 1 is alive: " + t1.t.isAlive());
		System.out.println("Thread 2 is alive: " + t2.t.isAlive());
		System.out.println("Thread 3 is alive: " + t3.t.isAlive());

		try {
			System.out.println("Waiting for threads to finish.");
			t1.t.join();
			
			t2.t.join();
			t3.t.join();
			
		} catch (InterruptedException e) {
			System.out.println("Main thread Interrupted");
		}
		
		System.out.println("Thread 1 is alive: " + t1.t.isAlive());
		System.out.println("Thread 2 is alive: " + t2.t.isAlive());
		System.out.println("Thread 3 is alive: " + t3.t.isAlive());
		System.out.println("Main thread exiting.");
	}
}