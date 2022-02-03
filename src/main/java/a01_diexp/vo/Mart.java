package a01_diexp.vo;

import java.util.ArrayList;

import org.apache.poi.util.SystemOutLogger;

public class Mart {
	private String name;
	private ArrayList<Product> plist;
	public Mart() {
		super();
		// TODO Auto-generated constructor stub
	}
	// 매개변수 문자열을 받는 생성자.
	public Mart(String name) {
		super();
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public ArrayList<Product> getPlist() {
		return plist;
	}
	// property가 plist인 여러개의 객체를 받는 메서드
	// <property name="plist">
	// 	<list>
	// 	  <bean ref="prod1">
	// 	  <bean ref="prod2">
	// 	  <bean ref="prod3">
	/*
	 * 	ArrayList<Product> plist = new ArrayList<Product>();
	 * 	plist.add(prod1);
	 * 	plist.add(prod2);
	 * 	plist.add(prod3);
	 *  mt.setPlist(plist);
	 * */
	
	
	public void setPlist(ArrayList<Product> plist) {
		this.plist = plist;
	}
	public void buyList() {
		System.out.println(name+"에서 구매한 물건들");
		if(plist!=null) {
			for(Product p:plist) {
				System.out.println("물건명\t가격");
				System.out.print(p.getName()+"\t");
				System.out.println(p.getPrice());
			}	
			
		}else {
			System.out.println("구매한 물건이 없네요!!");
		}
	}
	
	
	
}
