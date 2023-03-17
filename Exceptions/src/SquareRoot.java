import java.util.Scanner;

public class SquareRoot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        try {
            int num = Integer.parseInt(s);
            if(num<0){
                System.out.println("Invalid number");
            }
            else{
                double root = Math.sqrt(num);
                System.out.printf("%.2f%n",root);
            }

        }
        catch (NumberFormatException e){
            System.out.println("Invalid");
        }
        finally {
            System.out.println("Goodbye");
        }
    }
}
