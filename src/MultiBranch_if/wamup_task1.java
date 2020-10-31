package MultiBranch_if;
/*
1. write a java program that can convert numbers between 0 ~ 9 to words, if the number
 is greater than 9 or less than zero, out put should be "Invalid".
    2. write a program that can find the number of days in a month
        (Assume that Feb has 28 days)
         HINT:
                28 days: 2
                30 days: 4,6,9,11
                31 days: 1,3,5,7,8,10,12
 */
public class wamup_task1 {
    public static void main(String[] args) {
        int num = 1;
        String word ="";
        if(num >0 && num <=9){
             word ="words";
        }else {
             word ="Invalid";
        }
        System.out.println(word);

        System.out.println("=====================================");





    }
}
