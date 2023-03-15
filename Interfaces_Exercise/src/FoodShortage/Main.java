package FoodShortage;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        List<Citizen> citizens = new ArrayList<>();
        List<Rebel> rebels = new ArrayList<>();
        for(int i=0; i<n; i++){
            String[] inputParts = sc.nextLine().split(" ");
            String name = inputParts[0];
            int age = Integer.parseInt(inputParts[1]);
            if(inputParts.length==4){
                String id = inputParts[2];
                String birthdate = inputParts[3];

            }
        }
    }
}
