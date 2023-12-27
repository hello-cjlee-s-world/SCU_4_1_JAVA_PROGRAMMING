package chap14;

public class MyThread3 extends Thread{
	@Override
	public void run() {
		System.out.println("새로운 쓰레드가 실행됩니다.");
	}
	public static void main(String[] args) {
		MyThread3 t1 = new MyThread3();
		MyThread3 t2 = new MyThread3();
		
		System.out.println("쓰레드의 이름과 ID 확인");
		System.out.println("t1 쓰레드 이름 : " + t1.getName());
		System.out.println("t2 쓰레드 이름 : " + t2.getName());
		System.out.println("t1 쓰레드 ID : " + t1.getId());
		System.out.println("t2 쓰레드 ID : " + t2.getId());
		System.out.println();
		System.out.println("쓰레드 start()");
		t1.start();
		t2.start();
		
		System.out.println();
		System.out.println("쓰레드의 이름 변경 후 확인");
		t1.setName("첫번째 쓰레드"); // 쓰레드의 이름 설정
		t2.setName("두번째 쓰레드");
		System.out.println("t1 쓰레드 이름 : " + t1.getName()); // 변경된 이름 반환
		System.out.println("t2 쓰레드 이름 : " + t2.getName());
		
	}
}
