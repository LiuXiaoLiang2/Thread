package cn.itcast.demo6;
/*
 * 
 * �����Ĳ�����
 * 		��Ƕ����
 */
public class Demo {

	public static void main(String[] args) {
		new Thread(new MyRunnable(true)).start();
		new Thread(new MyRunnable(false)).start();
	}
}
