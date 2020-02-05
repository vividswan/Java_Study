package objectoriented.informationhiding;

public class MyDate {

    // private이기 때문에 다른 클래스에서 참조 불가능
    private int day;
    private int month;
    private int year;

    private boolean isValid; // boolean은 초기변수 일 때 default가 false

    // private한 속성을 불러오는 방법

    // 통상적인 이름 set
    public void setDay(int day) {
        this.day = day;
        // this.day의 day는 위의 private int day, 우측 day는 setDay의 변수 day
    }

    // 통상적인 이름 get
    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        if (month < 1 || month > 12) { // public과 다르게 특정 조건 핸들링 가능(정보 보안, 보호)
            isValid = false;
        } else {
            isValid = true;
            this.month = month;
        }
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    // public과 다르게 특정변수의 get, set 조정 가능

    public void showDate() {
        if (isValid) {
            System.out.println(year + "년 " + month + "월 " + day + "일");
        }

        else {
            System.out.println("유효하지 않은 값입니다.");
        }
    }
}
