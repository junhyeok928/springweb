package a01_diexp.vo;
// a01_diexp.vo.HandPhone
public class HandPhone {
	private String kind;
	private String company;
	public HandPhone() {
		super();
		// TODO Auto-generated constructor stub
	}
	public HandPhone(String kind, String company) {
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
