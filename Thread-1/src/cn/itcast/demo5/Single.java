package cn.itcast.demo5;

/*
 * 懒汉式单例模式
 */
public class Single {

	private static Single single = null;
	
	private Single() {}
	
	//存在线程安全问题
	//可能有多个线程进入
	//这样返回对象可能不是同一个
	//这里的问题：每次都要判断锁，效率较低
	public static synchronized Single getInstance(){
		if(single == null){
			single = new Single();
		}
		return single;
	}
	
	
	//提高懒汉式效率
	//懒汉式的特点是实例延迟加载
	public static  Single getInstance2(){
		
		//使用双重循环,锁只会在刚开始的时候判断
		//后续由于single已经不为null了,也就是进不去if语句
		//也就不存在同步锁判断
		if(single == null){
			//注意在静态方法内部使用class对象锁,不能使用对象
			synchronized (Single.class) {
				if(single == null){
					single = new Single();
				}
			}
		}
		return single;
	}
}
