public class Play implements State{
    @Override
    public void action() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Music started playing";
    }
}
