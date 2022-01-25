package a01_diexp.vo;
// a01_diexp.vo.AirPlane
public class AirPlane {
	private String kind;
	private String company;
	public AirPlane() {
		super();
		// TODO Auto-generated constructor stub
	}
	public AirPlane(String kind, String company) {
		super();
		this.kind = kind;
		this.company = company;
	}
	public String getKind() {
		return kind;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	
}
