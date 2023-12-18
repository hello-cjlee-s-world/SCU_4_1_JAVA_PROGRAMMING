package chap11;

public class BadInputException extends Exception {
	// 생성자
	BadInputException(){
		super("사용자의 입력 값이 올바르지 않습니다.");
	}
}
