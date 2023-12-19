package chap12;

import chap9.phone.Phone;
import chap9.phone.SmartPhoneImpl;

public class GenericMethodMain3 {

	public static void main(String[] args) {
		ShowInteger showInteger = new ShowInteger(100);
		
		// SmartPhoneImpl 클래스의 상위 클래스인 Phone 타입으로 제네릭 타입 정의
		MyClass<Phone> my = new MyClass<Phone>();
		my.setVal(new SmartPhoneImpl());
		
		GenericMethodByType3 byType = new GenericMethodByType3();
		byType.introduce(my);
	}

}
