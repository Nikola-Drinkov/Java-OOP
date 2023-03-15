package Telephony;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> numbers = Arrays.stream(sc.nextLine().split(" ")).collect(Collectors.toList());
        List<String> urls = Arrays.stream(sc.nextLine().split(" ")).collect(Collectors.toList());

        Smartphone smartphone = new Smartphone(numbers,urls);

        String calls = smartphone.call();
        String browses = smartphone.browse();
        System.out.print(calls);
        System.out.print(browses);
    }
}
