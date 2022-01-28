package a01_diexp.vo3;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//springweb.vo.Person
@Component
public class Person {
	@Value("${name01}")
	private String name;
	@Value("${age}")
	private int age;
	@Value("${loc}")
	private String loc;
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Person(String name, int age, String loc) {
		super();
		this.name = name;
		this.age = age;
		this.loc = loc;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	
}
