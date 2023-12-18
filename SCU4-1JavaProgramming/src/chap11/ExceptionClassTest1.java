package chap11;

public class ExceptionClassTest1 {
	public static void main(String[] args) {
		try {
			Class.forName("Example"); // Example이라는 클래스는 없기 떄문에 ClassNotFoundException 발생
		} catch (ClassNotFoundException e) {
			e.getMessage();
;			e.printStackTrace();
		}
	}
}
