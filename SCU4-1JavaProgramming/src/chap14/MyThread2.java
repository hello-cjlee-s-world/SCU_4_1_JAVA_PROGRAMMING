package chap14;

public class MyThread2 implements Runnable{
	@Override
	public void run() {
		System.out.println("Runnable 을 이용한 새로운 쓰레드가 실행됩니다.");
	}
	public static void main(String[] args) {
		Thread t = new Thread(new MyThread2());
		t.start();
	}
}
