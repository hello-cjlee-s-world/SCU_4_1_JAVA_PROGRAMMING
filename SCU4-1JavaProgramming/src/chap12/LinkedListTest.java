package chap12;

import java.util.LinkedList;

public class LinkedListTest {

	public static void main(String[] args) {
		LinkedList<Integer> numbers = null; // LinkedList <E> 타입의 참조변수 선언
		numbers = new LinkedList<Integer>(); // LinkedList <E> 타입의 인스턴스 생성
		
		// 요소 인스턴스 저장
		numbers.add(10);
		numbers.add(30);
		numbers.add(40);
		numbers.add(20);
		numbers.add(50);
		
		displayList(numbers);
	
	}
	static <E> void displayList(LinkedList<E> lst) {
		for(E num : lst) {
			System.out.println(num);
		}
	}
}
