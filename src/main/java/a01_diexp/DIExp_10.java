package a01_diexp;

import org.springframework.context.support.GenericXmlApplicationContext;

import a01_diexp.vo3.Juliet;
import a01_diexp.vo3.Member;
import a01_diexp.vo3.Person;
import a01_diexp.vo3.Romeo;


public class DIExp_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// DI(의존성 주입)을 위한 연습 환경 만들기..
		String path = "a01_diexp\\di10.xml";
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext(path);
		// 컨테이너에 객체의 생성과 설정을 확인할 수 있다.
		Person p01 = ctx.getBean("person", Person.class);
		System.out.println("객체생성:"+p01);
		Member mem = ctx.getBean("mem", Member.class);
		System.out.println("객체 생성(mem):"+mem);
		// ex) vo3패키지에 연습할 클래스를 넣은 후에, di10.xml를 자동 scan 할수 있게 선언하고
		// 객체를 호출하여 사용하세요
		Romeo r01 = ctx.getBean("r01", Romeo.class);
		r01.callJuliet();
		Juliet j01 = ctx.getBean("j01", Juliet.class);
		j01.replyCall();
		ctx.close();
	}

}
