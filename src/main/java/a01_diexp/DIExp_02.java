package a01_diexp;

import org.springframework.context.support.GenericXmlApplicationContext;

import a01_diexp.vo.AirPlane;
import a01_diexp.vo.Apartment;
import springweb.vo.Person;

public class DIExp_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// DI(의존성 주입)을 위한 연습 환경 만들기..
		String path = "a01_diexp\\di02.xml";
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext(path);
		// 컨테이너에 객체의 생성과 설정을 확인할 수 있다.
		AirPlane ap = ctx.getBean("ap", AirPlane.class);
		System.out.println("# 생성자 호출 #");
		System.out.println(ap.getKind());
		System.out.println(ap.getCompany());
			
		Apartment am = ctx.getBean("am", Apartment.class);
		System.out.println("# 생성자 호출 연습 #");
		System.out.println(am.getGroupNum()+"동");
		System.out.println(am.getRoomNum()+"호");
		ctx.close();
	}

}
