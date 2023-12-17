package chap10;

public class PersonEquals {
	public static void main(String[] args) {
		Person p1=new Person("LCJ","231111-1000000");
		Person p2=new Person("HDH","231111-1000000");
		System.out.println("참조변수의 비교");
		System.out.println("p1==p2 => " + (p1==p2));
		System.out.println();
		System.out.println("인스턴스의 equals() 메소드로 비교");
		System.out.println("p1.equals(p2) => " + p1.equals(p2));
	}
}
class Person{
	String name;
	String juminNo;
	public Person(String name, String juminNo) {
		this.juminNo=juminNo;
	}
	// equals 메소드 재정의(juminNo가 같다면 같은 사람으로)
	@Override
	public boolean equals(Object obj) {
		Person p = null;
		if(obj instanceof Person) {
			p=(Person) obj;
		}
		if(p!=null && this.juminNo==p.juminNo) {
			return true;
		}
		return false;
	}
}
