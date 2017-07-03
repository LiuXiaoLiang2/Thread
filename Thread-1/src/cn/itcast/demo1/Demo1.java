package cn.itcast.demo1;

public class Demo1 {

	/*
	 * 这是主线程,内部可以开启不同的子线程gfdgdgfdgdg
	 */
	public static void main(String[] args) {
		//创建ThreadDemo1线程对象,创建好一个对象,就相当于创建一个线程
		//将线程名称通过构造传递
		ThreadDemo1 thread = new ThreadDemo1("线程1");
		//启动线程,jvm虚拟机就会调用该线程的run()方法
		//一旦执行start()方法，就会开启这个子线程，就会调用run()方法执行.
		thread.start();
		 
		  
		
		//主线程仍然会执行这个main方法
		for (int i = 0; i < 40; i++) {
			System.out.println("main run---"+i);
		}
	}
}
