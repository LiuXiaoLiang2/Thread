package cn.itcast.demo2;

/*
 * �����̵߳ĵڶ��ַ�ʽ��ʵ�ֽӿ�
 */
public class Ticket implements Runnable{
	
	private int tick = 100;
	
	
	@Override
	public void run() {
		while(tick > 0){
			//��ʱ�Ͳ����ٵ���this.getName(),û�и÷���
			System.out.println(Thread.currentThread().getName() + "---����" + tick--);
		}
	}
}
