public class Stop implements State {
    @Override
    public void action() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Music is stop";
    }

}
