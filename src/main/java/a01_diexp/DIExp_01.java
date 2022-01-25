package a01_diexp;

import org.springframework.context.support.GenericXmlApplicationContext;

import a01_diexp.vo.Duck;
import a01_diexp.vo.Fruit;

public class DIExp_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// DI(의존성 주입)을 위한 연습 환경 만들기..
		String path = "a01_diexp\\di01.xml";
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext(path);
		// 컨테이너에 객체의 생성과 설정을 확인할 수 있다.
		// xml에 선언한 id/name 명을 가져온다
		Fruit f01 = ctx.getBean("f01",Fruit.class);
		System.out.println("생성된 객체의 속성 호출..");
		System.out.println(f01.getName());
		System.out.println(f01.getPrice());
		System.out.println(f01.getProdLoc());
		
		Duck d01 = ctx.getBean("d01", Duck.class);
		System.out.println("# 오리 #");
		System.out.println(d01.getKind());
		System.out.println(d01.getColor());
		ctx.close();
	}

}
