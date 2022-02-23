package springweb.a01_start.a01_controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
// springweb.a01_start.a01_controller.A05_ModelCtrl
import org.springframework.web.bind.annotation.RequestMapping;

import springweb.vo.Person;
import springweb.vo.Player;
@Controller
public class A05_ModelCtrl {
	// public String modelExp1(HttpServletRequest req, HttpServletResponse res, Model d) {
	// public String modelExp1(요청값처리 객체, Model d) {
	@RequestMapping("/modelExp1.do")
	public String modelExp1(Model d) {
		// # model 처리
		// 1. view단에 전달할 핵심 데이터로, 문자열, 객체를 통해서 전달가능하다.ㄴ
		// 2. .addAttribute("모델명","설정값") 형식으로 처리한다.
		d.addAttribute("var01","변수1"); // 뷰단에서 호출 ${var01}
		d.addAttribute("var02",30); // ${var02} ${var02+20}
		d.addAttribute("obj01",new Person("홍길동",25,"방배동"));
		// ${obj01.name}  ${obj01.age}  ${obj01.loc}
		ArrayList<Person> plist = new ArrayList<Person>();
		plist.add(new Person("마길동",30,"인천"));
		plist.add(new Person("오길동",29,"대구"));
		plist.add(new Person("하길동",26,"부산"));
		d.addAttribute("list01",plist);
		// <c:forEach var="p01" items="${list01}" >
		
		return "WEB-INF\\views\\a05_modelexp1.jsp";
	}
	// ex) modelExp2.do로 설정하여, 변수로 물건명, 가격, 갯수,
	//                            객체로 선수명  성적으로  model데이터로 설정하여
	//     a06_modelexp2.jsp에서 호출하여 출력하세요.
	@RequestMapping("/modelExp2.do")
	public String modelExp2(Model d) {
		d.addAttribute("name", "사과");
		d.addAttribute("price", 3000);
		d.addAttribute("cnt", 2);
		d.addAttribute("player", new Player("홍길동",0.321));
		
		return "\\WEB-INF\\views\\a06_modelexp2.jsp";
	}
	

}
