package chap13;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamTest2 {

	public static void main(String[] args) {
		try {
			// FileInputStream 생성자에 파일 경로 입력해서 스트림 생성
			FileInputStream in = new FileInputStream("C:\\testFile1.txt");
			int i = 0; 
			while(true) { // read()메서드를 반복하여 사용하여 계속 그 다음의 데이터를 읽어옵니다.
				i = in.read();
				if(i==-1) { // read() 메서드는 읽어올 데이터가 없다면 -1을 반환합니다.
					break;
				}
				System.out.println((char)i);
			}
			System.out.println("파일 데이터를 모두 읽었습니다.");
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
