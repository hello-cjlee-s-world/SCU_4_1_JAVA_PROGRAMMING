package chap12;

public class MyInterfaceImplMain {
	public static void main(String[] args) {
		myInterfaceImpl<String, Integer> my = null;
		
		my = new myInterfaceImpl<String, Integer>();
		
		System.out.println(my.method1("Solaris"));
		System.out.println(my.method2(100));
		
	}
}
