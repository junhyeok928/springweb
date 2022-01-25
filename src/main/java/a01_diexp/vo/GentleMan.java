package a01_diexp.vo;

public class GentleMan {
	private String name;
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
