package cn.itcast.demo4;

public class Demo1 {

	
	public static void main(String[] args) {
		
		//将线程运行的代码存储在run方法中
		Ticket ticket1 = new Ticket();
		
		//将ticket1对象传递thread中,注意：只有thread有start,run方法
		//这样在不同的线程中实际上操作的是同一个对象
		//可以很好的解决不同线程共享同一个对象的问题
		//关键在于thread有一种构造方法,传入的参数是Runnable的实现类
		Thread thread1 = new Thread(ticket1);
		thread1.setName("窗口1");
		thread1.start();
		
		Thread thread2 = new Thread(ticket1);
		thread2.setName("窗口2");
		thread2.start();
		
		Thread thread3 = new Thread(ticket1);
		thread3.setName("窗口3");
		thread3.start();
		
		Thread thread4 = new Thread(ticket1);
		thread4.setName("窗口4");
		thread4.start();
	}
}
