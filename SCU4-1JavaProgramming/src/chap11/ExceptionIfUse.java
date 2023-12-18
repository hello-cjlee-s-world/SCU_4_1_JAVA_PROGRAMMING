package chap11;

import java.util.Scanner;

public class ExceptionIfUse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수 두개를 입력해주세요.");
		System.out.println("첫번쨰 정수 1 > ");
		int num1 = sc.nextInt();
		System.out.println("두번쨰 정수 1 > ");
		int num2 = sc.nextInt();
		if(num2==0) {// 나누는 수 num2가 0이면 메소드 종료
			System.out.println("0으로 나누기는 불가능합니다.");
			System.out.println("프로그램을 종료합니다.");
			return;
		}
		System.out.printf("num1//num2=%d", num1/num2);
	}
}
