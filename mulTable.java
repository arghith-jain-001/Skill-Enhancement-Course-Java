import java.util.Scanner;

public class mulTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int a = sc.nextInt();
        sc.close();

        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d * %d = %d\n", a, i, a*i);
        }
    }
}
