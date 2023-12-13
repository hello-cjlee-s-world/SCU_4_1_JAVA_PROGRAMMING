package chap9.phone;

public class SmartPhone implements Phone{
	boolean power;
	
	@Override
	public void call() {
		String number1 = String.valueOf(PHONE_NUM_1);
		String number2 = String.valueOf(PHONE_NUM_2);
		String number3 = String.valueOf(PHONE_NUM_3);
		System.out.printf("%s %s %s 에 전화합니다.", number1, number2, number3);
	}
	@Override
	public void turnOn() {
		if(!power) {power=true;}
	}
	@Override
	public void turnOff() {
		if(power) {power=false;}
	}
}
