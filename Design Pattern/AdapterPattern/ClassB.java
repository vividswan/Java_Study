public class ClassB {
	void runClassB() {
		System.out.println("ClassB의 메서드가 실행");
	}
}

class AdapterClassB{
	ClassB classB = new ClassB();
	void runClass() {
		classB.runClassB();
	}
}