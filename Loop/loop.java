import java.util.Scanner;

public class loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of loops: ");
        int number = sc.nextInt();
        sc.close();

        for (int i = 0; i < number; i++) {
            System.err.println("Hello World");
        }
    }
}
