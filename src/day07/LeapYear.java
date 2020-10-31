package day07;
/*
1. create a class called LeapYear, and write a program that can identify if the given is Leap Year,
 print true if it's leap year, otherwise print false
        Ex:
            year = 2020  ==> short;
            LeapYear =true/false;
        output:
            2020 is leap year: true
            Assume that any year that can be divisble by 4 is leap year
    2. write a program that can check if a number is evenly divisible by 2, 3, 5
            Ex:
                number = 65;

            output:
                65 is divisible by 2: false
                65 is divisible by 3: false
                65 is divisible by 5: true
 */
public class LeapYear {
    public static void main(String[] args) {
        short year = 2018;
        //  leapYear ==>  year%4 == 0
        boolean leapYear = year % 4 ==0;

        System.out.println(year +" is a Leap year: "+leapYear);

        //output:
     //   2020 is a leap year: true

/*2. write a program that can check if a number is evenly divisible by 2, 3, 5
            Ex:
                number = 65;

            output:
                65 is divisible by 2: false
                65 is divisible by 3: false
                65 is divisible by 5: true
 */
        int n = 65;

        boolean b1 = n % 2 == 0;
        boolean b2 = n % 3 == 0;
        boolean b3 = n % 5 == 0;

        System.out.println(n +" is divisible by 2: "+ b1);
        System.out.println(n +" is divisible by 3: "+ b2);
        System.out.println(n +" is divisible by 5: "+ b3);







    }







}
