package springweb.a02_mvc.a03_dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import springweb.vo.Dept;
import springweb.vo.Dept2;

@Repository
public interface A02_DeptDao {
	/* select count(*) cnt from dept where deptno=@@ */
	/* select * from dept where dname=@@ */
	/*
	1. mybatis.Spring.xml
	2. DeptMapper.xml
	
	 * */
	public int getDeptCnt(int deptno);
	public Dept getDeptName(String dname);
	/*
	ex) select * dept
	resultMap을 활용하여 처리 하세요.
	class Dept2
		private String no;
		private String name;
		private String location;
	 */
	public List<Dept2> getDept2List();
}
