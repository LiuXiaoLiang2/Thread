package cn.itcast.demo5;

public class MyRunnable implements Runnable{

	@Override
	public void run() {
		
		//��ȡ�������󲢴�ӡ
		//����ǵ���ģʽ�����ֵַӦ����һ����
		Single instance = Single.getInstance();
		System.out.println(instance);
		
	}
}
