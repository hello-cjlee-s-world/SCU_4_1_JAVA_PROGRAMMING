package chap9.phone;

public class SmartPhoneImpl4 implements SmartDevice{
		boolean power;
		// Phone 인터페이스의 추상 메소드 오버라이딩
		@Override
		public void call() {
			System.out.println("전화 통화를 합니다.");
		}
		@Override
		public void turnOn() {
			System.out.println("전원을 켭니다.");
		}
		@Override
		public void turnOff() {
			System.out.println("전원을 끕니다.");
		}
		
		// Application 인터페이스의 추상메소드 오버라이딩
		@Override
		public void appRun() {
			System.out.println("앱을 실행합니다.");
		}
		@Override
		public void appStop() {
			System.out.println("앱을 중지합니다.");
		}

}
