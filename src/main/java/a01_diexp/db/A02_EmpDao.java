package a01_diexp.db;

import java.util.ArrayList;

public interface A02_EmpDao {
	public void empList();
	public ArrayList<Emp> empListPre(String ename, String job);
}
