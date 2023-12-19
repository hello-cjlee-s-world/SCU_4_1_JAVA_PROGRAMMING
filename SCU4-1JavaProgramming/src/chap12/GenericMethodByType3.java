package chap12;
import chap9.phone.SmartPhoneImpl;

public class GenericMethodByType3 {
	// 제네릭 타입을 SmartPhoneImpl 클래스의 상위 클래스 타입으로 제한
	public void introduce(MyClass<? super SmartPhoneImpl> t) {
		System.out.println("안녕하세요. "+t.toString()+"입니다.");
	}
}
