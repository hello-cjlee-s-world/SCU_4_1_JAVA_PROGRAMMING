package chap10;

import java.util.Date;

public class DateTest {
	public static void main(String[] args) {
		Date now = new Date();
		System.out.println("현재시간 : " + now);
		
		// 밀리초로 계산한 값을 long 형태의 값으로 반환
		System.out.println(now.getTime());
		
		// long타입의 데이터로 Date 인스턴스 생성
		Date date = new Date(1587317838379L);
		System.out.println("date의 시간 : "+ date);
		
		System.out.println(now.toString());
		System.out.println(date.toString());
	}
}
