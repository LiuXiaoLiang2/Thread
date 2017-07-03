package cn.itcast.demo2;

/*
 * 创建线程的第二种方式，实现接口
 */
public class Ticket implements Runnable{
	
	private int tick = 100;
	
	
	@Override
	public void run() {
		while(tick > 0){
			//此时就不能再调用this.getName(),没有该方法
			System.out.println(Thread.currentThread().getName() + "---卖出" + tick--);
		}
	}
}
