package chap11;

import java.util.Scanner;

public class ThrowExceptionTest2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("국어점수를 입력하세요.");
		int score = sc.nextInt();
		
		try {
			if(!(score>=0 && score<100)) {
				BadInputException e = new BadInputException(); // 예외 인스턴스 생성
				throw e; // 강제로 예외 발생 : 가상 머신에 예외 발생 알림
			}
		} catch (BadInputException e) {
			e.printStackTrace();
		}

	}

}
