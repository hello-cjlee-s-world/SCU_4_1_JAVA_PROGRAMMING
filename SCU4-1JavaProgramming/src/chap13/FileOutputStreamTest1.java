package chap13;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest1 {
	public static void main(String[] args) {
		try {
			FileOutputStream out = new 
			// 생성자에 파일 경로를 이용해서 스트림 생성		
			FileOutputStream("C:\\testFile1.txt");
			byte[] b = {65,66,67,68};
			out.write(b); // 파일 스트림을 통해 유니코드 65를 쓰기(출력)
			out.close(); // 스트림을 사용한 후에는 반드시 닫아주어야 함
			System.out.println("파일에 데이터 쓰기 성공!");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
