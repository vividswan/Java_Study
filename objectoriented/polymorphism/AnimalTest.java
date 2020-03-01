package objectoriented.polymorphism;

import java.util.ArrayList;

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
	
	public void readBooks() {
		System.out.println("사람이 책을 읽습니다.");
	}
}

class Tiger extends Animal{
	public void move() {
		System.out.println("호랑이가 네 발로 뜁니다.");
	}
	
	public void hunting() {
		System.out.println("호랑이가 사냥을 합니다.");
	}
}

class Eagle extends Animal{
	public void move() {
		System.out.println("독수리가 네 발로 뜁니다.");
	}
	
	public void flying() {
		System.out.println("독수리가 날개를 쭉 펴고 멀리 날아갑니다.");
	}
}


public class AnimalTest {

	public static void main(String[] args) {
		
		Animal hAnimal = new Human();
		Animal tAnimal = new Tiger();
		Animal eAnimal = new Eagle();
		
	//  Eagle human = (Eagle)hAnimal; => Human을 Eagle로 강제 캐스팅하면 오류! 
		/*
		if(hAnimal instanceof Human) { // 인스턴스 타입 확인(안정적인 형 변환)
			Human human = (Human)hAnimal; // 다운캐스팅
			human.readBooks();
			// 오버라이딩이 불가능한 method를 사용해야할 땐 다운캐스팅 활용!
		}
		*/

		
		/*AnimalTest test = new AnimalTest();
		test.moveAnimal(hAnimal);
		test.moveAnimal(tAnimal);
		test.moveAnimal(eAnimal);
		*/
		
		ArrayList<Animal> animalList = new ArrayList<Animal>();
		animalList.add(hAnimal);
		animalList.add(tAnimal);
		animalList.add(eAnimal);
		
		
		AnimalTest test = new AnimalTest();
		test.testDownCasting(animalList);
		
		/*
		for(Animal animal : animalList) {
			animal.move();
		}
		*/
		
	}
	
	public void testDownCasting(ArrayList<Animal> list) {
		for(int i=0; i < list.size(); i++) {
			Animal animal = list.get(i);
			
			if( animal instanceof Human) {
				Human human = (Human)animal;
				human.readBooks();
			}
			else if ( animal instanceof Tiger) {
				Tiger tiger = (Tiger)animal;
				tiger.hunting();
			}
			else if ( animal instanceof Eagle) {
				Eagle eagle = (Eagle)animal;
				eagle.flying();
			}
			else System.out.println("error");
			
			
		}
	}
	
	
	public void moveAnimal(Animal animal) {
		animal.move();
	}
	
}
