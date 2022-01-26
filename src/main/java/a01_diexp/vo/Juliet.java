package a01_diexp.vo;

public class Juliet {
	private String name;
	private Romeo romeo;
	public Juliet() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Juliet(String name) {
		super();
		this.name = name;
	}
	public void showInfo() {
		System.out.println("신사의 이름:"+name);
		if(romeo!=null) { // 객체에 메모리가 할당 되었을 때,
			System.out.println("가지고 있는 폰은?");
			System.out.println("이름:"+romeo.getName());
			System.out.println("나이:"+romeo.getAge());
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
	public Romeo getRomeo() {
		return romeo;
	}
	public void setRomeo(Romeo romeo) {
		this.romeo = romeo;
	}
	
}
