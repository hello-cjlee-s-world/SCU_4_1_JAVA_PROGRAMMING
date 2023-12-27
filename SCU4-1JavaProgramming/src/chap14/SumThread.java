package chap14;

public class SumThread extends Thread{
	Sum s;
	long num1, num2;
	public SumThread(Sum s, long num1, long num2) {
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
		Sum s = new Sum();
		SumThread t1 = new SumThread(s,1, 500000);
		SumThread t2 = new SumThread(s, 500001, 1000000);
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
class Sum{
	long sum;
	void sum(long n) {
		sum+=n;
	}
}
