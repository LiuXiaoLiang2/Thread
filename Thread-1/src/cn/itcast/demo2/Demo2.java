package cn.itcast.demo2;
/*
 * 多线程存在的问题：
 * 		假设tick=1
 * 		4个线程都进入 ticket--，
 * 		就会出现-1,不合理
 * 这就是多线程的安全问题,写多线程一定要注意安全问题
 * 原因：
 * 		线程1在进入 ticket-- 的时候，cpu执行权被线程2抢走了
 * 		当多条语句在操作同一个线程共享数据时候,一个线程对多条语句只执行了一部分
 * 		还没有执行完毕,就被另一个线程抢走CPU执行权
 * 		导致了共享数据的错误
 * 
 * 解决：
 * 		线程1在执行操作共享数据的多条语句,不让其他线程抢走CPU
 * 		只有线程1在执行完毕后,线程2才能进来执行
 * 		
 * 		对于多条操作共享数据的语句,只能让一个线程执行完,其他线程才能执行
 * 		在执行过程中,其他线程不可以参与执行
 * 
 * java对于多线程安全问题提供专业解决方式：
 * 		同步代码块：
 * 		synchronized(对象){
 * 			需要被同步的代码
 * 		}
 * 		哪些代码需要同步,关键在于看哪些代码操作共享数据
 */
public class Demo2 {

	public static void main(String[] args) {
		Ticket2 ticket2 = new Ticket2();
		
		Thread thread1 = new Thread(ticket2);
		thread1.setName("窗口1");
		thread1.start();
		
		Thread thread2 = new Thread(ticket2);
		thread2.setName("窗口2");
		thread2.start();
		
		Thread thread3 = new Thread(ticket2);
		thread3.setName("窗口3");
		thread3.start();
		
		Thread thread4 = new Thread(ticket2);
		thread4.setName("窗口4");
		thread4.start();
	}
}
