package cn.itcast.demo4;

/*
 * 同步函数究竟用的是哪一个锁
 * 		锁的是this,也就是当前对象ticket
 * 		这里的ticket是同一个对象,因为至始至终都是同一个ticket对象
 * 
 * 静态同步函数用户的锁不再是this
 * 因为静态是在类编译期就存在了
 * 此时静态同步函数用的锁是class对象:Ticket.class
 * class对象肯定是唯一的
 * 
 */
public class Ticket implements Runnable{
	
	private static int tick = 100;
	
	Object object = new Object();
	
	boolean flag = true;
	@Override
	public void run() {
		
		while(true){
			show();
		}
		
		
	}
	
	public static synchronized void show(){
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
	}
}
