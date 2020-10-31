package Arithmetic;
/*
1.   Write a Java program that displays the area and perimeter of
a circle that has a radius of 5.5 using the following formulas:
perimeter = 2 * radius * 𝜋
area = radius * radius * 𝜋

2.  Write a Java program that displays the area
 of a rectangle with a width of 4.5 and a height of 7.9 using the following formula:
 area = width * height

3.  Write a Java program that calculates the average of 3 numbers.
 */
public class Area_Perimeter {
    public static void main(String[] args) {

        double radius = 5.5;
        double pi = 3.14;
        double perimeter = 2 * radius * pi;
        double areaC = radius * radius * pi;
        System.out.println(perimeter);
        System.out.println(areaC);

    //2
        double w = 4.5;
        double h = 7.9;
        double areaR = w * h;
        System.out.println(areaR);

    //3 average of 3 number;
        double num1 = 10;
        double num2 = 10;
        double num3 = 10;
        int average = (int) (num1+num2+num3)/ 3;
        System.out.println(average);








    }




}
