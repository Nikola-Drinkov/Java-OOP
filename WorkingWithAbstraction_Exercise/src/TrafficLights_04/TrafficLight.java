package TrafficLights_04;

public class TrafficLight {


    public enum Signal{
        RED,
        GREEN,
        YELLOW
    }
    private Signal signal;
    public TrafficLight(Signal signal) {
        this.signal = signal;
    }
    public Signal getSignal() {
        return signal;
    }
    public void update() {
        switch (signal){
            case RED:
                this.signal=Signal.GREEN;
                break;
            case GREEN:
                this.signal=Signal.YELLOW;
                break;
            case YELLOW:
                this.signal=Signal.RED;
                break;
        }
    }
}
