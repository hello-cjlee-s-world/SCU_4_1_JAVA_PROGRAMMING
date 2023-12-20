package chap12;

import java.util.HashMap;

public class SmartPhoneHashMap {
	public static void main(String[] args) {
		// HashMap 인스턴스 생성
		HashMap<String, SmartPhone> hashMap = new HashMap<String, SmartPhone>();
		// HashMap 에 저장
		SmartPhone phone1 = new SmartPhone("lcj", "010-2222-2222");
		hashMap.put(phone1.getPhoneNumber(), phone1);
		// HashMap 에 저장
		SmartPhone phone2 = new SmartPhone("hdh", "010-3333-3333");
		hashMap.put(phone2.getPhoneNumber(), phone2);
		// HashMap 에 저장
		SmartPhone phone3 = new SmartPhone("ksd", "010-4444-4444");
		hashMap.put(phone3.getPhoneNumber(), phone3);
		
		// 요소 참조
		System.out.println(hashMap.get("010-2222-2222"));
		System.out.println(hashMap.get("010-3333-3333"));
		System.out.println(hashMap.get("010-4444-4444"));
	}
}
