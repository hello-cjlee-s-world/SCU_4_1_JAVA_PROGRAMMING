package chap13;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileTransferBufferedFilterTest {
	public static void main(String[] args) {
		try {
			// 기본 스트림으로 필터 인풋 스트림을 생성
			InputStream in = new FileInputStream("C:\\testFile1.txt");
			BufferedInputStream bin = new BufferedInputStream(in);
			
			// 기본 스트림으로 필터 아웃풋 스트림을 생성
			OutputStream out = new FileOutputStream("C:\\Users\\\\cndwn\\Desktop\\testFileTransfered.txt");
			BufferedOutputStream bout = new BufferedOutputStream(out);
			
			int byteData = 0;
			
			while(true) {
				byteData = bin.read();
				if(byteData==-1) {
					break;
				}
				bout.write(byteData);
			}
			in.close();
			out.close();
			System.out.println("파일 복사가 완료되었습니다.");
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
