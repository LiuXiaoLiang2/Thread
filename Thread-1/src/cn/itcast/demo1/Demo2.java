package cn.itcast.demo1;
/*
 * ��Ʊ����
 * �������ͬʱ��Ʊgggggggggggg
 */
public class Demo2 {

	public static void main(String[] args) {
		Ticket ticket1 = new Ticket("����1");
		Ticket ticket2 = new Ticket("����2");
		Ticket ticket3 = new Ticket("����3");
		Ticket ticket4 = new Ticket("����4");
		   
		//�����߳�
		ticket1.start();
		ticket2.start();
		ticket3.start();
		ticket4.start();
		
	}
}
