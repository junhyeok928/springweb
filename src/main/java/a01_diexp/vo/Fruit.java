package a01_diexp.vo;
// a01_diexp.vo.Fruit
public class Fruit {
	private String name;
	private int price;
	private String prodLoc;
	public Fruit() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Fruit(String name, int price, String prodLoc) {
		super();
		this.name = name;
		this.price = price;
		this.prodLoc = prodLoc;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getProdLoc() {
		return prodLoc;
	}
	public void setProdLoc(String prodLoc) {
		this.prodLoc = prodLoc;
	}
	
}
