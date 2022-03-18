package a02_aop.vo;

import org.springframework.beans.factory.annotation.Autowired;

// a02_aop.vo.Message
// aop가 적용될 객체를 위한 클래스..
public class Message {
	@Autowired(required = false)
	private String name;
	public void helloApp() {
		// 5초 정도 후, 문자열이 출력 되게 처리.
		try {
			Thread.sleep(5000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("안녕하세요!!"+name+"님!!!");
	}
	public void helloApp2() {
		// 5초 정도 후, 문자열이 출력 되게 처리.
		try {
			Thread.sleep(3000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("반갑습니다!!"+name+"님!!!");
	}
	
}
