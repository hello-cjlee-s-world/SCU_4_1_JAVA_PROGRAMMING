package chap9;

public class SmartPhoneMain {

	public static void main(String[] args) {
		//phone phone = new phone(); // 인스턴스 생성 불가

		// 부모 메서드인 phone으로 인스턴스 생성을 했기 때문에 자식인 smartPhone 에서 만들어진 함수들인 game은 실행이 되지 않는다
		Phone sp = new SmartPhone("010-2222-2222", "아이폰15");
		sp.call();
		System.out.println();
		sp.turnOn();
		//sp.game();  
		System.out.println("\n\n------------------------------\n");
		// 자식메서드인 smartPhone으로 인스턴스 생성을 했기 때문에 자식인 smartPhone 에서 만들어진 함수들인 game까지 실행된다
		SmartPhone sp2 = new SmartPhone("010-2222-2222", "갤럭시10");
		sp2.call();
		System.out.println();
		sp2.turnOn();
		System.out.println();
		sp2.game();
		
	}

}
