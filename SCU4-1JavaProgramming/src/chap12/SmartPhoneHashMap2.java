package chap12;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class SmartPhoneHashMap2 {

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
		
		// keys를 for 문으로 출력
		Set<String> keys = hashMap.keySet();
		for(String s : keys) {
			System.out.println(s);
		}
		
		
		// keys 를 Iterator로 변환 후 출력
		/*Set<String> keys = hashMap.keySet();
		Iterator<String> IKeys = keys.iterator();
		while(IKeys.hasNext()) {
			System.out.println((String)IKeys.next());
		}*/
		
	}

}
