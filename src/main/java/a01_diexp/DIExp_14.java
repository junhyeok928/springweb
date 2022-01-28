package a01_diexp;

import java.util.ArrayList;

import org.springframework.context.support.GenericXmlApplicationContext;

import a01_diexp.db.A03_EmpService;
import a01_diexp.db.Emp;


public class DIExp_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// DI(의존성 주입)을 위한 연습 환경 만들기..
		String path = "a01_diexp\\di14.xml";
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext(path);
		A03_EmpService service = ctx.getBean("service",A03_EmpService.class);
		ArrayList<Emp> emplist = service.empListPre("", "");
		System.out.println("총데이터건수:"+emplist.size());
		
		ctx.close();
	}

}
