package objectoriented.thispractice;

public class Person {

    // this => 객체지향에서 자기자신을 나타냄(super => 자신의 상위 클래스)
    // 1. 자기 자신의 메모리를 가리킴
    // 2. 생성자에서 다른 생성자를 호출함
    // 3. 인스턴스 자신의 주소를 반환

    String name;
    int age;

    public Person() {
        // this.name="이름없음";
        // this.age=1;
        this("이름 없음", 1); // 초기화
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void showInfo() {
        System.out.println(name + "," + age);
    }

    public Person getSelf() { // 주소를 반환, 반환타입 => 클래스 자기자신
        return this;
    }
}