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
	resultMap를 활용하여 처리 하세요.. mybatis.Spring.xml dept2 등록
	class Dept2
		private String no;
		private String name;
		private String location;
		
		6조 제출, 6조를 포함해서 조장님 손들기
	 * */
	public List<Dept2> getDept2List();
	
	public List<Dept> getDeptList(Dept sch);
	public void insertDept(Dept sch);
	public void uptDept(Dept upt);
}
