import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EnterNumbers {
    private static Scanner sc;
    public static void main(String[] args) {
        int start = 1;
        int end = 100;
        List<Integer> numbers = new ArrayList<>();
        while (numbers.size()<10){
            try {
                start = readNumber(start, end);
                numbers.add(start);
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
        System.out.println(numbers.toString().replaceAll("[\\[\\]]",""));
    }
    public static int readNumber(int start, int end){
        sc = new Scanner(System.in);
        String s = sc.nextLine();
        int num;
        try {
            num = Integer.parseInt(s);
        }catch (NumberFormatException e){
            throw new IllegalArgumentException("Invalid Number!");
        }
        if(num<=start||num>=end) throw new IllegalArgumentException(String.format("Your number is not in range %d - %d!",start,end));

        return num;
    }


}
