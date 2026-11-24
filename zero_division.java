import java.util.Scanner;

public class zero_division {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the dividend: ");
        int a = s.nextInt();

        System.out.print("Enter the divisor: ");
        int b = s.nextInt();
        s.close();

        try {
            int c = a / b;
            System.out.println("Result: " + c);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        }
    }
}
