package a01_diexp.vo;

import java.util.ArrayList;

public class Bus {
	private int no;
	private ArrayList<Passenger> passList;
	public Bus() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Bus(int no) {
		super();
		this.no = no;
	}
	public void showPassenger() {
		System.out.println( no+"번 버스의 탑승객 ");
		if(passList!=null) {
			System.out.println("이름\t나이");
			for(Passenger pass:passList) {
				System.out.println(pass.getName()+"\t"+pass.getAge());
			}
		}else {
			System.out.println("탑승객에 없습니다.");
		}
		
	}
	
	
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public ArrayList<Passenger> getPassList() {
		return passList;
	}
	public void setPassList(ArrayList<Passenger> passList) {
		this.passList = passList;
	}

	
}
