package day42multithreadingdemo;

public class ThreadDemo1 extends Thread { // kunai pani class ko thread bannu xa vane child bannu paryo so ...
	@Override
	public void run() {
		System.out.println("Hello from thread ");
	}

	// java hami object banauxau teslai new state vanxa .java hami method call garxau teslai runnable state vanxa 
	public static void main(String[] args) {
		ThreadDemo1 t1= new ThreadDemo1();
		ThreadDemo1 t2= new ThreadDemo1();
		ThreadDemo1 t3= new ThreadDemo1();
		
		t1.start(); // yaha start method lae run lai internally call garxa 
		t2.start();
		t3.start();
		
	}
}
