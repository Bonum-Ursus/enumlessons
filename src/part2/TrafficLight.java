package part2;
enum Signal {GREEN, YELLOW1, YELLOW2, RED}
public class TrafficLight {
    Signal color = Signal.RED;
    public void change(){
        switch (color){
            case RED:
                color = Signal.YELLOW1;
                break;
            case GREEN:
                color = Signal.YELLOW2;
                break;
            case YELLOW1:
                color = Signal.GREEN;
                break;
            case YELLOW2:
                color = Signal.RED;
                break;
            default:
                color = Signal.YELLOW1;
        }
    }

    @Override
    public String toString() {
        return "Traffic light is " + color;
    }

    public static void main(String[] args) {
        TrafficLight t = new TrafficLight();
        for (int i = 0; i < 7; i++) {
            System.out.println(t);
            t.change();
        }
    }
}
