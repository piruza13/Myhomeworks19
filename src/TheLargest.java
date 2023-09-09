import java.util.Scanner;
public class TheLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("First number is: ");
        int a = sc.nextInt();

        System.out.println("Second number is: ");
        int b = sc.nextInt();

        System.out.println("Third number is: ");
        int c = sc.nextInt();

        if (a > b && a > c) {
            System.out.println("The largest number is:" + a);
        } else if (b > a && b > c) {
            System.out.println("The largest number is:" + b);
        } else {
            System.out.println("The largest number is:" + c);
        }
    }
}
