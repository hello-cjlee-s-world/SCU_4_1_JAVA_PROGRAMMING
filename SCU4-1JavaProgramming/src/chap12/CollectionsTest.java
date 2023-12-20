package chap12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import javax.sql.rowset.serial.SQLOutputImpl;

public class CollectionsTest {

	public static void main(String[] args) {
		List<Integer> lottoNumber = new ArrayList<Integer>();
		
		for(int i=0;i<6;i++) {
			lottoNumber.add(new Random(System.nanoTime()).nextInt(45)+1);
		}
		
		System.out.println("원본 리스트");
		displayList(lottoNumber);
		System.out.println();
		
		System.out.println("최대값 " + Collections.max(lottoNumber));
		System.out.println("최소값 " + Collections.min(lottoNumber));
		
		System.out.println();
		System.out.println("---------------오름차순 정렬---------------");
		Collections.sort(lottoNumber);
		displayList(lottoNumber);
		System.out.println("---------------내림차순 정렬---------------");
		Collections.reverse(lottoNumber);
		displayList(lottoNumber);
		System.out.println("---------------다시 섞기---------------");
		Collections.shuffle(lottoNumber);
		displayList(lottoNumber);
		
		List<Integer> list1 = Collections.emptyList();
		List<Integer> list2 = Collections.emptyList();
	}
	
	
	static <E> void displayList(List<E> lst) {
		for(E e:lst) {
			System.out.println(e);
		}
	}
}
