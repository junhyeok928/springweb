package springweb.vo;

public class DeptEmp {
	private String dname;
	private int empno;
	private String name;
	private String job;
	private String div;
	private double tsal;
	public DeptEmp() {
		super();
		// TODO Auto-generated constructor stub
	}
	public DeptEmp(String dname, int empno, String name, String job, String div, double tsal) {
		super();
		this.dname = dname;
		this.empno = empno;
		this.name = name;
		this.job = job;
		this.div = div;
		this.tsal = tsal;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
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
	public String getDiv() {
		return div;
	}
	public void setDiv(String div) {
		this.div = div;
	}
	public double getTsal() {
		return tsal;
	}
	public void setTsal(double tsal) {
		this.tsal = tsal;
	}
	
	
}
