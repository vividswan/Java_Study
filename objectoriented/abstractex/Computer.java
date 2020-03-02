package objectoriented.abstractex;

// 추상 클래스 => 상위 클래스용으로 사용이 된다.
public abstract class Computer {
	
	public abstract void display();
	public abstract void typing();
	
	public void turnOn() {
		System.out.println("전원을 킵니다.");
	}
	
	public void turnOff() {
		System.out.println("전원을 킵니다.");
	}
}
