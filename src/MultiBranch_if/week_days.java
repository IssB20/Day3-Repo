package MultiBranch_if;
/*

2. Write an if statement that will print day of the week based on value of the day variable.
           ex: num = 1 output: "Monday"
               num 8  output: "There is no such a day!"
              num = 3 output: "Wednesday"
*/
public class week_days {
    public static void main(String[] args) {
        int num = 5;
        String day ="";
        if(num==1){
            day = "Monday";
        }else if(num==2){
            day = "Tuesday";
        }else if(num==3){
            day ="Wednesday";
        }else if(num == 4){
            day = "Thursday";
        }else if(num == 5){
            day = "Friday";
        }else if( num == 6){
            day = "Saturday";
        }else if(num == 7){
            day ="Sunday";
        }else {
            day =" there is no such a day!";
        }
        System.out.println(day);

        System.out.println("================================");

        if(num>=1 && num<=7){
            if(num==1){
                day = "monday";
            }else if(num==2){
                day = "tuesday";
            }else if(num ==3){
                day =" wednesday";
            }else if(num ==4){
                day = "thursday";
            }else
                day = "rest of days";
        }else{
            day= " thers is no such a day!!";
        }

        System.out.println(day);



    }
}
