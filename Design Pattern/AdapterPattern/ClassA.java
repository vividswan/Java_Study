public class ClassA {
	void runClassA() {
		System.out.println("ClassA의 메서드가 실행");
	}
}

class AdapterClassA{
	ClassA classA = new ClassA();
	void runClass() {
		classA.runClassA();
	}
}