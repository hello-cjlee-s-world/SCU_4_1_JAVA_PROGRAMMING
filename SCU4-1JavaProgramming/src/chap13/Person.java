package chap13;

import java.io.Serializable;

public class Person implements Serializable{
	private String name;
	private int age;
	
	public Person(String name, int age) {
		this.name=name;
		this.age=age;
	}
	
	public void tell() {
		System.out.printf("안녕하세요. %d살 %s입니다.\n",age, name);
	}
}
