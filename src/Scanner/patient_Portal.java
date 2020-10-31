package Scanner;
import java.util.Scanner;

    public class patient_Portal {
        public static void main(String[] args) {
            //Enter your code here
            Scanner scan = new Scanner(System.in);
            System.out.println("Welcome to the patient portal!");
            System.out.println("please enter your personal information");
            System.out.println("Enter your first name");
            String firstName = scan.next();
            System.out.println("Enter your last name");
            String lastName = scan.next();

            // this part is already provided DO NOT CHANGE
            System.out.println("Enter your email");
            String email = scan.next();

            scan.nextLine();//to capture Enter key press

            System.out.println("Enter your street");
            String street = scan.nextLine();
            // continue for city
            System.out.println("Enter your city");
            String city = scan.next();
            System.out.println("Enter your state");
            String state = scan.next();
            System.out.println("Enter your zip code");
            int zipCode = scan.nextInt();
            System.out.println("Enter your work phone number");
            long workPhoneNumber = scan.nextLong();
            System.out.println("Enter your personal phone number");
            long personalPhoneNumber = scan.nextLong();
            System.out.println("Enter your age");
            int age = scan.nextInt();
            System.out.println("Enter your height");
            double height = scan.nextDouble();
            System.out.println("Enter your weight");
            double weight = scan.nextDouble();
            System.out.println("Are you married?");
            boolean isMarried = scan.nextBoolean();

            String contacts = "Contacts: work phone number-" + workPhoneNumber + ", personal phone number-" +
                    personalPhoneNumber + ", email: " + email;
            String fullName = "Full name: " + firstName + ", " + lastName;
            String address = "Address: " + street + "," + city + ", " + state + " " + zipCode;

            System.out.println("Patient personal information" + "\n" +
                    fullName + "\n" + address+"\n" + contacts + "\n" + "Age: " + age + "\n" + "Height: " + height + "\n" +
                    "Height: " + height + "\n" + "Weight: " + weight + "\n" + "Married?: " + isMarried);

        }
    }