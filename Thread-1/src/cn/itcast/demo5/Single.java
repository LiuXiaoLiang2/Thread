package cn.itcast.demo5;

/*
 * ����ʽ����ģʽ
 */
public class Single {

	private static Single single = null;
	
	private Single() {}
	
	//�����̰߳�ȫ����
	//�����ж���߳̽���
	//�������ض�����ܲ���ͬһ��
	//��������⣺ÿ�ζ�Ҫ�ж�����Ч�ʽϵ�
	public static synchronized Single getInstance(){
		if(single == null){
			single = new Single();
		}
		return single;
	}
	
	
	//�������ʽЧ��
	//����ʽ���ص���ʵ���ӳټ���
	public static  Single getInstance2(){
		
		//ʹ��˫��ѭ��,��ֻ���ڸտ�ʼ��ʱ���ж�
		//��������single�Ѿ���Ϊnull��,Ҳ���ǽ���ȥif���
		//Ҳ�Ͳ�����ͬ�����ж�
		if(single == null){
			//ע���ھ�̬�����ڲ�ʹ��class������,����ʹ�ö���
			synchronized (Single.class) {
				if(single == null){
					single = new Single();
				}
			}
		}
		return single;
	}
}
