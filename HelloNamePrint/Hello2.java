import java.util.Scanner;

public class Hello2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input your first name : ");
        String fname = input.next();
        System.out.print("Input your last name : ");
        String lname = input.next();
        System.out.println("Your name is : " + fname + " " + lname);
    }
}
