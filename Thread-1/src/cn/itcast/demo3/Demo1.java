package cn.itcast.demo3;
/*
 * 需求：
 * 		银行有一个金库
 * 		有两个储户每次存100,存3次
 * 目的：
 * 		该程序是否有安全问题，如何解决
 * 
 * 如何找问题：
 * 		1、明确哪些代码是多线程运行的代码
 * 		2、明确共享数据
 * 		3、明确多线程运行代码中哪些语句是操作了共享数据
 * 
 * 同步有两种表现方式：	
 * 		同步代码块
 * 		同步函数	
 */
public class Demo1 {

	public static void main(String[] args) {
		Cus cus = new Cus();
		
		//储户1
		Thread t1 = new Thread(cus);
		t1.setName("储户1");
		t1.start();
		
		//储户2
		Thread t2 = new Thread(cus);
		t2.setName("储户2");
		t2.start();
	}
}
