import java.util.Scanner;
public class prog3 {
    public static void main(String[] args) {
        int r;
        double a;

        System.out.println("Enter the radius of circle");
        Scanner sc = new Scanner(System.in);

        r = sc.nextInt();
        a = 3.14 * r * r;

        System.out.println("Area of circle = " + a);
        sc.close();
    }
}
