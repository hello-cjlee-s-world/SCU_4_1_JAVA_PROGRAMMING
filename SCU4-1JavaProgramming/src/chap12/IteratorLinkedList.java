package chap12;

import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.LinkedList;

public class IteratorLinkedList {
	public static void main(String[] args) throws ClassNotFoundException {
		LinkedList<Integer> numbers = new LinkedList<Integer>();
		
		// 요소 인스턴스 저장
		numbers.add(10);
		numbers.add(30);
		numbers.add(40);
		numbers.add(20);
		numbers.add(50);
		
		// iterator<E> 타입의 인스턴스는 collection 타입을 상속하는 class들이 iterator() 메소드를 사용하여 얻습니다.
		Iterator<Integer> itr = numbers.iterator(); 
		while(itr.hasNext()) {
			Integer integer = (Integer)itr.next();
			System.out.println(integer);
		}
		
	}
}
