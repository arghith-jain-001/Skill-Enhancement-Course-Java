import java.util.*;

public class evenodd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = sc.nextInt();
        sc.close();

        if (number % 2 == 0) {
            System.err.println(number + " is Even");
        } else {
            System.err.println(number + " is Odd");
        }
    }
}