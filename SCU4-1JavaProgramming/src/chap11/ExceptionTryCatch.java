package chap11;

import java.util.Scanner;

public class ExceptionTryCatch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수 두개를 입력해주세요.");
		System.out.println("첫번쨰 정수 1 > ");
		int num1 = sc.nextInt();
		System.out.println("두번쨰 정수 1 > ");
		int num2 = sc.nextInt();
		
		try {
			System.out.printf("num1//num2=%d", num1/num2);
		} catch (ArithmeticException e) {
			System.out.println("0으로 나누기는 불가능합니다.");
			System.out.println("프로그램을 종료합니다.");
			System.out.println(e.getMessage()); // 예외 인스턴스의 메소드
			e.printStackTrace();
		} 
	}
}
