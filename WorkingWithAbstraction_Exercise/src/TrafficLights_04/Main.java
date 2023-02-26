package TrafficLights_04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputLight = sc.nextLine();
        String[] trafficLightsArr = inputLight.split(" ");

        TrafficLight[] trafficLights = new TrafficLight[trafficLightsArr.length];
        for(int i=0; i<trafficLightsArr.length; i++){
            String s = trafficLightsArr[i];
            TrafficLight.Signal signal = TrafficLight.Signal.valueOf(s);
            trafficLights[i] = new TrafficLight(signal);
        }

        int n = Integer.parseInt(sc.nextLine());
        for(int i=0; i<n; i++){
            updateTrafficLights(trafficLights);
            printTrafficLights(trafficLights);
        }
    }
    private static void printTrafficLights(TrafficLight[] trafficLights){
        for(TrafficLight trafficLight:trafficLights){
            System.out.print(trafficLight.getSignal()+" ");
        }
        System.out.println();
    }
    private static void updateTrafficLights(TrafficLight[] trafficLights){
        for(TrafficLight trafficLight:trafficLights){
            trafficLight.update();
        }
    }
}
