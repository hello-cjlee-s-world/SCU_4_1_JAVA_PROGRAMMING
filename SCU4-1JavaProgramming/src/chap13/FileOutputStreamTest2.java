package chap13;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest2 {

	public static void main(String[] args) {
		try {
			FileOutputStream out = new 
			// 생성자에 파일 경로를 이용해서 스트림 생성		
			FileOutputStream("C:\\testFile2.txt");
			String s = "Hi~!";
			byte b[] = s.getBytes(); // 문자열을 byte타입으로 변환
			out.write(b); // byte 배열을 이용해 파일 출력
			out.close(); // 스트림을 사용한 후에는 반드시 닫아주어야 함
			System.out.println("파일에 데이터 쓰기 성공!");
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
