package chap9;

public class SmartPhone extends Phone {
	String model;
	public SmartPhone(String phoneNumber, String model) {
		super(phoneNumber);
		this.model = model;
	}
	void game() {
		System.out.printf("%s 게임을 합니다.", model);
	}
	// 추상메서드를 재구성(오버라이딩)
	@Override
	void turnOn() {
		System.out.printf("%s 모델에 맞게 전원을 켰습니다.", model);
	}
}
