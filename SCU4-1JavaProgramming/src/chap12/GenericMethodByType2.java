package chap12;

import chap9.phone.Phone;

public class GenericMethodByType2 {
	// 제네릭 타입 t 를 Phone 클래스를 상속하는 클래스 타입으로 제한
	public <T extends Phone> void introduce(T t) {
		System.out.println("안녕하세요 "+t.toString()+"입니다.");
	}
}
