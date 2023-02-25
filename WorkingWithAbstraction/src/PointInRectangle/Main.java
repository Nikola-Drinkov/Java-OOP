package PointInRectangle;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] input = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        Point bottomLeft = new Point(input[0],input[1]);
        Point topRight = new Point(input[2],input[3]);
        Rectangle rectangle = new Rectangle(bottomLeft,topRight);
        int n = Integer.parseInt(sc.nextLine());
        for(int i=0; i<n; i++){
            int[] inputPoints = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            Point currentPoint = new Point(inputPoints[0],inputPoints[1]);
            System.out.println(rectangle.contains(currentPoint));
        }
    }
}
