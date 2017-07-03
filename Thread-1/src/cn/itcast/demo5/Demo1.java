package cn.itcast.demo5;
/*
 * 单例设计模式
 * 	饿汉式:
 * 		class Single{
 * 			private static single s = new Single();
 * 			private Single(){}
 * 			public static Single getSingle(){
 * 				return s;
 * 			}
 * 
 */
public class Demo1 {

	public static void main(String[] args) {
		MyRunnable myRunnable = new MyRunnable();
		
		Thread t1 = new Thread(myRunnable);
		t1.start();
		
		Thread t2 = new Thread(myRunnable);
		t2.start();
	}
	
}
