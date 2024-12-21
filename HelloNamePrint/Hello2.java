import java.util.Scanner;

public class Hello2 {
    public static void main(String[] args) {
        //create the Scanner Object to read input from console
        Scanner input = new Scanner(System.in);
        //tell user to input the first number in to the console
        System.out.print("Input your first name : ");
        String fname = input.next();
        //tell user to input the second number in to the console
        System.out.print("Input your last name : ");
        String lname = input.next();
        //concatinante the 2 names and output to the console as a greeting msg
        System.out.println("Your name is : " + fname + " " + lname);
    }
}
