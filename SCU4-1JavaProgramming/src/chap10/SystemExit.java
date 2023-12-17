package chap10;

import java.util.Scanner;

public class SystemExit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			int num = sc.nextInt();
			if(num==0){
				System.out.println("콘솔에 텍스트를 출력합니다.");
			}else if(num==1){
				break;
			}else if(num==2) {
				System.out.println("프로그램을 현재 상태에서 바로 저장합니다.");
				System.exit(0); // 현재 프로세스를 종료
			}
		}
		System.out.println("반복문이 종료되었습니다.");
	}
}
