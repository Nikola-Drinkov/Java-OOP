package _04_FoodShortage;

import java.util.*;

public class _04_FoodShortageMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Buyer> buyingPeople = new HashMap<>();
        int numPeople = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < numPeople; i++) {
            String paramsString = scanner.nextLine();
            String[] personParams = paramsString.split("\\s+");
            switch (personParams.length) {
                case 3:
                    Rebel rebel = new Rebel(personParams[0], Integer.parseInt(personParams[1]), personParams[2]);
                    buyingPeople.put(rebel.getName(), rebel);
                    break;
                case 4:
                    Citizen citizen = new Citizen(personParams[0], Integer.parseInt(personParams[1]), personParams[2], personParams[3]);
                    buyingPeople.put(citizen.getName(), citizen);
                    break;
                default:
                    throw new IllegalStateException("Unknown input: " + paramsString);
            }
        }

        FoodShortageHandler handler = new FoodShortageHandler(buyingPeople, "End");

        handler.readAndHandleCommandsToEnd(scanner);

        System.out.println(buyingPeople.values().stream().mapToInt(Buyer::getFood).sum());
    }
}
