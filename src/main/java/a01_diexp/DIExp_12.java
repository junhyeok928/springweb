package a01_diexp;

import java.io.UnsupportedEncodingException;

import org.springframework.context.support.GenericXmlApplicationContext;

import a01_diexp.vo3.Dao;
import a01_diexp.vo3.Student;


public class DIExp_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// DI(의존성 주입)을 위한 연습 환경 만들기..
		String path = "a01_diexp\\di12.xml";
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext(path);
		// 컨테이너에 객체의 생성과 설정을 확인할 수 있다.
		
		Dao dao = ctx.getBean("dao", Dao.class);
		System.out.println(dao.getUrl());	
		System.out.println(dao.getUser());	
		System.out.println(dao.getPass());
			
		Student stud = ctx.getBean("stud",Student.class);
		System.out.println(stud.getName());
		System.out.println(stud.getKor());
		System.out.println(stud.getEng());
		System.out.println(stud.getMath());
		

		
		ctx.close();
	}

}
