package chap12;

public interface MyInterface<T1, T2> { // 클래서에 제네릭 타입변수를 지정
	T1 method1(T1 t);
	T2 method2(T2 t);
}
