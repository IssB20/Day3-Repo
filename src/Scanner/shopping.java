package Scanner;

import java.util.Scanner;

public class shopping {
    public static void main(String[] args) {

        Scanner scan = new Scanner (System.in);
        int a = 19;
        System.out.println("Enter Item1, count and its price:"+a+"\"");
        String item1 = scan.next();
        int count1 = scan.nextInt();
        Double price1 = scan.nextDouble();


        System.out.println("Enter Item2, count and its price:");
        String item2 = scan.next();
        int count2 = scan.nextInt();
        Double price2 = scan.nextDouble();


        System.out.println("Enter Item3, count and its price:");
        String item3 = scan.next();
        int count3 = scan.nextInt();
        Double price3 = scan.nextDouble();


        double totalPrice = 0.09;
        String report = "";

        if ( count2 == 0) {
            totalPrice = (count1 * price1) + (count3 * price3);
            report = "Item1: " + item1 + " Price: " + (count1 * price1) + ", " + item3 + " Price: " + (count3 * price3);

        } if ( count3 == 0) {

            totalPrice = (count1 * price1) + (count2 * price2);
            report = "Item1: " + item1 + " Price: " + (count1 * price1) + ", " + item2 + " Price: " + (count2 * price2);

        }
        System.out.println(report);
        System.out.println("Total price: " + totalPrice);

    }

    }