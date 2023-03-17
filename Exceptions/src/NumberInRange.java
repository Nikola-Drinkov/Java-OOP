import java.util.Scanner;

public class NumberInRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();
        sc.nextLine();

        boolean isValid = false;
        System.out.printf("Range: [%d...%d]%n",start,end);
        while (!isValid){
            String input = sc.nextLine();
            try {
                int n = readNumInRange(input,start,end);
                isValid = true;
                System.out.println("Valid number: "+n);
            } catch (RuntimeException e){
                System.out.println("Invalid number: "+input);
            }
        }

    }
    public static int readNumInRange(String input, int start, int end){
        int n = Integer.parseInt(input);
        if (n<start||n>end){
            throw new RuntimeException("Invalid: "+n);
        }
        return n;
    }
}
