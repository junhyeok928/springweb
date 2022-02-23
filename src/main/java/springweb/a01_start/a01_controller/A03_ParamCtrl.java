package springweb.a01_start.a01_controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import springweb.vo.Person;
import springweb.vo.Product;


// springweb.a01_start.a01_controller.A03_ParamCtrl
@Controller
public class A03_ParamCtrl {
	// http://localhost:7080/springweb/gogo3.do?name=홍길동
	@RequestMapping("/gogo3.do")
	public String gogo34(@RequestParam("name") String name) {
		System.out.println("요청된 이름:"+name);
		return "";
	}
	// ex)http://localhost:7080/springweb/gogo4.do?age=25
	@RequestMapping("/gogo4.do")
	public String gogo4(@RequestParam("age") int age) {
		System.out.println("나이:"+age);
		return "";
	}

	
	
	// ex)http://localhost:7080/springweb/gogo6.do
	@RequestMapping("/gogo6.do")
	public String gogo6(){
		return "WEB-INF\\views\\a05_gogo.jsp";
	}
	// ex)http://localhost:7080/springweb/gogo5.do?num01=25&num02=30&cal=덧셈
	@RequestMapping("/gogo5.do")
	public String gogo5(
				@RequestParam("num01") int num01,
				@RequestParam("num02") int num02,
				@RequestParam("cal") String cal
			) {
		System.out.println("숫자1:"+num01);
		System.out.println("숫자2:"+num02);
		System.out.println("연산자:"+cal);
		return "WEB-INF\\views\\a05_gogo.jsp";
	}
	/*
	# 요청값은 객체로 setXXXX(데이터)에 맞게 처리하면 받을 수 있다.
	url?id=himan&pass=8888
	
	setId(String id){}, setPass(String pass) 가 있는 객체를
	매개변수로 선언하면 데이터를 받을 수 있다.
	
	 * */
	// 객체를 통한 내용을 요청값이 없더라도 일단, 로딩이 되고,
	// 타입에 맞는 데이터를 처리하여야 한다.
	@RequestMapping("/objParam.do")
	public String objParam(Person p01) {
		System.out.println("# 객체를 통한 요청값 #");
		System.out.println(p01.getName());
		System.out.println(p01.getAge());
		System.out.println(p01.getLoc());
		return "";
	}
	// ex) /buyProduct.do 를 선언하고, 물건명 가격 갯수을 요청값을 객체로
	//     받게 처리하세요..
	//    /buyProduct.do?name=사과&price=3000&cnt=2
	//    위 요청값을 받을 수 있는 기능 메서드 
	//    setName(String) setPrice(int) setCnt(int)가 있으면 
	//    요청값을 객체에 담아서 처리할 수 있다.
	@RequestMapping("/buyProduct.do")
	public String buyProduct(Product prod) {
		System.out.println("물건명:"+prod.getName());
		System.out.println("가격:"+prod.getPrice());
		System.out.println("갯수:"+prod.getCnt());
		return "";
	}
	
	
	

}
