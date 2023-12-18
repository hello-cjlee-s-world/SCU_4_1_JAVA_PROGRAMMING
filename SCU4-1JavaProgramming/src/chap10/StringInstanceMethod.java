package chap10;

public class StringInstanceMethod {
	public static void main(String[] args) {
		String str = "Hello~";
		
		// char charAt(int index);
		System.out.println(str.charAt(0));
		System.out.println(str.charAt(5));
		
		// 문자열의 위치값을 반복문으로 뽑아내 문자열 출력
		for(int i=0; i<str.length(); i++) {
			System.out.print(str.charAt(i));
		}
		System.out.println();
		System.out.println("------------compareTo------------");
		
		// int compareTo(String anotherString);
		System.out.println(str.compareTo("Hello~"));
		System.out.println(str.compareTo("Hello~ JAVA~!!"));
		System.out.println(str.compareTo("Hello"));
		System.out.println("------------concat------------");
		// String concat(String str);
		System.out.println(str.concat(" JAVA!!"));
		System.out.println("------------contains------------");
		// Boolean contains(CharSequence s);
		System.out.println(str.contains("llO"));
		System.out.println(str.contains("fine"));
		System.out.println("------------endswith------------");
		// Boolean endswith(String suffix);
		System.out.println(str.endsWith("o~"));
		System.out.println(str.endsWith("JAVA"));
		System.out.println("------------equals------------");
		// Boolean equals(Object anObject);
		System.out.println(str.equals("Hello~"));
		System.out.println(str.equals("java"));
		System.out.println("------------indexOf------------");
		// int indexOf(int ch);
		System.out.println(str.indexOf("H"));
		System.out.println(str.indexOf("~"));
		// int indexOf(String str);
		System.out.println(str.indexOf("lo"));
		System.out.println("------------isEmpty------------");
		//Boolean isEmpty();
		System.out.println(str.isEmpty());
		System.out.println("".isEmpty());
		System.out.println("------------length------------");
		// int length()
		System.out.println(str.length());
		System.out.println("JAVA".length());
		System.out.println("------------replace------------");
		// String replace(char oldChar, char newChar);
		System.out.println(str.replace("~","!"));
		// String replace(charSequence target, charSequence replacement);
		System.out.println(str.replace("Hello", "JAVA")); 
		System.out.println("------------startsWith------------");
		System.out.println(str.startsWith("He"));
		System.out.println(str.startsWith("JAVA"));
		System.out.println("------------substring------------");
		System.out.println(str.substring(2));
		System.out.println(str.substring(2,4));
		System.out.println("------------toCharArray------------");
		char[] chars = str.toCharArray();
		System.out.println(chars[1]);
		System.out.println("------------toString------------");
		System.out.println(str.toString());
		System.out.println("------------trim------------");
		str=" Hello Java ";
		System.out.println(str);
		System.out.println(str.trim());

	}
}
