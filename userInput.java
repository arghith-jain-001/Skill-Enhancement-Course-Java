import java.util.Scanner;

public class userInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number 1: ");
        int a = sc.nextInt();

        System.out.print("Enter number 2: ");
        int b = sc.nextInt();

        System.out.print("Enter number 3: ");
        int c = sc.nextInt();

        sc.close();

        if (a < b) {
            if (b < c) {
                System.out.println(c + " is the largest number");
            } else {
                System.out.println(b + " is the largest number");
            }
        } else if (a < c) {
            System.out.println(c + " is the largest number");
        } else {
            System.out.println(a + " is the largest number");
        }

        if (a > b && a > c) {
            System.out.println(a + " is the largest number");
        } else if (b > a && b > c) {
            System.out.println(b + " is the largest number");
        } else {
            System.out.println(c + " is the largest number");
        }

    }
}
