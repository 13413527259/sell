package sell;

public class Run {

	public static void main(String[] args) {
		Sell sell=new Sell(1000);
		new Thread(sell).start();
		new Thread(sell).start();
		new Thread(sell).start();
		new Thread(sell).start();
		new Thread(sell).start();
		new Thread(sell).start();
		new Thread(sell).start();
		new Thread(sell).start();
	}
	
}
