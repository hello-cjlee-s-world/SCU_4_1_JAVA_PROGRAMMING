package chap13;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileTransferTest2 {

	public static void main(String[] args) {
		try {
			// 복사할 원본 데이터
			InputStream in = new FileInputStream("C:\\testFile1.zip");
			// 복사해서 옮길 위치의 스트림 객체 생성
			OutputStream out = new FileOutputStream("C:\\testFileTransfered.zip");
			int copyByte = 0;
			int byteDataSize = 0; // 복사한 파일의 사이즈
			
			// 2kb사이즈의 배열 생성, 배열에 2kb 데이터를 저장해서 복사
			byte[] bufData = new byte[1024*2];
			while(true) {
				byteDataSize=in.read(bufData);
				if(byteDataSize==-1) break;
				out.write(bufData,0,byteDataSize);
				copyByte+=byteDataSize; // 복사한 바이트 사이즈 증가 연산
			}
			in.close();
			out.close();
			System.out.println(copyByte + "byte 파일 복사가 완료되었습니다.");
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
