package cn.itcast.demo2;

/*
 * 同步的前提：
 * 		1.必须有多个线程
 * 		2.必须是同一个锁
 * 好处：解决多线程的安全问题
 * 弊端：每次都需要判断锁,消耗资源
 */
public class Ticket2 implements Runnable{
	
	private int tick = 800;
	
	Object object = new Object();
	
	@Override
	public void run() {
		while(true){
			//在进入同步代码块之前会判断object对象是否被锁.
			//如果被锁的话是无法进入同步代码块
			//如果没有锁,进入同步代码块,首先要将对象锁住,不让其他线程进入,注意什么时候锁被锁住
			//此时该线程可以进入内部代码块执行.
			//当执行完代码块后,该锁就会被打开,供其他线程进入,注意什么时候锁打开
			//------------操作共享数据的代码
			synchronized (object) {
				if(tick > 0){
					//系统有可能去执行其他进程
					//这里通过sleep来模拟
					try {
						//实际上这里可以看出,及时睡眠后(执行sleep方法),锁也会被锁住.
						//对象也会被占住
						//这是和wait的方法
						Thread.sleep(3);
						//此时就不能再调用this.getName(),没有该方法
						System.out.println(Thread.currentThread().getName() + "---卖出" + tick--);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				else {
					break;
				}
				//------------操作共享数据的代码
			}
		}
		
	}
	
	
	
	
}
