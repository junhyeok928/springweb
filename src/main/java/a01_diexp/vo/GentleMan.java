package a01_diexp.vo;

import org.springframework.beans.factory.annotation.Autowired;

public class GentleMan {
	private String name;
	
	// 소스상에 autowiring 설정..
	// 메모리상에 객체가 있으면 자동으로 주입이 된다.
	// 1. 필드, 메서드에서도 선언이 가능
	// 2. 접근제어자 상관없이 객체가 있으면 할당이 된다
	@Autowired
	private HandPhone handPhone;
	public GentleMan() {
		super();
		// TODO Auto-generated constructor stub
	}
	public GentleMan(String name) {
		super();
		this.name = name;
	}
	public void showInfo() {
		System.out.println("신사의 이름:"+name);
		if(handPhone!=null) { // 객체에 메모리가 할당 되었을 때,
			System.out.println("가지고 있는 폰은?");
			System.out.println("기종:"+handPhone.getKind());
			System.out.println("제조사:"+handPhone.getCompany());
		}else { // 객체에 메모리가 할당 되지 않았을 때..
			System.out.println("아직 폰이 없네요.!!");
		}
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public HandPhone getHandPhone() {
		return handPhone;
	}
	public void setHandPhone(HandPhone handPhone) {
		this.handPhone = handPhone;
	}
	

}
