package chap10;

public class StringBufferTest {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Hello");
		System.out.println(sb);
		System.out.println(sb.capacity()); //문자열 크기 5 + 16 => 21
		
		// 문자열 뒤로 매개변수의 인자를 붙입니다.
		sb.append("~"); // Hello~
		System.out.println(sb);
		sb.append(" JAVA"); // Hello~ JAVA
		System.out.println(sb);
		
		// StringBuffer delete(int start, int end);
		System.out.println(sb.delete(5, 7));
		
		//StringBuffer insert(int offset, 여러가지 타입);
		System.out.println(sb.insert(5, "~")); // Hello~~JAVA
		System.out.println(sb.insert(6, "~~")); // Hello~~~JAVA
		System.out.println(sb.insert(sb.length(), "!!")); // Hello~~~JAVA!!
		
		// StringBuffer reverse()
		System.out.println(sb.reverse());
	}
}
