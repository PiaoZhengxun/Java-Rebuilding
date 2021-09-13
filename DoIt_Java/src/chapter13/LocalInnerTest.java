package chapter13;

class Outer {
	int outNum = 100;
	static int num = 200;
	
	Runnable getRunnable(int i ) {
		int num = 100;
		
		class MyRunnable implements Runnable {
			int localNum = 10;
			
			@Override
			public void run() {
				System.out.println(i);
				
			}
		}
		return new MyRunnable();
	}
}

public class LocalInnerTest {
	
	public static void main(String[] args) {
		Outer out = new Outer();
		Runnable runner = out.getRunnable(10);
		runner.run();
	}

}
