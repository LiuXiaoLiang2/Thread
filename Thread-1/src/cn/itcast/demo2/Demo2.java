package cn.itcast.demo2;
/*
 * ���̴߳��ڵ����⣺
 * 		����tick=1
 * 		4���̶߳����� ticket--��
 * 		�ͻ����-1,������
 * ����Ƕ��̵߳İ�ȫ����,д���߳�һ��Ҫע�ⰲȫ����
 * ԭ��
 * 		�߳�1�ڽ��� ticket-- ��ʱ��cpuִ��Ȩ���߳�2������
 * 		����������ڲ���ͬһ���̹߳�������ʱ��,һ���̶߳Զ������ִֻ����һ����
 * 		��û��ִ�����,�ͱ���һ���߳�����CPUִ��Ȩ
 * 		�����˹������ݵĴ���
 * 
 * �����
 * 		�߳�1��ִ�в����������ݵĶ������,���������߳�����CPU
 * 		ֻ���߳�1��ִ����Ϻ�,�߳�2���ܽ���ִ��
 * 		
 * 		���ڶ��������������ݵ����,ֻ����һ���߳�ִ����,�����̲߳���ִ��
 * 		��ִ�й�����,�����̲߳����Բ���ִ��
 * 
 * java���ڶ��̰߳�ȫ�����ṩרҵ�����ʽ��
 * 		ͬ������飺
 * 		synchronized(����){
 * 			��Ҫ��ͬ���Ĵ���
 * 		}
 * 		��Щ������Ҫͬ��,�ؼ����ڿ���Щ���������������
 */
public class Demo2 {

	public static void main(String[] args) {
		Ticket2 ticket2 = new Ticket2();
		
		Thread thread1 = new Thread(ticket2);
		thread1.setName("����1");
		thread1.start();
		
		Thread thread2 = new Thread(ticket2);
		thread2.setName("����2");
		thread2.start();
		
		Thread thread3 = new Thread(ticket2);
		thread3.setName("����3");
		thread3.start();
		
		Thread thread4 = new Thread(ticket2);
		thread4.setName("����4");
		thread4.start();
	}
}
