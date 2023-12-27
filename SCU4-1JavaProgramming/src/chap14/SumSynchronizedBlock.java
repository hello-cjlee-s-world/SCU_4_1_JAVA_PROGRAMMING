package chap14;

public class SumSynchronizedBlock extends Thread{
	Sum2 s;
	long num1,num2;
	
	public SumSynchronizedBlock(Sum2 s, long num1, long num2) {
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
		Sum2 s = new Sum2();
		SumSynchronizedBlock t1 = new SumSynchronizedBlock(s,1, 500000);
		SumSynchronizedBlock t2 = new SumSynchronizedBlock(s, 500001, 1000000);
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
class Sum2{
	long sum;
	void sum(long n) {
		// 동기화 블록으로 동기화 처리
		synchronized (this) {
			sum+=n;			
		}
	}
}