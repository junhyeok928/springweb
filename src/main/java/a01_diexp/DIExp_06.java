package a01_diexp;

import org.springframework.context.support.GenericXmlApplicationContext;

import a01_diexp.vo.GentleMan;
import a01_diexp.vo.Juliet;
import a01_diexp.vo.Romeo;

public class DIExp_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// DI(의존성 주입)을 위한 연습 환경 만들기..
		String path = "a01_diexp\\di06.xml";
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext(path);
		// 컨테이너에 객체의 생성과 설정을 확인할 수 있다.
		GentleMan gt = ctx.getBean("gt", GentleMan.class);
		gt.showInfo();
		Romeo romeo = ctx.getBean("romeo", Romeo.class);
		romeo.callJuliet();
		Juliet juliet = ctx.getBean("juliet", Juliet.class);
		juliet.replyCall();
			
		
		ctx.close();
	}

}
