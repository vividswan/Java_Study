package objectoriented.cooperation;

public class TakeTransTest {

    public static void main(String[] args) {
        Student studentPark = new Student("Soohwan", 10000);
        Student studentKim = new Student("Sungsoo", 5000);

        Bus bus100 = new Bus(100);
        Bus bus200 = new Bus(200);
        Subway subwayBlue = new Subway(4);
        Subway subwayGreen = new Subway(2);

        studentPark.takeBus(bus100);
        studentPark.takeSubway(subwayBlue);

        studentPark.showInfo();
        // Soohwan의 남은 돈은 7800입니다!
        studentKim.showInfo();
        // Sungsoo의 남은 돈은 5000입니다!

        bus100.showInfo();
        // 100번 버스의 승객은 1명 이고, 수입은 1000입니다!
        bus200.showInfo();
        // 200번 버스의 승객은 0명 이고, 수입은 0입니다!

        subwayBlue.showInfo();
        // 4번 버스의 승객은 1명 이고, 수입은 1200입니다!
        subwayGreen.showInfo();
        // 2번 버스의 승객은 0명 이고, 수입은 0입니다!
    }

}
