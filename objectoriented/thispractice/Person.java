package objectoriented.thispractice;

public class Person {
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