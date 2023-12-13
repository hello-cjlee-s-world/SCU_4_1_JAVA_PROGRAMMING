package chap9;

public abstract class AbstractkClass {
	int num;
	String name;
	abstract void abstractMethod();
	void instanceMethod() {
		abstractMethod();
	}
	void printData() {
		System.out.println(name);
	}
}
