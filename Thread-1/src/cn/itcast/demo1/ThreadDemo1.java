package cn.itcast.demo1;

/*
 * �����̵߳ķ�ʽ1��
 * 		�̳�Thread�࣬��д�ڲ���run������
 * 		�߳�ִ�еķ�������run�����ڲ��Ĵ���
 * 		
 */
public class ThreadDemo1 extends Thread{

	
	
	public ThreadDemo1(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void run() {
		for (int i = 0; i < 60; i++) {
			//��ȡ�߳�����,��Thread���еľ�̬����
			//��ȡ��ǰ�̶߳���,�ȼ���this.
			Thread currentThread = Thread.currentThread();
			System.out.println(this.getName()+"---"+i);
		}
	}
}
