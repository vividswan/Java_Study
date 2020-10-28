public class ON implements State{
    @Override
    public void getONSwich(Switch testSwitch) {
        System.out.println("이미 ON 상태입니다.");
    }

    @Override
    public void getOFFSwitch(Switch testSwitch) {
        testSwitch.setState(new OFF());
        System.out.println("스위치가 꺼졌습니다.");
    }
}
