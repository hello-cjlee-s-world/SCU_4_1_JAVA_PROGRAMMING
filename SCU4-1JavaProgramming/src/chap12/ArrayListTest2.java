package chap12;

import java.util.ArrayList;

public class ArrayListTest2 {
	public static void main(String[] args) {
		ArrayList<String> players = null;
		players = new ArrayList<String>();
		
		//요소 인스턴스 저장
		players.add("손흥민");
		players.add("이강인");
		players.add("차범근");
		players.add("김민재");
		players.add(players.size(),"차두리");
		
		// 요소의 수정
		// index 2 위치의 요소를 새로운 인스턴스로 변경
		players.set(2, "정우영");
		// 차범근 --> 정우영
		displayList(players);
		
		// 요소 삭제
		// index 번호를 이용한 삭제
		// 마지막 요소 삭제
		players.remove(players.size()-1); // 차두리 삭제
		System.out.println("--------마지막 요소 삭제--------");
		displayList(players);
		// index 2 요소 삭제
		players.remove(2); // 정우영 삭제
		System.out.println("--------index 2 요소 삭제--------");
		System.out.println("현재 index 2 요소 : " + players.get(2));
		// 요소가 삭제되고 해당 index보다 하나 상위 index가 앞으로 시프트
		System.out.println("--> 요소가 삭제되고 해당 index보다 하나 큰 index값이 지워진 index로 시프트");
		displayList(players);
		// 요소 데이터를 이용한 삭제
		players.remove("김민재");
		System.out.println("---------김민재 문자열로 삭제---------");
		displayList(players);
		
		// 모든 요소 삭제
		players.clear();
		System.out.println("----------모든 요소 삭제----------");
		System.out.println("모든 요소의 개수는 "+players.size());
		
		
	}
	
	// for 반복문을 이용한 일괄처리 메소드 : 제네릭 메소드
	static <E> void displayList(ArrayList<E> list) {
		for(E player:list) {
			System.out.println(player);
		}
	}
	
}
