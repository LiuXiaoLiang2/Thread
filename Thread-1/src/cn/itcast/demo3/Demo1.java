package cn.itcast.demo3;
/*
 * ����
 * 		������һ�����
 * 		����������ÿ�δ�100,��3��
 * Ŀ�ģ�
 * 		�ó����Ƿ��а�ȫ���⣬��ν��
 * 
 * ��������⣺
 * 		1����ȷ��Щ�����Ƕ��߳����еĴ���
 * 		2����ȷ��������
 * 		3����ȷ���߳����д�������Щ����ǲ����˹�������
 * 
 * ͬ�������ֱ��ַ�ʽ��	
 * 		ͬ�������
 * 		ͬ������	
 */
public class Demo1 {

	public static void main(String[] args) {
		Cus cus = new Cus();
		
		//����1
		Thread t1 = new Thread(cus);
		t1.setName("����1");
		t1.start();
		
		//����2
		Thread t2 = new Thread(cus);
		t2.setName("����2");
		t2.start();
	}
}
