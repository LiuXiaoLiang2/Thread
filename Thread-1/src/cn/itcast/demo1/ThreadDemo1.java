package cn.itcast.demo1;

/*
 * 创建线程的方式1：
 * 		继承Thread类，重写内部的run方法。
 * 		线程执行的方法就是run方法内部的代码
 * 		
 */
public class ThreadDemo1 extends Thread{

	
	
	public ThreadDemo1(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void run() {
		for (int i = 0; i < 60; i++) {
			//获取线程名称,是Thread类中的静态方法
			//获取当前线程对象,等价于this.
			Thread currentThread = Thread.currentThread();
			System.out.println(this.getName()+"---"+i);
		}
	}
}
