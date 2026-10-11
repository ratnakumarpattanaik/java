import java.util.Scanner;
public class prog2 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a,b;
    System.out.println("enter the 1st number");
        a=sc.nextInt();
    System.out.println("enter the 2nd number");
        b=sc.nextInt();
    int sum = a + b;
    int subtract = a - b;
    int product = a * b;
    int divide = a / b;
        System.out.println("sum: " + sum);
        System.out.println("subtract: " + subtract);
        System.out.println("product: " + product);
        System.out.println("divide: " + divide);
    }
}