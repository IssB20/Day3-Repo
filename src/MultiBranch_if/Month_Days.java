package MultiBranch_if;

import sun.font.DelegatingShape;

/*
1. write a program that can find the number of days in a month
        (Assume that Feb has 28 days)
   ex:  month = 3 output: 31 days
        month = 4 output: 30 days
        month = 13 output: Invalid month
             HINT: 28==> days: 2
                   30==> days: 4,6,9,11
                   31==> days: 1,3,5,7,8,10,12
 */
public class Month_Days {
    public static void main(String[] args) {

        int month = 899;

        String d = "days";

        if(month == 2){
            d =28+" "+d;

        }else if((month >=1 && month<=7 && month%2!=0 )||(month==8||month==10 || month==12)){
            d =31+" "+d;

        }else if(month==4||month==6||month==9||month==11){
            d = 30+" "+d;

        }else {
            d = "invalid month";
        }
        System.out.println(d);

        System.out.println("============================");

        if(month>=1 && month<=12){
            if(month==2){
                d ="28 days";
            }else if(month ==4 || month==6 ||month==9 ||month==11){
                d ="30 days";
            }else {
                d ="31 days";
            }
        }else{
            d = "Invalid Month";

        }
        System.out.println(d);


    }
}
