package chap13;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;

public class FileTransferTest1 {

	public static void main(String[] args) {
		try {
			// 복사할 원본 데이터
			InputStream in = new FileInputStream("C:\\testFile1.txt");
			// 복사해서 옮길 위치의 스트림 객체 생성
			OutputStream out = new FileOutputStream("C:\\testFileTransfered.txt");
			int byteData=0; // 읽어올 데이터를 저장할 변수
			while(true) {
				byteData=in.read();
				if(byteData==-1) break;
				out.write(byteData);
			}
			in.close();
			out.close();
			System.out.println("파일 복사가 완료되었습니다.");
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
