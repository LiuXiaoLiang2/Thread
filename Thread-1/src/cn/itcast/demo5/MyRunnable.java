package cn.itcast.demo5;

public class MyRunnable implements Runnable{

	@Override
	public void run() {
		
		//获取单例对象并打印
		//如果是单例模式对象地址值应该是一样得
		Single instance = Single.getInstance();
		System.out.println(instance);
		
	}
}
