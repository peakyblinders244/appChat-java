
class MyThread {
	public static void main(String args[]) {
		
		Thread t;
		t = Thread.currentThread();
		
		System.out.println("My current name: " + t);
		
		t.setName("TTTTT");
		System.out.println("My new name: " + t);
		
		try 
		{
			int i;
			
			for(i = 1; i <=5; i++) 
			{
				System.out.println("Value : " + i);
				Thread.sleep(3000);
			}
			
		} catch (InterruptedException iex) {
			System.out.println(iex.getMessage());
		}
	}
}
