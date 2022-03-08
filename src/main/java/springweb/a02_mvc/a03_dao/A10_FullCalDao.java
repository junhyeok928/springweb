package springweb.a02_mvc.a03_dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import springweb.vo.Calendar;

@Repository
public interface A10_FullCalDao {
	public List<Calendar> getCalendarList();
}
