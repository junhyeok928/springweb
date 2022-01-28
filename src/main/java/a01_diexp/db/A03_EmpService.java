package a01_diexp.db;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("service")
public class A03_EmpService {
	
	//  Dao(인터페이스)+XXXMapper.xml 
	//  Dao를 상속받은 실제 객체가 mybatis프레임웍에 의해 만들어 지고,
	// Serivce단에서 아래와 호출하여 리턴된 객체를 사용한다.
	
	@Autowired
	private A02_EmpDao dao;
	// A02_EmpDao dao = new A01_Dao();
	public ArrayList<Emp> empListPre(String ename, String job){
		return dao.empListPre(ename, job);
	}
	
}
