package springweb.a02_mvc.a02_service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import springweb.a02_mvc.a03_dao.A01_EmpDao;
import springweb.a02_mvc.a03_dao.A02_DeptDao;
import springweb.vo.Emp;

@Service
public class A01_EmpService {
	// A01_EmpDao인터페이스로 선언한 내용을 상속한 실제 객체가 컨테이너에서
	// 생성되어 있을 때, 사용..
	@Autowired
	private A01_EmpDao dao;

	@Autowired
	private A02_DeptDao ddao;	
	
	public ArrayList<Emp> getEmpList(Emp sch){
		// controller   empList.do
		// 요청값으로 초기화면일 때, null을 ""으로 처리
		if(sch.getEname()==null) sch.setEname("");
		if(sch.getJob()==null) sch.setJob("");
		/*		
		dao.getCount(10);
		dao.getJobCount("A");		
		dao.getEmpDetail(7521);
		dao.getDeptSal(10);
		dao.getStaticsEmp("1");
		System.out.println("데이터 건수:"+dao.getEnames(10).size());
		// service는 현재 dao객체자 정상적으로 생성되어서
		// 사용하는 한지를 테스트 하는 용도로 호출하는 것이다.
		System.out.println("데이터 건수(job-empno):"+dao.getEmpnos("SALESMAN").size());
		System.out.println("데이터건수(dept-emp):"+ dao.getDeptEmp().size());
			public double getAvg(String job);

		System.out.println("평균 급여:"+dao.getAvg("MANAGER"));
		System.out.println("관리자의 이름:"+dao.getMgrEmp("JONES").get(0).getEname());
		System.out.println("resultMap사용:"+ddao.getDept2List().size());
		System.out.println("매개변수(동일유형):"+dao.getSchEmp(7839, 20).get(0).getEname());
		 * */
		return dao.getEmpList(sch);
	}
	public void insertEmp(Emp ins) {
		dao.insertEmp(ins);
	}
	public Emp getEmp(int empno) {
		return dao.getEmp(empno);
	}
}
