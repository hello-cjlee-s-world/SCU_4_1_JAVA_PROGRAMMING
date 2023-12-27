package chap14;

public class MyThread4 extends Thread{
	@Override
	public void run() {
		// currentThread() 는 현재 실행되는 쓰레드 인스턴스를 반환
		System.out.println("현재 실행 쓰레드의 이름" + Thread.currentThread().getName());
		// 우선순의 기본값은 5
		System.out.println("현재 실행 쓰레드의 priority" + Thread.currentThread().getPriority());
		System.out.println();
	}
	public static void main(String[] args) {
		MyThread4 t1 = new MyThread4();
		MyThread4 t2 = new MyThread4();
		MyThread4 t3 = new MyThread4();
		
		t1.setPriority(Thread.MIN_PRIORITY); // 최소값 1로 우선순위 설정
		t2.setPriority(Thread.MAX_PRIORITY); // 최대값 10으로 우선순위 설정
		try {
			t1.start();
			t1.join();
			t2.start();
			t2.join();
			t3.start();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
