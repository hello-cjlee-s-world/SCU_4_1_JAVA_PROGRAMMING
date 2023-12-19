package chap12;

public class GenericMethodByType {
	public <T> void introduce(T t) {
		// toString 은 최상위 클래스인 Object 클래스에서 모든 클래스들이 상속 받는 메소드이기 때문에 타입에 사용 가능
		System.out.println("안녕하세요 " + t.toString() + "입니다.");
	}
}
