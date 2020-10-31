package Task03;

public class Practice_itenery {
    public static void main(String[] args) {

        int x = 0;
       String text = "";
        text  =(x>=5)? "enter number: "+x : "enter number: "+-x;
        System.out.println(text);

       int age = 0;

        String school ="";

        school = (age ==2)? age+" toddler" :(age>=3 && age<=5)? age+" early childhood" :
                (age==6 || age==7)? age+" young reader" : (age>=8 && age<=10)? age+" elementary" :
                        (age==11 ||age==12)? age+" middle" : (age==13)? age+" impossible" :
        (age>=14 && age <=16)? age+" high school" : (age==17 ||age==18)? age+" scholar" :
                age+" ineligible";

        System.out.println(school);
        System.out.println("===============================");
/*
 1. write a program that checks for the bigger of 3 numbers.
        you get 3 int variables: n1 , n2 and n3 (none of them are equal)
            if n1 is biggest output: "n1 is bigger"
            if n2 is biggest output: "n2 is bigger"
            if n3 is biggest output: "n3 is bigger"
            example:
                    n1 = -2
                    n2  = 2
                    n3  = 1
                output: "n2 is bigger"
            NOTE: DO NOT USE IF STATEMENT
 */
        int n1 = -2,n2 = 2, n3 = 1;
        String r="";
        r = (n1>n2 && n1>n3)? n1+" is bigger" : (n2>n1 && n2>n3)? n2+" is bigger" :
                n3+" is bigger";
        System.out.println(r);






    }
}

