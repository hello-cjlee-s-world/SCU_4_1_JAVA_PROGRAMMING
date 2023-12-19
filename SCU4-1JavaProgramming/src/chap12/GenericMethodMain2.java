package chap12;

public class GenericMethodMain2 {
	public static void main(String[] args) {
		ShowInteger showInteger = new ShowInteger(100);
		ShowString showString = new ShowString("LCJ");
		
		GenericMethodByType2 byType = new GenericMethodByType2();
		//byType.introduce(showInteger); // Phone 클래스를 상속하지 않는 showInteger라서 에러 발생
	}
}
