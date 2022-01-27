package a01_diexp.vo3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

// a01_diexp.vo.Juliet
@Component("j01")
public class Juliet {
	private String name;
	@Autowired
	private Romeo romeo;
	public Juliet() {
		super();
		name="줄리엣";
		// TODO Auto-generated constructor stub
	}
	public Juliet(String name) {
		super();
		this.name = name;
	}
	public void replyCall() {
		System.out.println(name+"이 대답을 할려고 한다.");
		if(romeo!=null) {
			System.out.println(romeo.getName()+"님 부르셨습니까?");
		}else {
			System.out.println("로미오가 부르지 않았다.");
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
	// property romeo
	public void setRomeo(Romeo romeo) {
		this.romeo = romeo;
	}
	
}
