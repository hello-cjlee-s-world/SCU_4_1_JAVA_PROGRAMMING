package chap12;

import java.util.ArrayList;

public class WrapperArrayList {

	public static void main(String[] args) {
		ArrayList<Integer> numbers = null;
		numbers = new ArrayList<Integer>();
		
		// 요소 인스턴스 저장
		numbers.add(10); // 기본형 타입 in 데이터인 10을 써도 오류가 발생하지 않음
		numbers.add(30);
		numbers.add(40);
		numbers.add(20);
		numbers.add(50);
		displayList(numbers);

	}
	static <E> void displayList(ArrayList<E> list) {
		for(E num : list) {
			System.out.println(num);
		}
	}

}
