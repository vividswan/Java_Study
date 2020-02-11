package objectoriented.cooperation;

public class Student {

    String name;
    int grade;
    int money;

    public Student(String name, int money) {
        this.name = name;
        this.money = money;
    }

    // 객체 협업
    public void takeBus(Bus bus) {
        bus.take(1000);
        this.money -= 1000;
    }

    // 객체 협업
    public void takeSubway(Subway subway) {
        subway.take(1200);
        this.money -= 1200;
    }

    public void showInfo() {
        System.out.println(name + "의 남은 돈은 " + money + "입니다!");
    }
}
