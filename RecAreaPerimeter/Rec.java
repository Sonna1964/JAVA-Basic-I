package RecAreaPerimeter;

import java.util.Scanner;

public class Rec {
    public static void main(String[] args) {
        //input width
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a value for width : ");
        int a = input.nextInt();
        //input height
        System.out.print("Enter a value for height : ");
        int b = input.nextInt();
        //display area 
        int area = a * b;
        System.out.println("Area of given square is : " + area);
        //display perimeter
        int perimeter = 2 * ( a + b );
        System.out.println("Perimeter of given square : " + perimeter);
    }
}
