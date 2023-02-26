package CardSuit_01;

import java.util.Scanner;

public class CardSuit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            System.out.println("Card Suits:");
            Suits[] values = Suits.values();
            for (Suits value : values) {
                System.out.printf("Ordinal value: %d; Name value: %s%n", value.ordinal(), value);
            }
    }
}
