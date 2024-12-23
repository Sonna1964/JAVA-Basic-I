package AmericanFlag;

public class Flags {
    public static void main(String[] args) {
        String a = "* * * * * * ======================================\n * * * * *  ======================================";     
        String b = "==================================================";

        for (int i = 0; i < 2; i++) {
            System.out.println(a);
        }

        System.out.println("* * * * * * ======================================");

        for (int i = 0; i < 6; i++) {
            System.out.println(b);
        }
    }
}
