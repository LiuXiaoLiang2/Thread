package cn.itcast.demo4;

/*
 * ͬ�����������õ�����һ����
 * 		������this,Ҳ���ǵ�ǰ����ticket
 * 		�����ticket��ͬһ������,��Ϊ��ʼ���ն���ͬһ��ticket����
 * 
 * ��̬ͬ�������û�����������this
 * ��Ϊ��̬����������ھʹ�����
 * ��ʱ��̬ͬ�������õ�����class����:Ticket.class
 * class����϶���Ψһ��
 * 
 */
public class Ticket implements Runnable{
	
	private static int tick = 100;
	
	Object object = new Object();
	
	boolean flag = true;
	@Override
	public void run() {
		
		while(true){
			show();
		}
		
		
	}
	
	public static synchronized void show(){
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
	}
}
