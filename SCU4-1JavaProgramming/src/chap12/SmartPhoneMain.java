package chap12;

import java.util.HashSet;

public class SmartPhoneMain {

	public static void main(String[] args) {
		HashSet<SmartPhone> phones = new HashSet<SmartPhone>();
		
		// 요소 추가
		phones.add(new SmartPhone("Lcj", "010-0000-0000"));
		phones.add(new SmartPhone("khk", "010-1111-1111"));
		phones.add(new SmartPhone("hdh", "010-0000-0000"));
		phones.add(new SmartPhone("sjm", "010-0000-0000"));
		phones.add(new SmartPhone("kyh", "010-9999-9999"));
		
		System.out.println("요소의 개수는 " + phones.size());
		for(SmartPhone sp : phones) {
			System.out.println(sp);
		}
		
	}

}
