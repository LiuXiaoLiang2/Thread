package cn.itcast.demo3;

public class Bank {

	private int sum = 0;
	
	//这部分代码是多个线程操作共享资源:sum
	//可以直接在方法上面加上同步关键字
	//这个实际上是同步函数
	//在整个函数上加同步
	//同步代码块是用户封装代码的,使用synchronized关键字
	//同步函数，实际上就是函数内部代码同步起来
	public synchronized void add(int n){
		sum = sum + n;
		try {
			Thread.sleep(10);
			System.out.println("sum="+sum);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
