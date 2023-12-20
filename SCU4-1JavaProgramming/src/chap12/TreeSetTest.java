package chap12;

import java.util.TreeSet;

public class TreeSetTest {
	public static void main(String[] args) {
		TreeSet<Integer> treeSet = new TreeSet<Integer>();
		treeSet.add(10);
		treeSet.add(90);
		treeSet.add(30);
		treeSet.add(60);
		treeSet.add(50);
		
		for(Integer integer : treeSet) {
			System.out.println(integer);
		}
	}
}
