package a01_diexp;

import org.springframework.context.support.GenericXmlApplicationContext;

import a01_diexp.vo.FruitShop;
import a01_diexp.vo.Sensor;
import springweb.vo.Person;

public class DIExp_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// DI(의존성 주입)을 위한 연습 환경 만들기..
		String path = "a01_diexp\\di05.xml";
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext(path);
		// 컨테이너에 객체의 생성과 설정을 확인할 수 있다.
		Sensor sensor01 = ctx.getBean("sensor01", Sensor.class);
		System.out.println("객체생성:"+sensor01);
		
		FruitShop fs = ctx.getBean("fs", FruitShop.class);
		// toString()로 정의된 내용은 fs(참조변수)만 호출되어서 기본적으로
		// 문자열로 리턴할 내용을 기술해놓은 것이다.
		System.out.println("생성된 결과:"+fs);
		
		ctx.close();
	}

}
