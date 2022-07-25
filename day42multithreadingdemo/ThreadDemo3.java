package day42multithreadingdemo;

public class ThreadDemo3 {

	public static void main(String[] args) {
		Thread t1= new Thread (new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Hello from thread ");
			}
		});
		t1.start();
	}

}
