package springweb.a02_mvc.a03_dao;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import springweb.vo.DeptEmp;
import springweb.vo.DeptSal;
import springweb.vo.Emp;
import springweb.vo.Emp2;
import springweb.vo.EmpGrade;


@Repository
public interface A01_EmpDao {
	// public abstract 내부적으로 설정이 된다.
	public ArrayList<Emp> getEmpList(Emp sch);
	public int getCount(int deptno);
	public int getJobCount(String job);	
	public Emp getEmpDetail(int empno);
	public DeptSal getDeptSal(int deptno);
	public ArrayList<Emp> getStaticsEmp(String div);
	public List<String> getEnames(int deptno);
	public List<Integer> getEmpnos(String job);
//	public int[] getEmpnos(String job);
	public List<DeptEmp> getDeptEmp();
	public List<EmpGrade> getEmpGrade();
	public List<Emp2> getEmpList2();
	public double getAvg(String job);
	public ArrayList<Emp> getMgrEmp(String ename);
	public ArrayList<Emp> getSchEmp(@Param("mgr") int mgr, 
									@Param("deptno") int deptno);
	// service  dao.getSchEmp(7839,20);
	public void insertEmp(Emp ins); 	
	public Emp getEmp(int empno);
}
