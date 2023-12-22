package chap13;

import java.io.File;

public class FileTest {
	public static void main(String[] args) {
		File originFile = new File("C:\\fileClassTest.txt");
		if(originFile.exists());{
			System.out.println("원본 파일이 존재하지 않아 프로그램을 종료합니다.");
		}
		File newDir= new File("C:\\FileClassDirectory\\FileMoveTest");
		if(!newDir.exists()) {
			System.out.println("새로운 디렉터리를 생성합니다.");
			newDir.mkdir();
		}
		System.out.println("C:\\FileClassDirectory 폴더안의 파일 리스트=============================");
		File myDir=new File("C:\\FileClassDirectory");
		File[] lst = myDir.listFiles();
		for(int i=0;i<lst.length;i++) {
			if(lst[i].isDirectory()) {
				System.out.println("[DIR]");
			}else if(lst[i].isFile()) {
				System.out.println("[FILE]");
			}
			System.out.println(lst[i].getName());
		}
		System.out.println("==========================================================");
		System.out.println("파일을 FileClassDirectory 디렉토리로 이동시킵니다.");
		for(int i=0;i<lst.length;i++) {
			if(lst[i].isFile()) {
				File newFile=new File(newDir, lst[i].getName());
				lst[i].renameTo(newFile);
				System.out.println(">"+lst[i].getName()+"이 이동했습니다.");
			}
		}
		System.out.println("모든 파일이 이동했습니다.");
		System.out.println("===============C:\\FileClassDirectory 안의 파일 리스트===============");
		File[] newList = newDir.listFiles();
		for(int i=0;i<newList.length;i++) {
			if(newList[i].isDirectory()) {
				System.out.println("[DIR]");
			}else if(newList[i].isFile()) {
				System.out.println("[FILE]");
			}
			System.out.println(lst[i].getName());
		}
		
	}
}
