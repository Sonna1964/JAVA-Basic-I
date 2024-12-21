package SumOfTwo;

import java.util.Scanner;

public class Sum2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Input first number : ");
        int fNumber = input.nextInt();
        System.out.print("Input Second number : ");
        int sNumber = input.nextInt();
        int res = fNumber + sNumber;
        System.out.print("Sum of inserted numbers is : " + " " + res);
    }
}
