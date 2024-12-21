package ArithmaticOperations;

import java.util.Scanner;

public class Operations {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input first number : ");
        int a = input.nextInt();
        System.out.print("Input second number : ");
        int b = input.nextInt();
        //  a+b
        System.out.println(a + " + " + b + " = " + (a+b));
        //  a-b
        System.out.println(a + " - " + b + " = " + (a-b));
        //  a*b
        System.out.println(a + " * " + b + " = " + (a*b));
        //  a/b
        System.out.println(a + " / " + b + " = " + (a/b));
        //  a%b
        System.out.println(a + " % " + b + " = " + (a%b));
    }
}
