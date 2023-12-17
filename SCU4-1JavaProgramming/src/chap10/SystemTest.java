package chap10;

import java.util.Scanner;

public class SystemTest {

	public static void main(String[] args) {
		// 자바 가상머신의 기본 입력 스트림을 인자로 전달.
		Scanner sc=new Scanner(System.in);
		try {
			//표준 입력을 받는다.
			while(true) {
				System.out.println("숫자를 입력해주세요.");
				int num=sc.nextInt();
				System.out.printf("입력한 숫자는 %d입니다.", num);
			}
		}catch (Exception e) {
			// 에러 발생시 에러 출력
			System.out.println(e);
		}
		System.out.println("------------------------");
		System.out.println("프로그램을 종료합니다.");
		sc.close();
	}

}
