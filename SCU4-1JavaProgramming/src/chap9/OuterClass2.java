package chap9;

public class OuterClass2 {
	private String name;
	public OuterClass2(String name) {
		this.name = name;
	}
	// BasicClass 클래스를 상속하는 구조로 해서 반환 타입을 BasicClass 타입으로 처리
	public BasicClass createLocalClassInstance() {
		class LocalClass extends BasicClass{
			@Override
			public void tell() {
				System.out.printf("안녕하세요 %s입니다.", name);
			}
		}
		return new LocalClass();
	}
}

abstract class BasicClass{
	public abstract void tell();
}
