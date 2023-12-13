package chap9;

public abstract class Phone {
	String phoneNumber;
	public Phone(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	void call() {
		System.out.printf("%s에서 전화를 걸어 통화를 합니다.", phoneNumber);
	}
	abstract void turnOn(); // 스마트폰 모델에 따라 전원을 켜는 기능이 다르게 정의
}	

