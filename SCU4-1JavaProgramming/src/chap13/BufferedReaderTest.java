package chap13;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderTest {
	public static void main(String[] args) {
		try {
			BufferedReader in = new BufferedReader(new FileReader("C:\\WriterTest.txt"));
			String str="";
			while(true) {
				str=in.readLine();
				if(str==null)break;
				System.out.println(str);
			}
			in.close();
			System.out.println(" \n[파일 출력 완료]");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
