package CardRank_02;

import java.util.Scanner;

public class CardRanks {
    enum CardRank{
        ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        if(s.equals("Card Ranks")) {
            System.out.println("Card Ranks:");
            CardRank[] values = CardRank.values();
            for (CardRank value : values) {
                System.out.printf("Ordinal value: %d; Name value: %s%n", value.ordinal(), value);
            }
        }
    }
}
