package a01_diexp.vo;

import org.springframework.beans.factory.annotation.Autowired;
// a01_diexp.vo.GiftSender
public class GiftSender {
	private String name;
	@Autowired
	private Product product;
	public GiftSender() {
		super();
		// TODO Auto-generated constructor stub
	}
	public GiftSender(String name) {
		super();
		this.name = name;
	}
	public void showSendInfo() {
		System.out.println(name+"님이 선물을 보낼려고 합니다.");
		if(product!=null) {
			System.out.println("#선물 정보#");
			System.out.println("물건명:"+product.getName());
			System.out.println("가격:"+product.getPrice());
		}else {
			System.out.println("보낼 선물이 없습니다.");
		}
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	
}
