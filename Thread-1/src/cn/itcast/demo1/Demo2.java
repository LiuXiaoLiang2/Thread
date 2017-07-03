package cn.itcast.demo1;
/*
 * 卖票程序
 * 多个窗口同时卖票gggggggggggg
 */
public class Demo2 {

	public static void main(String[] args) {
		Ticket ticket1 = new Ticket("窗口1");
		Ticket ticket2 = new Ticket("窗口2");
		Ticket ticket3 = new Ticket("窗口3");
		Ticket ticket4 = new Ticket("窗口4");
		   
		//开启线程
		ticket1.start();
		ticket2.start();
		ticket3.start();
		ticket4.start();
		
	}
}
