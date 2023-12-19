package chap12;

import java.util.ArrayList;

public class GenericMethodMain {
	public static void main(String[] args) {
		ShowInteger showInteger = new ShowInteger(100);
		ShowString showString = new ShowString("LCJ");
		
		GenericMethodByType byType = new GenericMethodByType();
		byType.introduce(showInteger); // 제네릭 타입의 메소드 호출
		byType.introduce(showString); // 제네릭 타입의 메소드 호출
	}
}
