package chap9.phone;

public interface SmartDevice extends Phone, Application{
	// 인터페이스 Phone 과 Application을 상속하여 새로이 만든 interface
	// SmartDevice interface는 Phone 과 Application interface의 멤버를 상속하기 떄문에 두 인터페이스의 멤버를 모두 가지게 됨
}
