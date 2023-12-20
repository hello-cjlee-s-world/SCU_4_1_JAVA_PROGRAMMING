package chap12;

import java.util.ArrayList;

public class ArrayListTest {
	public static void main(String[] args) {
		
		// ArrayList<E> 타입의 참조변수 선언
		ArrayList<String> players = null; // String 타입의 인스턴트를 저장하는 List 참조변수
		// ArrayList<E> 타입의 인스턴스 생성
		players = new ArrayList<String>(); // String 타입의 인스턴트를 저장하는 인스턴스 생성
		
		// 요소 인스턴스 저장
		players.add("손흥민"); // String 타입의 인스턴스 저장
		players.add(new String("박지성"));
		players.add(new String("이영표"));
		
		// ArrayList의 요소의 참조
		System.out.println("index-0 위치의 데이터 : " + players.get(0)); // index 0 위치의 요소 참조
		System.out.println("index-1 위치의 데이터 : " + players.get(1));
		
		// 특정 index 위치에 요소 저장
		players.add(1, new String("안정환"));
		System.out.println("inedx-1 위치에 새로운 데이터 입력");
		
		//index가 1인 위치에는 박지성이었으나 안정환으로 변경
		System.out.println("index-1 위치의 데이터 : " + players.get(1)); // index 1 위치에 인스턴스 저장
		// index가 시프트 되어 박지서이 index2의 위치로
		System.out.println("index-2 위치의 데이터 : " + players.get(2));
		// index가 시프트 되어 차범근이 index3위치로
		System.out.println("index-3 위치의 데이터 : " + players.get(3));
		
		// List<E> 인스턴스가 저장하는 요소의 개수 반환
		System.out.println("모든 플레이어는 " + players.size() +"명입니다."); 
		players.add(players.size(), "차두리"); // size()메소드의 개수는 마지막 index값에+1 한 값
		// 마지막 index는 요소의 개수-1
		int lastIndex = players.size()-1;
		// 마지막 indexㅌ 위치의 요소 참조
		String lastPlayer = players.get(lastIndex);
		
		// 마지막 index위치의 요소 출력
		System.out.println("last-index 위치의 데이터 : "+players.get(lastIndex));
		System.out.println("for 반복문을 이용해서 전체 요소를 출력합니다.");
		// for 반복문을 이용한 일괄처리		
		for(int i=0;i<players.size();i++) {
			System.out.println(players.get(i));
		}
	}
}
