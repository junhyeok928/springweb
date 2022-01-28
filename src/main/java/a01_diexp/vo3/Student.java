package a01_diexp.vo3;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component("stud")	// 컨테이너 자동 메모리 로딩 처리 default 유형 Component선언
public class Student {
	
	// 기본 설정 파일에 있는 개용을 객체의 필드에 할당할 수 있다.
	//	@Value("$설정된키")
	@Value("${name}")
	private String name;
	@Value("${kor}")
	private int kor;
	@Value("${math}")
	private int math;
	@Value("${eng}")
	private int eng;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(String name, int kor, int math, int eng) {
		super();
		this.name = name;
		this.kor = kor;
		this.math = math;
		this.eng = eng;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	
}
