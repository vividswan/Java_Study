package objectoriented.templatemethod;

public abstract class Car {

	public abstract void drive();
	public abstract void stop();
	
	public void startCar() {
		System.out.println("시동을 켭니다.");
	}
	
	public void turnOff() {
		System.out.println("시동을 끕니다.");
	}
	
	public void washCar() {
		
	};
	
	final public void run() {
		// final => 재정의 할 수 없게 함
		startCar();
		drive();
		stop();
		turnOff();
		washCar();
	}
}
