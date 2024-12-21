package Division2num;

import java.util.Scanner;

public class Division2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input a number for number 1 : ");
        int num1 = input.nextInt();
        System.out.print("Input a number for divide number 1 : ");
        int num2 = input.nextInt();
        int res = num1 / num2;
        System.out.println("when " + num1 + " " + "divided by " + num2 + "\nthe result is : " + " " + res);

    }
}
