package cn.itcast.demo1;

public class Demo1 {

	/*
	 * �������߳�,�ڲ����Կ�����ͬ�����߳�gfdgdgfdgdg
	 */
	public static void main(String[] args) {
		//����ThreadDemo1�̶߳���,������һ������,���൱�ڴ���һ���߳�
		//���߳�����ͨ�����촫��
		ThreadDemo1 thread = new ThreadDemo1("�߳�1");
		//�����߳�,jvm������ͻ���ø��̵߳�run()����
		//һ��ִ��start()�������ͻῪ��������̣߳��ͻ����run()����ִ��.
		thread.start();
		 
		  
		
		//���߳���Ȼ��ִ�����main����
		for (int i = 0; i < 40; i++) {
			System.out.println("main run---"+i);
		}
	}
}
