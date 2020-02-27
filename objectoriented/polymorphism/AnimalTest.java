package objectoriented.polymorphism;

// 폴리모피즘 => 하나의 코드가 다양한 구현을 가질 수 있음

class Animal {
	
	public void move() {
		System.out.println("동물이 움직입니다.");
	}
}

class Human extends Animal{
	public void move() {
		System.out.println("사람이 움직입니다.");
	}
	
	public void readBook() {
		System.out.println("사람이 책을 읽습니다.");
	}
}

class Tiger extends Animal{
	public void move() {
		System.out.println("호랑이가 네 발로 뜁니다.");
	}
}

class Eagle extends Animal{
	public void move() {
		System.out.println("독수리가 네 발로 뜁니다.");
	}
}


public class AnimalTest {

	public static void main(String[] args) {
		
		Animal hAnimal = new Human();
		Animal tAnimal = new Tiger();
		Animal eAnimal = new Eagle();
		
		AnimalTest test = new AnimalTest();
		test.moveAnimal(hAnimal);
		test.moveAnimal(tAnimal);
		test.moveAnimal(eAnimal);
		
		
		
	}
	
	
	public void moveAnimal(Animal animal) {
		animal.move();
	}
	
}
