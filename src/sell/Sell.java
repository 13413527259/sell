package sell;

public class Sell implements Runnable {

	private int no;

	public Sell() {
	}

	public Sell(int no) {
		this.no = no;
	}

	public void del() {
		no--;
	}

	@Override
	public void run() {
		while (true) {
			synchronized (this) {
				if (no > 0) {
					System.out.println(Thread.currentThread().getName() + "*****" + no);
					del();
				} else {
					return;
				}
			}
		}
	}

}
