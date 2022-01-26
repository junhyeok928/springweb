package a01_diexp;

import org.springframework.context.support.GenericXmlApplicationContext;

import a01_diexp.vo.Bus;
import a01_diexp.vo.Mart;

public class DIExp_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// DI(의존성 주입)을 위한 연습 환경 만들기..
		String path = "a01_diexp\\di04.xml";
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext(path);
		// 컨테이너에 객체의 생성과 설정을 확인할 수 있다.
		Mart mt = ctx.getBean("mt",Mart.class);
		mt.buyList();
		System.out.println("객체생성:"+mt);
		Bus b01 = ctx.getBean("b01",Bus.class);
		b01.showPassenger();
		ctx.close();
	}

}
