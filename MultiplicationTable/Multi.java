package MultiplicationTable;

import java.util.Scanner;

public class Multi {
    public static void main(String[] args) {
        //take a Input from console
        Scanner input = new Scanner(System.in);
        System.out.print("Input a number for create multiplication table : ");
        int num = input.nextInt();

        for (int i = 0; i < 10; i++) {
            int a = i + 1;
            int b = a * num;
            System.out.println(num + " * " + a + " = " + b);
        }
    }
}
