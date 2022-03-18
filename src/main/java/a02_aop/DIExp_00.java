package a02_aop;

import org.springframework.context.support.GenericXmlApplicationContext;

import a02_aop.vo.Message;

public class DIExp_00 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// DI(의존성 주입)을 위한 연습 환경 만들기..
		String path = "a02_aop\\di00.xml";
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext(path);
		// JVM 종료될 때, ApplicationContext를 종료하는 작업
		ctx.registerShutdownHook();
		// 특정한 bean 클래스 호출..
		Message msg = (Message)ctx.getBean("proxy");
		msg.helloApp();
		msg.helloApp2();

		ctx.close();
		// ~ 12:30
	}

}
