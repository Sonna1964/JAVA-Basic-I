package SwapVaribleValues;

public class Swapp {
    public static void main(String[] args) {
        int a = 5;
        int b = 6;
        int temp;

        System.out.println("Before Value of a " + a);
        System.out.println("Before Value of b " + b);

        
        temp = a;
        a = b;
        b = temp;

        System.out.println("Now Value of a " + a);
        System.out.println("Now Value of b " + b);
    }
}
