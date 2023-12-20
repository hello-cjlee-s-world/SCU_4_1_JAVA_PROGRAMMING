package chap12;

import java.util.TreeSet;

public class SmartPhoneTreeSet {
	public static void main(String[] args) {
		TreeSet<SmartPhone> phones = new TreeSet<SmartPhone>();
		
		// 요소 추가
		phones.add(new SmartPhone("Lcj", "010-0000-0000"));
		phones.add(new SmartPhone("khk", "010-1111-1111"));
		phones.add(new SmartPhone("hdh", "010-0000-0000"));
		phones.add(new SmartPhone("sjm", "010-0000-0000"));
		phones.add(new SmartPhone("kyh", "010-9999-9999"));
				
		for(SmartPhone sp : phones) {
			System.out.println(sp);
		}
	}
}
