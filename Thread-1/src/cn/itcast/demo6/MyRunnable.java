package cn.itcast.demo6;

public class MyRunnable implements Runnable{

	
	private boolean flag;
	
	public MyRunnable(boolean flag) {
		this.flag = flag;
	}
	
	@Override
	public void run() {
		if(flag){
			System.out.println("�߳�1������");
			synchronized (MyLock.locka) {
				System.out.println("�߳�1��a������");
				System.out.println("�߳�1�ȴ�b����");
				synchronized (MyLock.lockb) {
					System.out.println("�߳�1��b������");
					System.out.println("if lockb");
				}
			}
		} else {
			System.out.println("�߳�2������");
			synchronized (MyLock.lockb) {
				System.out.println("�߳�2��b������");
				System.out.println("�߳�2�ȴ�a����");
				synchronized (MyLock.locka) {
					System.out.println("�߳�2��a������");
					System.out.println("if locka");
				}
			}
		}
	}

}
