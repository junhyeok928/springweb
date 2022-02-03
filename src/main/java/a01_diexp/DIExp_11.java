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
		String path = "a01_diexp\\di11.xml";
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext(path);
		// 컨테이너에 객체의 생성과 설정을 확인할 수 있다.
		Person p01 = ctx.getBean("person", Person.class);

		ctx.close();
	}

}
