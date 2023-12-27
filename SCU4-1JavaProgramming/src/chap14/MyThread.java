package chap14;

public class MyThread extends Thread {
	@Override
	public void run() {
		System.out.println("새로운 스레드가 실행됩니다.");
	}
	public static void main(String[] args) {
		MyThread t = new MyThread();
		t.start();
		t.start(); // 하나의 Thread 인스턴스로 두번 start() 하면 오류 발생
	} 
}
