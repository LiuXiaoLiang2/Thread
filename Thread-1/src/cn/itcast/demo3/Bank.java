package cn.itcast.demo3;

public class Bank {

	private int sum = 0;
	
	//�ⲿ�ִ����Ƕ���̲߳���������Դ:sum
	//����ֱ���ڷ����������ͬ���ؼ���
	//���ʵ������ͬ������
	//�����������ϼ�ͬ��
	//ͬ����������û���װ�����,ʹ��synchronized�ؼ���
	//ͬ��������ʵ���Ͼ��Ǻ����ڲ�����ͬ������
	public synchronized void add(int n){
		sum = sum + n;
		try {
			Thread.sleep(10);
			System.out.println("sum="+sum);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
