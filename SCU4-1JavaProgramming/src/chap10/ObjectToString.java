package chap10;

public class ObjectToString {
	public static void main(String[] args) {
		Car c1=new Car();
		Car c2=new Car();
		System.out.println(c1); // 참조변수 c1의 인스턴스의 toString()메소드를 호출
		System.out.println(c2); // 참조변수 c1의 인스턴스의 toString()메소드를 호출
		String str=new String("");
	}
	
}
class Car{
	@Override
	public String toString() {
		return "Car Class 기반의 인스턴스입니다.";
	}
}
