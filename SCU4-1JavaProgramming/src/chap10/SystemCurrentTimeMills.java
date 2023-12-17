package chap10;

public class SystemCurrentTimeMills {

	public static void main(String[] args) {
		// 작업 시작 시간을 변수에 저장
		long startTime=System.currentTimeMillis();
		for(int i=0; i<1000000000; i++) {
			int n1=1;
			int n2=10;
			int sum=n1+n2;
		}
		//작업 종료 시간을 변수에 저장
		long endTime=System.currentTimeMillis();
		//실행 시간은 종료 시간에서 시작시간을 뺴준다
		long estimatedTime=endTime-startTime;
		System.out.printf("실행 시간은 %d입니다.", estimatedTime);
	}

}
