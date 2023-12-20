package chap12;

public class SmartPhone implements Comparable<SmartPhone>{
	private String name;
	private String phoneNumber;
	
	public SmartPhone(String name, String phoneNumber) {
		this.name = name;
		this.phoneNumber = phoneNumber;
	}
	
	public String getName() {
		return name;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	@Override
	public int hashCode() {
		return phoneNumber.charAt(phoneNumber.length()-1);
	}
	@Override
	public boolean equals(Object obj) {
		boolean result = false;
		if(obj!=null && obj instanceof SmartPhone) {
			SmartPhone s = (SmartPhone)obj;
			result = phoneNumber.equals(s.getPhoneNumber());
		}
		return result;
	}
	
	@Override
	public int compareTo(SmartPhone o) {
		return name.compareTo(o.getName());
	}
	
	@Override
	public String toString() {
		return "SmartPhone[name = "+name+", phoneNumber = "+phoneNumber+"]";
	}
}
