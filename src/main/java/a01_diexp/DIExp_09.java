package a01_diexp;

import org.springframework.context.support.GenericXmlApplicationContext;

import a01_diexp.vo2.Person;

public class DIExp_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// DI(의존성 주입)을 위한 연습 환경 만들기..
		String path = "a01_diexp\\di09.xml";
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext(path);
		// 컨테이너에 객체의 생성과 설정을 확인할 수 있다.
		// default로 id값이 지정되어 있지 않으면 클래스명의 소문자로 식별한다
		Person p01 = ctx.getBean("person",Person.class);
		System.out.println("객체생성:"+p01);
		// vo3 패키지에 연습할 클래스를 넣은 후에, di10.xml를 자동 scan할 수있게 선언
		ctx.close();
	}

}
