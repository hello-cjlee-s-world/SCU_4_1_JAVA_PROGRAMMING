package chap14;

public class SleepMethodTestMain {
	public static void main(String[] args) {
		SleepTestThread thread1 = new SleepTestThread("A");
		SleepTestThread thread2 = new SleepTestThread("B");
		thread1.start();
		thread2.start();
	}
}
class SleepTestThread extends Thread {
	public SleepTestThread(String name) {
		super(name);
	}
	@Override
		public void run() {
			for(int i=1; i<5; i++) {
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println(getName()+"쓰레드 실행"+i);
			}
		}
}
