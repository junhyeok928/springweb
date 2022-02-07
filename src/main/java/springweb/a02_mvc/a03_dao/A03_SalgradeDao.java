package springweb.a02_mvc.a03_dao;

import java.util.List;

import springweb.vo.Salgrade;
import springweb.vo.Salgrade2;

public interface A03_SalgradeDao {

	public Salgrade getSalgrade(int grade);
	public List<Salgrade2> getSalgrade2List();
}
