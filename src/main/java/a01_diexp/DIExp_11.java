package a01_diexp;

import org.springframework.context.support.GenericXmlApplicationContext;

import a01_diexp.vo3.Juliet;
import a01_diexp.vo3.Member;
import a01_diexp.vo3.Person;
import a01_diexp.vo3.Romeo;

public class DIExp_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// DI(의존성 주입)을 위한 연습 환경 만들기..
		String path = "a01_diexp\\di10.xml";
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext(path);
		// 컨테이너에 객체의 생성과 설정을 확인할 수 있다.
		// default로 id값이 지정되어 있지 않으면 클래스명의 소문자로 식별한다
		Person p01 = ctx.getBean("person",Person.class);
		System.out.println("객체생성:"+p01);
		Member mem = ctx.getBean("mem",Member.class);
		System.out.println("객체생성:"+mem);
		// vo3 패키지에 연습할 클래스를 넣은 후에, di10.xml를 자동 scan할 수있게 선언
		Romeo r01 = ctx.getBean("r01", Romeo.class);
		r01.callJuliet();
		Juliet j01 = ctx.getBean("j01", Juliet.class);
		j01.replyCall();
		ctx.close();
	}

}
