
public class ThreadExample {
	static int sum1;
	static int sum2;

	public static void main(String[] args) throws InterruptedException {
		int sum100 = 0;

		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run() {
				// TODO Auto-generated method stub
				for (int i = 0; i <= 50; i++) {
					sum1 += i;
				}

			}
		});

		Thread t2 = new Thread(new Runnable() {
			@Override
			public void run() {
				// TODO Auto-generated method stub
				for (int i = 51; i <= 100; i++) {
					sum2 += i;
				}
			}
		});
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();

		sum100 = sum1 + sum2;
		System.out.println(sum100);
	}
}



import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ThreadExample {
	static int sum100 = 0;
	static Lock lock = new ReentrantLock();

	public static void main(String[] args) throws InterruptedException {

		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run() {
				// TODO Auto-generated method stub
				for (int i = 1; i <= 100; i += 2) {
					synchronized (lock) {
						sum100 += i;
					}
				}
			}
		});

		Thread t2 = new Thread(new Runnable() {
			@Override
			public void run() {
				// TODO Auto-generated method stub
				for (int i = 2; i <= 100; i += 2) {
					synchronized (lock) {
						sum100 += i;
					}
				}
			}
		});

		t1.start();
		t2.start();

		t1.join();
		t2.join();
		System.out.println(sum100);
	}
}


