package cn.itcast.demo2;

/*
 * ͬ����ǰ�᣺
 * 		1.�����ж���߳�
 * 		2.������ͬһ����
 * �ô���������̵߳İ�ȫ����
 * �׶ˣ�ÿ�ζ���Ҫ�ж���,������Դ
 */
public class Ticket2 implements Runnable{
	
	private int tick = 800;
	
	Object object = new Object();
	
	@Override
	public void run() {
		while(true){
			//�ڽ���ͬ�������֮ǰ���ж�object�����Ƿ���.
			//��������Ļ����޷�����ͬ�������
			//���û����,����ͬ�������,����Ҫ��������ס,���������߳̽���,ע��ʲôʱ��������ס
			//��ʱ���߳̿��Խ����ڲ������ִ��.
			//��ִ���������,�����ͻᱻ��,�������߳̽���,ע��ʲôʱ������
			//------------�����������ݵĴ���
			synchronized (object) {
				if(tick > 0){
					//ϵͳ�п���ȥִ����������
					//����ͨ��sleep��ģ��
					try {
						//ʵ����������Կ���,��ʱ˯�ߺ�(ִ��sleep����),��Ҳ�ᱻ��ס.
						//����Ҳ�ᱻռס
						//���Ǻ�wait�ķ���
						Thread.sleep(3);
						//��ʱ�Ͳ����ٵ���this.getName(),û�и÷���
						System.out.println(Thread.currentThread().getName() + "---����" + tick--);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				else {
					break;
				}
				//------------�����������ݵĴ���
			}
		}
		
	}
	
	
	
	
}
