package chap9.phone;

public class SamrtPhoneMain3 {
	public static void main(String[] args) {
		SmartPhoneImpl4 phone = new SmartPhoneImpl4();
		SmartDevice s = phone;  // 상위 타입의 참조변수로 정의
		s.turnOn();
		Phone p = phone; // 상위 타입의 참조변수로 정의
		s.turnOff();
		s.appStop(); // 상위타입 참조변수로 정의해도 동일 레벨의 상위타입에서 상속받은 메서드 사용 가능
		Application a = phone;
		a.appRun();
	}
}
