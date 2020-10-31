package Scanner;

import java.util.Scanner;

public class LethalDose {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter number of milligrams in drink:");

        int numOfMilligrams   = scan.nextInt();
        int drinks = 10*1000/numOfMilligrams;

        System.out.println("It would take about "+drinks+" drinks for a lethal overdose.");







    }
}
