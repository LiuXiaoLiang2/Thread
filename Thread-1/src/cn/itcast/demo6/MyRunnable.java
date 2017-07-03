package cn.itcast.demo6;

public class MyRunnable implements Runnable{

	
	private boolean flag;
	
	public MyRunnable(boolean flag) {
		this.flag = flag;
	}
	
	@Override
	public void run() {
		if(flag){
			System.out.println("线程1进来了");
			synchronized (MyLock.locka) {
				System.out.println("线程1将a锁上了");
				System.out.println("线程1等待b锁打开");
				synchronized (MyLock.lockb) {
					System.out.println("线程1将b锁上了");
					System.out.println("if lockb");
				}
			}
		} else {
			System.out.println("线程2进来了");
			synchronized (MyLock.lockb) {
				System.out.println("线程2将b锁上了");
				System.out.println("线程2等待a锁打开");
				synchronized (MyLock.locka) {
					System.out.println("线程2将a锁上了");
					System.out.println("if locka");
				}
			}
		}
	}

}
