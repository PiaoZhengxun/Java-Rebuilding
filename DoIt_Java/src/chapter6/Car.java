package chapter6;

public class Car {
	public static int serialNum = 10000;
	public int carNum;
	
	public Car() {
		serialNum++;
		carNum = serialNum;
	}
	
	public void setCarNum(int serialNum) {
		
		this.carNum = serialNum;
	}
	
	public int getCarNum() {
		return this.carNum;
	}

}
