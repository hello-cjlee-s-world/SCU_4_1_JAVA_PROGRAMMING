package chap10;

import java.util.ArrayList;
import java.util.List;

public class StringStaticMethod {

	public static void main(String[] args) {
		// String str01 = new String.copuValueOf(char[] data
		char[] chars = {'J', 'A', 'V', 'A', ' ', 'H', 'E', 'L', 'L', 'O'};
		String str01 = String.copyValueOf(chars);
		System.out.println(str01);
		
		// String str02 = String.copyValueOf(char[] data, int offset, int count)
		String str02 = String.copyValueOf(chars, 4, 6);
		System.out.println(str02);
		
		// String str03 = String.format(Locale  l, String format, Object... args);
		// String str03 = String.format(Locale  l, Object... args);
		String str03 = String.format("%s%s", "Hello", "JAVA");
		System.out.println(str03);
		
		// String str04 = String.join(CharSequence delimiter, CharSequence... elements);
		String deli = "-";
		String s1 = "010";
		String s2 = "1234";
		String s3 = "5678";
		String str04 = String.join(deli, s1,s2,s3);
		System.out.println(str04);
		
		//String str05 = String.join(CharSequence delimiter, Iterable<? extends CharSequence> elements)
		List<String> arrays = new ArrayList<String>();
		arrays.add(s1);
		arrays.add(s2);
		arrays.add(s3);
		String str05 = String.join(deli, arrays);
		System.out.println(str05);
		
		// String.valueOf();
		System.out.println(String.valueOf("JAVA"));
		System.out.println(String.valueOf("A"));
		System.out.println(String.valueOf(chars));
		System.out.println(String.valueOf(chars,4,6));
		System.out.println(String.valueOf(1.2d));
		System.out.println(String.valueOf(1.2f));
		System.out.println(String.valueOf(100));
		System.out.println(String.valueOf(1000L));
		System.out.println(String.valueOf(new User()));
		
	}

}
