package a01_diexp.vo;

public class Apartment {
	private int groupNum;
	private int roomNum;
	public Apartment() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Apartment(int groupNum, int roomNum) {
		super();
		this.groupNum = groupNum;
		this.roomNum = roomNum;
	}
	public int getGroupNum() {
		return groupNum;
	}
	public void setGroupNum(int groupNum) {
		this.groupNum = groupNum;
	}
	public int getRoomNum() {
		return roomNum;
	}
	public void setRoomNum(int roomNum) {
		this.roomNum = roomNum;
	}
	
}
