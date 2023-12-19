package chap9;

public class OuterClass1 {
	OuterClass1(){
		NestedClass nst = new NestedClass();
		nst.simpleMethod();
	}
	static class NestedClass{
		public void simpleMethod() {
			System.out.println("Nested Class Instance Method One");
		}
	}
	public static void main(String[] args) {
		// NestedClass 가 static 이기 때문에 
		// OuterClass1 의 생성 메소드에 NestedClass 의 simpleMethod()가 사용되어 OuterClass1 생성 시 simpleMethod() 가 실행된다. 
		OuterClass1 oc1 = new OuterClass1();
		OuterClass1.NestedClass nst1 = new OuterClass1.NestedClass();
		nst1.simpleMethod();
	}
}
