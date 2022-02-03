package springweb.a02_mvc.a03_dao;

import java.util.ArrayList;

import org.springframework.stereotype.Repository;

import springweb.vo.Emp;

// springweb.a02_mvc.a03_dao.A01_EmpDao
// ArrayList<Emp> getEmpList(Emp sch);
@Repository
public interface A01_EmpDao {
	// public abstract 내부적으로 설정이 된다.
	public ArrayList<Emp> getEmpList(Emp sch);
	public int getCount(int deptno);
	public int getJobCount(String job);
	public Emp getEmpDetail(int empno);
}
