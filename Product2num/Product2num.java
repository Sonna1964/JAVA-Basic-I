package Product2num;

import java.util.Scanner;

public class Product2num {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int num1 = input.nextInt();
        System.out.print("Enter second number : ");
        int num2 = input.nextInt();
        int product = num1 * num2;
        System.out.println("Product of obove 2 numbers is : " + " " + product);
    }
}
