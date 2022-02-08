package springweb.a02_mvc.a03_dao;

import java.util.List;

import springweb.vo.Salgrade;
import springweb.vo.Salgrade2;

public interface A03_SalgradeDao {

	public Salgrade getSalgrade(int grade);
	public List<Salgrade2> getSalgrade2List();
	/*
	ex)
/*
select * from salgrade;
class Salgrade2{
	int level;
	int lowsalary;
	int highsalary;
}
2/3조 진행하고 제출하세요.
*/	
	

}
