package ch06.book.s060803;

public class CarExample {
	public static void main(String[] args) {
		Car myCar = new Car();
		myCar.keyTurnOn();
		myCar.run();
		int speed = myCar.getspeed();
		System.out.println("현재 속도: "+ speed + "km/h");
	}
}
