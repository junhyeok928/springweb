package a01_diexp.vo;
// a01_diexp.vo.Duck
public class Duck {
	private String kind;
	private String color;
	public Duck() {
		super();
	}
	public Duck(String kind, String color) {
		super();
		this.kind = kind;
		this.color = color;
	}
	public String getKind() {
		return kind;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
}
