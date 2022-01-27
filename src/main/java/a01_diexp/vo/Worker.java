package a01_diexp.vo;

public class Worker {
	private String name;
	private WorkLocation loc;
	public Worker() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Worker(String name) {
		super();
		this.name = name;
	}
	public void showWorkInfo() {
		System.out.println(name+"님이 일하고 있습니다.");
		if(loc!=null) {
			System.out.println("지역:"+loc.getLoc());
		}else {
			System.out.println("일하는 지역이 정해지지 않았습니다");
		}
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public WorkLocation getLoc() {
		return loc;
	}
	public void setLoc(WorkLocation loc) {
		this.loc = loc;
	}
	
}
