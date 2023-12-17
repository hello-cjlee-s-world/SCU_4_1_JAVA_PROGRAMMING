package chap10;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ClassTest {

	public static void main(String[] args) throws ClassNotFoundException {
		// User 클래스의 정보를 담은 Class 객체를 생성합니다.
		Class userClass = Class.forName("chap10.User");
		System.out.println("====Field List====");
		for(Field field : userClass.getFields()) { // 해당 ㅏ클래스가 정의하고 있는 변수들
			System.out.println(field.getName()); // 변수의 이름을 반환
		}
		System.out.println("\n====Constructor List====");
		for(Constructor constructor : userClass.getConstructors()) {
			System.out.printf("개수 %s =", constructor.getParameterCount());
			for(Class parameter : constructor.getParameterTypes()) {
				System.out.printf("%s / ", parameter.getName());
			}
			System.out.println();
		}
		System.out.println("\n====Method List====");
		for(Method method : userClass.getMethods()) {
			System.out.println(method.getName());
		}
	}
}
