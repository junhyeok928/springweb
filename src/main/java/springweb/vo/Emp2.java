package springweb.vo;

import java.util.Date;

public class Emp2 {
	private int no;
	private String name;
	private String job;
	private String mgrno;
	private Date hiredate;
	private double salary;
	private double comm;
	private int deptno;
	public Emp2() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Emp2(int no, String name, String job, String mgrno, Date hiredate, double salary, double comm, int deptno) {
		super();
		this.no = no;
		this.name = name;
		this.job = job;
		this.mgrno = mgrno;
		this.hiredate = hiredate;
		this.salary = salary;
		this.comm = comm;
		this.deptno = deptno;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public String getMgrno() {
		return mgrno;
	}
	public void setMgrno(String mgrno) {
		this.mgrno = mgrno;
	}
	public Date getHiredate() {
		return hiredate;
	}
	public void setHiredate(Date hiredate) {
		this.hiredate = hiredate;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public double getComm() {
		return comm;
	}
	public void setComm(double comm) {
		this.comm = comm;
	}
	public int getDeptno() {
		return deptno;
	}
	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}
	
}
