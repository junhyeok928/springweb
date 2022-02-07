package springweb.vo;

public class Salgrade2 {
	private int level;
	private int lowsalary;
	private int highsalary;
	public Salgrade2() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Salgrade2(int level, int lowsalary, int highsalary) {
		super();
		this.level = level;
		this.lowsalary = lowsalary;
		this.highsalary = highsalary;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public int getLowsalary() {
		return lowsalary;
	}
	public void setLowsalary(int lowsalary) {
		this.lowsalary = lowsalary;
	}
	public int getHighsalary() {
		return highsalary;
	}
	public void setHighsalary(int highsalary) {
		this.highsalary = highsalary;
	}
	
}
