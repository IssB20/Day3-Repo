package day10_Practices;
/*1. write a program that can identify if the given character character is Alphabetic
            ex:
                character = 'a'
            output:
                a is an Alphabetic
                character  = '!'
            output:
                ! is not  anAlphabetic
        Hint:
                ascii table:
                        65 ~ 90 ==> A~Z
                        97 ~ 122 ==> a~z
 */
public class task1_alphabetic {
    public static void main(String[] args) {
        char cha = 122;
       boolean alphabetic = cha >=65 && cha<= 90 || cha >=97 && cha <=122;
       boolean notAlphabetic = ! alphabetic;

        if( alphabetic == true){
            System.out.println(cha+ " is an Alphabetic");
        }else{
            System.out.println(cha+ " is not an Alphabetic");
        }











    }
}
