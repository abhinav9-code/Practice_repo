package java_practice;

public class MultiThreading_ThreadClass {

	public static void main(String[] args) {
		
		int n = 8;
		
		for (int i=0; i<n;i++) {
			 
		MultiThreadingDemo dm = new MultiThreadingDemo();
		dm.start();
		}
		
		
		
		}

	}

class MultiThreadingDemo extends Thread {
	
	public void run() {
		
		try {
			
			System.out.println("thread running is: " + Thread.currentThread().getId());
		}
		
		catch(Exception e) {
			
			System.out.println("exception was caught");
		}
	}
	
	
}
