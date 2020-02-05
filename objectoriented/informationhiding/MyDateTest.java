package objectoriented.informationhiding;

public class MyDateTest {

    public static void main(String[] args) {

        MyDate date = new MyDate();
        date.setYear(2020);
        date.setMonth(21);
        date.setDay(5);
        date.showDate(); // 유효하지 않은 값입니다. 출력

        date.setMonth(2);
        date.showDate(); // 2020년 2월 5일 출력

    }
}
