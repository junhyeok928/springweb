package springweb.a02_mvc.a03_dao;

import org.springframework.stereotype.Repository;

import springweb.vo.Dept;

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
}
