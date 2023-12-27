package chap13;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializableTest {
	public static void main(String[] args) {
		Person person = new Person("lcj",30);
		String msg = "안녕하세요";
		try {
			ObjectOutputStream outputStream=null;
			FileOutputStream out = new FileOutputStream("instance.ser");
			outputStream=new ObjectOutputStream(out);
			outputStream.writeObject(person);
			outputStream.writeObject(msg);
			 
			ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("instance.ser"));
			Person newPerson = (Person)inputStream.readObject();
			String newStr = (String)inputStream.readObject();
			
			newPerson.tell();
			System.out.println(newStr);
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
