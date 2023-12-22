package chap13;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class FileReaderStreamTest {
	public static void main(String[] args) {
		char[] cbuf = new char[10]; // 최대 10개의 문자 읽어 저장
		int readCnt=0;
		Reader reader;
		
		try {
			reader = new FileReader("C:\\WriterTest.txt");
			//readCnt=reader.read(cbuf,0,cbuf.length);
			//readCnt=reader.read(cbuf,0,2);
			readCnt=reader.read(cbuf);
			for(int i=0; i<readCnt; i++) {
				System.out.println(cbuf[i]);
			}
			reader.close();
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
}
