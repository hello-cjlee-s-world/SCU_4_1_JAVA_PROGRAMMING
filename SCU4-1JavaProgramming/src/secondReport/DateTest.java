package secondReport;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateTest {

	public static void main(String[] args) throws ParseException{
		/*String strBirth = "19951018";
		
		SimpleDateFormat dfFormat = new SimpleDateFormat("yyyyMMdd");
		Calendar cal = Calendar.getInstance();
		Date dt = dfFormat.parse(strBirth); // Date 객체인 dt에 SimpleDateFormat으로 설정해준 값을 넣어준다.
		//cal.setTime(dt); // cal 객체에 strBirth(19951018)을 설정해준다.
		
		System.out.println(cal);
		System.out.println(dt);
		System.out.println(dfFormat.parse(strBirth));
		
		// Calendar 객체인 cal 로 년도 계산
		cal.add(Calendar.YEAR, -Integer.parseInt(strBirth.substring(0,4)));
		cal.add(Calendar.MONTH, -Integer.parseInt(strBirth.substring(4,6)));
		cal.add(Calendar.DATE, -Integer.parseInt(strBirth.substring(6,8)));
		System.out.println(cal);
		
		//------------------------------------------------------------------------------------------------
		System.out.println("------------------------------------------------------------------------------------------------");
		Date dat = new Date();
		Calendar c = Calendar.getInstance();
		System.out.println("dat : " + dat);
		System.out.println("dat.toString() : " + dat.toString());
		System.out.println(c.get(Calendar.YEAR));
		*/
		//------------------------------------------------------------------------------------------------
		System.out.println("------------------------------------------------------------------------------------------------");
		Calendar cal = Calendar.getInstance();
		int var = 0;
		String strBirth = "19951216";
		int year= Integer.parseInt(strBirth.substring(0,4));
		int month=Integer.parseInt(strBirth.substring(4,6));
		int day=Integer.parseInt(strBirth.substring(6,8));
		int curYear= cal.get(Calendar.YEAR);
		int curMonth=cal.get(Calendar.MONTH)+1;
		int curDay=cal.get(Calendar.DATE);
		// 현재 년도와 생년을 빼기
		var = curYear - Integer.parseInt(strBirth.substring(0,4));
		if(curMonth < month || (curMonth == month && curDay < day) ){
			var-=1;
		}
		System.out.println(var);
		
	}

}
