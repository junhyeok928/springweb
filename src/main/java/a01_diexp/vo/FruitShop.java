package a01_diexp.vo;

import java.util.Properties;
import java.util.Set;

public class FruitShop {
	// 물건명을 중복되지 않게 담을 Set 객체 선언.
	private Set<String> fnames;
	// 물건명에 연계되어 있는 값을 설정할 수 있는 Properties 객체 선언
	private Properties fruitInfos;	// 문자열/문자열 키/ value값 선언
	public FruitShop() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Set<String> getFnames() {
		return fnames;
	}
	// set 객체를 저장할 메서드
	public void setFnames(Set<String> fnames) {
		this.fnames = fnames;
	}
	public Properties getFruitInfos() {
		return fruitInfos;
	}
	// Properties 객체를 저장할 메서드.
	public void setFruitInfos(Properties fruitInfos) {
		this.fruitInfos = fruitInfos;
	}
	public String toString() {
		return "FruitShop [fruit="+fnames+", fruitInfos="+fruitInfos+"]";
	}
	
}
