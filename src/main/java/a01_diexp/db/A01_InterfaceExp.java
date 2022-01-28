package a01_diexp.db;

public class A01_InterfaceExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QuackWay soundWay = new NormalDuck();
		soundWay.sound();
		QuackWay soundWay2 = new ElectronDuck();
		soundWay2.sound();
	}

}
interface QuackWay{	
	// mybatis에서는 개발자가 인터페이스는 선언하면, 이를 상속하고 처리하는 실제 객체
	// mybatis 프레임웍에서 자동을 만들어준다.
	// 인터페이스 + xml ==> dao/mapper mybatis 프레임웍이 만들어 준다.
	void sound();	// 인터페이스의 메서드는 public abstract 이 자동으로 붙는다 즉, 추상메서드이다.
}
// 인터페이스는 implements라는 이름으로 상속하는데, 하위 클래스는 선언된 추상메서드를 반드시
// 재정의 하여야 한다.
class NormalDuck implements QuackWay{

	@Override
	public void sound() {
		// TODO Auto-generated method stub
		System.out.println("보통 오리는 꽥꽥 거린다.");
	}
	
}

class ElectronDuck implements QuackWay{

	@Override
	public void sound() {
		// TODO Auto-generated method stub
		System.out.println("로봇오리는 삑삑 거린다.");
	}
	
}
