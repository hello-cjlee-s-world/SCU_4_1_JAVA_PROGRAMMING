package chap10;

public class MathTest {
	public static void main(String[] args) {
		System.out.println(Math.PI);
		System.out.println(Math.random());
		int num = (int)(Math.random()*45)+1;
		System.out.println(num);
		System.out.println(Math.abs(10));
		System.out.println(Math.abs(-10.0));
		System.out.println(Math.floor(3.0002));
		System.out.println(Math.ceil(3.0002));
		System.out.println(Math.round(3.600004));
		System.out.println(Math.max(100,30));
		System.out.println(Math.min(100,30));
		System.out.println(Math.pow(3,3));
		System.out.println(Math.sqrt(9));
		System.out.println(Math.sin(Math.PI/3));
		System.out.println(Math.cos(Math.PI/3));
		System.out.println(Math.tan(Math.PI/3));
		
	}
}
