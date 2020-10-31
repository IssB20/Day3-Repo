package Scanner;
import java.util.Scanner;
public class CandyCoupon {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter number of coupons:");
        int coupons = scan.nextInt();
        int candybar = coupons /10;
        int gumball =  coupons%10/3;

        if(coupons>=10){
            System.out.println("Number of Candies: "+candybar);
            System.out.println("number of Gumballs: "+gumball);
        }else{
            System.out.println("Not enough coupons");
        }




    }
}
