package cn.itcast.demo1;

public class Ticket extends Thread{
	
	//�������̹߳���һ��tick
	private static int tick = 100;
	
	
	
	public Ticket(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}



	@Override
	public void run() {
		while(tick > 0){
			System.out.println(this.getName() + "---����" + tick--);
		}
	}
	
	
	
	
}
