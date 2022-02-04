package springweb.a02_mvc.a03_dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import springweb.vo.DeptEmp;
import springweb.vo.DeptSal;
import springweb.vo.Emp;
import springweb.vo.Emp2;


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
	public List<Emp2> getEmpList2();
}
