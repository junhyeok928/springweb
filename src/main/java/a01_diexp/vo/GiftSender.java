package a01_diexp.vo;

import org.springframework.beans.factory.annotation.Autowired;

public class GiftSender {
	private String name;
	@Autowired
	private Product product;
	public GiftSender() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void sendGift() {
		System.out.println("선물 받는 사람:"+name);
		if(product!=null) {
			System.out.println("물건 정보는?");
			System.out.println("이름:"+product.getName());
			System.out.println("가격:"+product.getPrice());
		}else { 
			System.out.println("선물이 없어요!!");
		}
	}
	public GiftSender(String name) {
		super();
		this.name = name;
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
