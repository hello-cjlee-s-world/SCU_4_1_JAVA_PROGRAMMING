package chap9;

public class OuterClass {
	private String name;
	private int num;
	
	OuterClass(String name){
		this.name=name;
		num=0;
	}
	public void tellYourName() {
		num++;
		System.out.printf("%s OuterClass %d\n", name, num);
	}
	class InnerClass{
		InnerClass(){
			tellYourName(); // 위에서 선언한 외부 클래스의 메서드 호출
		}
	}
	public static void main(String[] args) {
		OuterClass oc1 = new OuterClass("King");
		OuterClass oc2 = new OuterClass("Queen");
		oc1.tellYourName();
		oc2.tellYourName();
		
		OuterClass.InnerClass inn1 = oc1.new InnerClass();
		OuterClass.InnerClass inn2 = oc1.new InnerClass();
		OuterClass.InnerClass inn3 = oc1.new InnerClass();
		OuterClass.InnerClass inn4 = oc1.new InnerClass();
		OuterClass.InnerClass inn5 = oc1.new InnerClass();
		// InnerClass inNew = new InnerClass(); // oc1.new InnerClass(); 의 형태가 아닌 그냥 InnerClass()를 선언하면 오류가 난다.		
	}
}
