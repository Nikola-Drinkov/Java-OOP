import java.util.Scanner;

public class RhombusOfStars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        if(n==1){
            System.out.println("*");
            return;
        }
        for(int i=1; i<=n; i++){
            printRow(i,n-i);
        }
        for(int i=n-1; i>0; i--){
            printRow(i, n-i);
        }
    }

    private static void printRow(int numberOfStars, int numberOfSpaces) {
        for(int i=0; i<numberOfSpaces; i++){
            System.out.print(" ");
        }
        for(int i=0; i<numberOfStars; i++){
            System.out.print("* ");
        }
        System.out.println();
    }
}
