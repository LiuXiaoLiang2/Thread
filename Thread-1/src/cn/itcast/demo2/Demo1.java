package cn.itcast.demo2;
/*
 * 创建线程的第二种方式
 * 
 * 步骤：
 * 		1.定义类实现Runnable借口
 * 		2.覆盖Runnable中的run方法,将线程要运行的代码存储在该润方法中
 * 		3.通过Thread类创建对象.
 * 		4.将Runnable接口的子类对象作为参数传递给Thread累的构造函数中
 * 		5.这样线程启动的时候,就会执行Runnable接口实现类的run方法
 * 
 * 两种方式的区别：
 * 		1.java只支持单继承,一旦继承了业务上的父类,就不能继承Thread类
 * 		2.所以可以实现接口Runnable，也就是第二种方式
 * 		避免了单继承的局限性
 * 		在定义线程的时候常用第二种方式
 */
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
