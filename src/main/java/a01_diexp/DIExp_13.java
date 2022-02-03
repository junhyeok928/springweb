package a01_diexp;

import java.io.UnsupportedEncodingException;

import org.springframework.context.support.GenericXmlApplicationContext;

import a01_diexp.vo3.Dao;
import a01_diexp.vo3.Person;
import a01_diexp.vo3.Student;


public class DIExp_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// DI(의존성 주입)을 위한 연습 환경 만들기..
		String path = "a01_diexp\\di13.xml";
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext(path);
		Student stud = ctx.getBean("stud",Student.class);
		System.out.println(stud.getName());
		System.out.println(stud.getKor());
		System.out.println(stud.getEng());
		System.out.println(stud.getMath());
		
		// ex) msg 파일에 이름, 나이, 사는 곳 설정하고, 
		// Person 클래스 호출할 수 있게 하세요.
		// 5조 제출 손들어 주세요
		Person person = ctx.getBean("person", Person.class);
		System.out.println(person.getName());
		System.out.println(person.getAge());
		System.out.println(person.getLoc());
		
		ctx.close();
	}

}
