package cn.itcast.demo4;

public class Demo1 {

	
	public static void main(String[] args) {
		
		//���߳����еĴ���洢��run������
		Ticket ticket1 = new Ticket();
		
		//��ticket1���󴫵�thread��,ע�⣺ֻ��thread��start,run����
		//�����ڲ�ͬ���߳���ʵ���ϲ�������ͬһ������
		//���ԺܺõĽ����ͬ�̹߳���ͬһ�����������
		//�ؼ�����thread��һ�ֹ��췽��,����Ĳ�����Runnable��ʵ����
		Thread thread1 = new Thread(ticket1);
		thread1.setName("����1");
		thread1.start();
		
		Thread thread2 = new Thread(ticket1);
		thread2.setName("����2");
		thread2.start();
		
		Thread thread3 = new Thread(ticket1);
		thread3.setName("����3");
		thread3.start();
		
		Thread thread4 = new Thread(ticket1);
		thread4.setName("����4");
		thread4.start();
	}
}
