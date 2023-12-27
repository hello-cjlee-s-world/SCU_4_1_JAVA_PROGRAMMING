package chap14;

public class JoinMethodTestMain {
	public static void main(String[] args) {
		JoinTestThread t1 = new JoinTestThread("A");
		JoinTestThread t2 = new JoinTestThread("B");
		JoinTestThread t3 = new JoinTestThread("C");
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
class JoinTestThread extends Thread{
	public JoinTestThread(String name) {
		super(name);
	}
	@Override
	public void run() {
		for(int i=0; i<5; i++) {
			System.out.println(getName()+"쓰레드 실행");
		}
	}
}
