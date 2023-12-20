package chap12;

import java.util.HashSet;

public class HashSetTest {

	public static void main(String[] args) {
		// Hashset<E> 생성
		HashSet<String> set = new HashSet<String>();
		
		//요소 저장
		set.add("손흥민");
		set.add("이강인");
		set.add("박지성");
		set.add("손흥민"); // 같은 문자열은 저장되지 않
		set.add("이강인");
		
		System.out.println("HashSet<String> 요소의 개수는" + set.size());
		
		for(String s : set) {
			System.out.println(s); 
		}
		
	}

}
