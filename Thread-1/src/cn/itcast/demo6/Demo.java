package cn.itcast.demo6;
/*
 * 
 * ËÀËøµÄ²úÉú£º
 * 		ËøÇ¶Ì×Ëø
 */
public class Demo {

	public static void main(String[] args) {
		new Thread(new MyRunnable(true)).start();
		new Thread(new MyRunnable(false)).start();
	}
}
