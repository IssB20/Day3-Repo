package day07_Practices;
/*
  1. write a java program that converts gallons to liters
                        1 gallon = 3.785 liters
                        1 litter = 1/3.785
    2. write a java program that converts litters to gallons
                        1 gallon = 3.785 liters
                        1 litter = 1/3.785
 */
public class gallon_litters {
    public static void main(String[] args) {
        // gallon to litters;

       // double gallon = 3.785 l;
       // double litter = 1/gallon;
        // x gallon =  x * 3.785 litter
        double gallon =4;
        double g = 4;
        gallon *= 3.785; // gallon = 3.785 liter

        System.out.println(g+ " gallon = "+gallon+" liters");
        System.out.println("=============");

        // convert liter to gallon
        // 1 liter = 1/gallon ==> 1 liter = 1 / 3.785
        double litter = 10;
         double       l = 10;
        litter /= 3.875;
        System.out.println( l+" litter = "+litter+" gallon");












    }







}
