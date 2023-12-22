package chap13;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamTest1 {

	public static void main(String[] args) {
		try {
			// FileInputStream 생성자에 파일 경로 입력해서 스트림 생성
			FileInputStream in = new FileInputStream("C:\\testFile1.txt");
			int i = in.read(); // read() 메서드를 이용해서 바이트 단위의 데이터 읽기, 한번에 하나만 읽을 수 있다.
			System.out.println(i);
			System.out.println((char)i);
			System.out.println("파일 데이터 하나를 읽었습니다.");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
