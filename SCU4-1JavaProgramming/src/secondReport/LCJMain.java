package secondReport;

import java.text.ParseException;
import java.util.Scanner;

public class LCJMain {

	public static void main(String[] args) throws ParseException {
		LCJ lcj = new LCJ("LCJ","11111111","LCJ@naver.com","19040910");
		Scanner sc = new Scanner(System.in);
		int button=0;
		try {
			button = sc.nextInt();
		} catch(Exception e) {
			System.out.println("입력도중 문제가 생겼습니다. 1 혹은 2번 숫자를 입력해주세요..");
			System.exit(1);
		}
		switch (button) {
		case 1:
			lcj.printNameEamil();
			break;
		case 2:
			lcj.printBirth();
			break;
		default:
			System.out.println("1, 2번 중에 하나를 선택해주세요");
			break;
		}
	}

}

