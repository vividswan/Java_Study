package objectoriented.thispractice;

public class PersonTest {

    public static void main(String[] args) {

        Person noNamePerson = new Person();
        noNamePerson.showInfo(); // 이름 없음,1 출력

        Person personPark = new Person("Park", 29);
        personPark.showInfo(); // Park,29 출력
        System.out.println(personPark);

        Person p = personPark.getSelf();
        System.out.println(p); // System.out.println(personPark) 과 같은 값은 값 출력
    }

}