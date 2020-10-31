package day9_practices;
/*
 1. write a java program that accepts three numbers and return the maximum number
                (assume that none of them are equal)
    2. write a java program that accepts three numbers and return the minimum number
                (assume that none of them are equal)
    3. write a java program that accepts three numbers and rteurn the mediam number
                (assume that none of them are equal)

 */
public class task1_maxNumber {
    public static void main(String[] args) {

        int num1 = 5;
        int num2 = 10;
        int num3 = -4;

        if( num1 > num2 && num1 > num3){
            System.out.println( num1 + " is the max number");
        }
        if(num2 > num1 && num2 > num3) {
            System.out.println(num2 + " is the max number ");
        }
        if(num3 > num1 && num3 > num2){
            System.out.println(num3 + " is the max number");
        }

        if(num1<num2 && num1<num3){
            System.out.println(num1 + " is the minimum number");
        }
        if(num2<num1 && num2<num3){
            System.out.println(num2+ " is the minimum number");
        }
        if(num3<num1 && num3 < num2){
            System.out.println(num3 +" is the minimum number");
        }

        if((num1 > num2 && num1 < num3) || (num1 < num2 && num1> num3) ){
            System.out.println(num1+ " is the medium number");
        }
        if((num2 > num1 && num2 < num3)||(num2 < num1 && num2 > num3 )){
            System.out.println(num2+ " is the medium number");
        }
        if((num3 > num1 && num3 < num2 )|| (num3 < num1 && num3 > num2)){
            System.out.println(num3+ " is the medium number");
        }











    }
}
