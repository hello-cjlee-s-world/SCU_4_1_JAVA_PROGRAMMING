package chap14;

public class SumThreadSynchronized extends Thread{
	Sum1 s;
	long num1,num2;
	
	public SumThreadSynchronized(Sum1 s, long num1, long num2) {
		this.s=s;
		this.num1=num1;
		this.num2=num2;
	}
	@Override
	public void run() {
		for(long i=num1; i<num2; i++) {
			//System.out.print(s.sum+"\n"+Thread.currentThread().getName()+" = " + s.sum + " += " + i +", sum : ");
			s.sum(i);
		}
	}
	public static void main(String[] args) {
		Sum1 s = new Sum1();
		SumThreadSynchronized t1 = new SumThreadSynchronized(s,1, 500000);
		SumThreadSynchronized t2 = new SumThreadSynchronized(s, 500001, 1000000);
		t1.start();
		t2.start();
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("\n합의 결과는 :" + s.sum);
	}

}
class Sum1{
	long sum;
	// 메소드 앞에 synchronized 키워드를 사용해 동기화 처리
	synchronized void sum(long n) {
		sum+=n;
	}
}
