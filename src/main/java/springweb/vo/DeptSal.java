package springweb.vo;

public class DeptSal {
	private int deptno;
	private double mxsal;
	private double misal;
	public DeptSal() {
		super();
		// TODO Auto-generated constructor stub
	}
	public DeptSal(int deptno, double mxsal, double misal) {
		super();
		this.deptno = deptno;
		this.mxsal = mxsal;
		this.misal = misal;
	}
	public int getDeptno() {
		return deptno;
	}
	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}
	public double getMxsal() {
		return mxsal;
	}
	public void setMxsal(double mxsal) {
		this.mxsal = mxsal;
	}
	public double getMisal() {
		return misal;
	}
	public void setMisal(double misal) {
		this.misal = misal;
	}
	
}
