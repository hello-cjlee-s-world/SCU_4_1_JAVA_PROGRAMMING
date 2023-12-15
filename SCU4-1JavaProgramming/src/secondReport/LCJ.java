package secondReport;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class LCJ {
	String name;
	String schoolNum;
	String email;
	String birthday;
	
	public LCJ(String name, String schoolNum, String email, String birth) {
		this.name=name;
		this.schoolNum=schoolNum;
		this.email=email;
		this.birthday=birth;
	}
	public void printNameEamil() {
		System.out.printf("개발자의 이름은 %s입니다.\n개발자는 %s 메일을 사용합니다",name, email);
	}
	public void printBirth() throws ParseException {
		System.out.printf("개발자의 나이는 만 %s세 입니다",calBirth(birthday));
	}
	public int calBirth(String strBirth) throws ParseException {
		Calendar cal = Calendar.getInstance();
		int var = 0;
		int year= Integer.parseInt(strBirth.substring(0,4));
		int month=Integer.parseInt(strBirth.substring(4,6));
		int day=Integer.parseInt(strBirth.substring(6,8));
		int curYear= cal.get(Calendar.YEAR);
		int curMonth=cal.get(Calendar.MONTH)+1;
		int curDay=cal.get(Calendar.DATE);
		
		// 현재 년도와 생년을 빼기
		var = curYear - Integer.parseInt(strBirth.substring(0,4));
		// 현재 달이 생일달보다 이르면 나이 -1, 달은 같지만 일수가 이를경우 -1
		if(curMonth < month || (curMonth == month && curDay < day) ){
			var-=1;
		}
		return var;
	}
}
