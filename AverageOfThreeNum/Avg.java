package AverageOfThreeNum;

import java.util.Scanner;

public class Avg {
    public static void main(String[] args) {
        //input three numbers
        Scanner input = new Scanner(System.in);
        System.out.print("input 1 st number : ");
        int a = input.nextInt();
        System.out.print("input 2 nd number : ");
        int b = input.nextInt();
        System.out.print("input 3 rd number : ");
        int c = input.nextInt();
        //get sum of three and divided them by 3

        int avg = (a + b + c) / 3;
        System.out.println("Average of enterd numbers by you is : " + avg);
    }
}
