package chap9;
					// 상속 받으려면 extends 기입 한뒤 상속 받을 클래스명 기입
public class NewClass extends AbstractkClass{
	@Override
	void abstractMethod() { // 추상 클래스의 추상 메소드를 오버라이딩
		System.out.println("추상 메서드를 구현했습니다.");
	}
}
