package chap11;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionTryMultiCatch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("정수 두개를 입력해주세요.");
			System.out.println("첫번쨰 정수 1 > ");
			int num1 = sc.nextInt();
			System.out.println("두번쨰 정수 1 > ");
			int num2 = sc.nextInt();
			System.out.printf("num1//num2=%d", num1/num2);
		} catch (ArithmeticException e) {
			System.out.println("0으로 나누기는 불가능합니다.");
			System.out.println("프로그램을 종료합니다.");
			e.getMessage();
			e.printStackTrace();
			System.exit(0);
		} catch (InputMismatchException e) {
			System.out.println("올바를 숫자를 입력하지 않았습니다.");
			System.exit(0);
		} catch (Exception e) {
			System.out.println("오류가 발생했습니다.");
			System.exit(0);
		}
		
	}

}
