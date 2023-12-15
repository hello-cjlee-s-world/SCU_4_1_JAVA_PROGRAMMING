package chap9;

public class OuterClass3 {
	private String name;
	OuterClass3(String name){
		this.name=name;
	}
	
	public BasicClass createLocalClassInstance() {
		return new BasicClass() {
			@Override
			public void tell() {
				System.out.printf("안녕하세요. %s입니다.",  name);
			}
		};
	}
	public static void main(String[] args) {
		OuterClass3 oc3 = new OuterClass3("LCJ");
		BasicClass bc = oc3.createLocalClassInstance();
		bc.tell();
	}
}
