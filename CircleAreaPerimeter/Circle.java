package CircleAreaPerimeter;

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        //input the radius
        Scanner input = new Scanner(System.in);
        System.out.print("Input a value for the radius : ");
        double rad = input.nextInt();

        //intiate the value for pi;
        double pi = 22/7;

        //calculate the area
        double area = pi * rad * rad;

        //calculate the perimeter
        double perimeter = 2 * pi * rad;

        //display perimeter
        System.out.println("The perimeter of a circle of radius " + rad + " is : " + perimeter);
        //display area
        System.out.println("The area of a circle of radius " + rad + " is : " + area);
    }
}
