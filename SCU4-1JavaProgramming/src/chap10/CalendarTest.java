package chap10;

import java.util.Calendar;

public class CalendarTest {

	public static void main(String[] args) {
		Calendar cal1 = Calendar.getInstance(); // Calendar 클래스의 객체를 받음.
		System.out.println(cal1.getTime()); // 날짜 시간정보 반환
		
		cal1.add(Calendar.HOUR, 1); // 현재 시간에서 1시간 증가 처리
		System.out.println(cal1.getTime());
		
		cal1.add(Calendar.DAY_OF_MONTH, 1); // 현재 시간에서 1일 증가 처리
		System.out.println(cal1.getTime());
		
		Calendar cal2 = Calendar.getInstance();
		Calendar cal3 = Calendar.getInstance();
		
		cal2.set(2000, 4, 19); // 날짜와 시간 정보 출력
		cal2.set(2000, 6, 20); // 날짜와 시간 정보 출력
		
		// cal 끼리 시간 비교
		System.out.println("cal1은 cal2보다 이전인가요? " + cal1.before(cal2)); // cal1이 cal2 보다 이전 시간인지 체크
		System.out.println("cal1은 cal3보다 이전인가요? " + cal1.before(cal3)); // cal1이 cal3 보다 이전 시간인지 체크
		System.out.println("cal1은 cal2보다 이후인가요? " + cal1.after(cal2)); // cal1이 cal2 보다 이후 시간인지 체크
		System.out.println("cal1은 cal2보다 이후인가요? " + cal1.after(cal3)); // cal1이 cal3 보다 이후 시간인지 체크
		
		
		// Calendar 객체의 필드값 가져오기
		System.out.println(cal1.getTime());
		System.out.println(cal1.get(Calendar.DAY_OF_WEEK));
		System.out.println(cal1.get(Calendar.MONTH)+1);
		System.out.println(cal1.get(Calendar.DAY_OF_MONTH));
		System.out.println(cal1.get(Calendar.HOUR_OF_DAY));
		System.out.println(cal1.get(Calendar.MINUTE));
		System.out.println(cal1.get(Calendar.SECOND));
		System.out.println(cal1.get(Calendar.YEAR));
		
		Calendar cal4 = Calendar.getInstance();
		System.out.println(cal4.getTime());
		
		cal4.set(Calendar.YEAR, 2040);
		System.out.println(cal4.getTime());
		
		cal4.set(2002, 4, 20); // 1은 2월을 나타냄
		System.out.println(cal4.getTime());
		
		cal4.set(2002, 4, 20, 21, 30, 01);
		System.out.println(cal4.getTime());
		

	}

}
