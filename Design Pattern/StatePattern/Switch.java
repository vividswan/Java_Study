public class Switch {

    public void setState(State state) {
        this.state = state;
    }

    private State state;

    public Switch(){
        state = new OFF();
    }

    public void getONSwich(){
        state.getONSwich(this);
    }

    public void getOFFSwitch(){
        state.getOFFSwitch(this);
    }
}
