package a01_diexp.vo;

import java.util.Properties;
import java.util.Set;
// a01_diexp.vo.Sensor
public class Sensor {
	// set과 properties를 할당할 수 있는 객체 선언.
	private Set<String> agent;
	private Properties addInfo;
	public Sensor() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Set<String> getAgent() {
		return agent;
	}
	// Set객체를 활용할 때, 호출되는 메서드
	public void setAgent(Set<String> agent) {
		this.agent = agent;
	}
	public Properties getAddInfo() {
		return addInfo;
	}
	// Properties를 저장할 때, 호출되는 메서드..
	public void setAddInfo(Properties addInfo) {
		this.addInfo = addInfo;
	}
	public String toString() { // 참조변수만으로 리턴되는 내용을 기술한 메소드..
		// 현재 객체가 가지고 있는 collection 내용을 문자열로 처리하게 리턴..
		return "Sensor [agent="+agent+", addInfo="+addInfo+"]";
	}
	
	
}
