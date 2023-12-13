package chap9.phone;

public interface Phone {
	int PHONE_NUM_1=1; // 상수는 public static final 생략 가능
	int PHONE_NUM_2=2; // 상수는 public static final 생략 가능
	int PHONE_NUM_3=3; // 상수는 public static final 생략 가능
	int PHONE_NUM_4=4; // 상수는 public static final 생략 가능
	int PHONE_NUM_5=5; // 상수는 public static final 생략 가능
	int PHONE_NUM_6=6; // 상수는 public static final 생략 가능
	int PHONE_NUM_7=7; // 상수는 public static final 생략 가능
	int PHONE_NUM_8=8; // 상수는 public static final 생략 가능
	int PHONE_NUM_9=9; // 상수는 public static final 생략 가능
	int PHONE_NUM_0=0; // 상수는 public static final 생략 가능
	
	void call(); // 추상메서드는 public abstract 생략 가능
	void turnOn(); // 추상메서드는 public abstract 생략 가능
	void turnOff(); // 추상메서드는 public abstract 생략 가능
}
