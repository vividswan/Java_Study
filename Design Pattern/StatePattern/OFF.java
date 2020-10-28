public class OFF implements State{
    @Override
    public void getONSwich(Switch testSwitch) {
        testSwitch.setState(new ON());
        System.out.println("스위치가 켜졌습니다.");
    }

    @Override
    public void getOFFSwitch(Switch testSwitch) {
        System.out.println("이미 OFF 상태입니다.");
    }
}
