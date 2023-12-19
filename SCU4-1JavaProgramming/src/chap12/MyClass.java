package chap12;

public class MyClass<T> {
	T val;
	T getVal(){
		return val;
	}
	void setVal(T val) {
		this.val = val; 
	}
	
	public static void main(String[] args) {
		MyClass<String> myclass = new MyClass<String>();
		myclass.setVal("Solaris");
		System.out.println(myclass.val);
	}
}
