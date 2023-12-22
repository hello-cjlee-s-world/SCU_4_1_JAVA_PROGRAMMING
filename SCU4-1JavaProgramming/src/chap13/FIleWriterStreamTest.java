package chap13;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class FIleWriterStreamTest {
	public static void main(String[] args) {
		
		String str = "String\n";
		char ch = 'A';
		char[] charArr = {'B','C'};
		Writer out = null;
		try {
			out = new FileWriter("C:\\WriterTest.txt");
			out.write(str); // 문자열을 쓸 수 있습니다.
			out.write(ch); // 문자를 쓸 수 있습니다.
			out.write(charArr); // char타입의 배열을 쓸 수 있습니다.
			
			out.close();
			System.out.println("파일에 문자들을 출력했습니다.");
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
