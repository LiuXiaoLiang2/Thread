package cn.itcast.demo3;

public class Cus implements Runnable{

	private Bank bank = new Bank();
	
	@Override
	public void run() {
		for(int x=0; x < 3; x++){
			bank.add(100);
		}
	}
}
