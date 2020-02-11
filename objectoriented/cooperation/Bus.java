package objectoriented.cooperation;

public class Bus {

    int busNumber;
    int passengerCount;
    int money;

    public Bus(int busNumber) {
        this.busNumber = busNumber;
    }

    public void take(int money) { // 승차 method
        this.money += money;
        // 돈이 들어오는 만큼 자기 멤버의 값에 더함
        passengerCount++;
    }

    public void showInfo() {
        System.out.println(busNumber + "번 버스의 승객은 " + passengerCount + "명 이고, 수입은 " + money + "입니다!");
    }
}
