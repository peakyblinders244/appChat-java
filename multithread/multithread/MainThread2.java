
class ChildThread extends Thread {
	ChildThread() {
	
		super("Child Thread");
		System.out.println("Child thread: " + this);
		//start(); 
	}
	
	public void run() {
		try {
			for(int i = 0; i <= 10; i++) {
				System.out.println("Value from child thread: " + i);
				Thread.sleep(500);
			}
		} catch (InterruptedException e) {
			System.out.println("Error from child thread !");
		}
		System.out.println("Exiting child thread.");
	}
	
}






class MainThread2 {
	public static void main(String args[]) {
		
		ChildThread ct = new ChildThread();
		
		//////////////////////////////
		
		ct.start();
		//ct.setPriority(2);
			
		try {
			for(int i = 0; i <= 10; i++) {
				System.out.println("Value from main thread : " + i);
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			System.out.println("Error from main thread  !");
		}
		System.out.println("Finish!");
	}
}
