package a01_diexp.vo3;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

// a01_diexp.vo3.Student
@Component("stud") // 컨테이너 자동 메모리로딩 처리 default 유형 Component선언
public class Student {
	// 기본 설정 파일에 있는 내용을 객체의 필드에 할당할 수 있다.
	// Value($(설정된key)
	@Value("${name}")
	private String name;
	@Value("${kor}")
	private int kor;
	@Value("${eng}")
	private int eng;
	@Value("${math}")
	private int math;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(String name, int kor, int eng, int math) {
		super();
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
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
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	
}
