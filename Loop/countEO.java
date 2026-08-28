// package Loop;
import java.util.Scanner;

public class countEO {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter size of array: ");
        int size = sc.nextInt();
        int[] a = new int[size];

        System.out.printf("Enter %d values: ", size);
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        
        int count_even = 0;
        int count_odd = 0;

        for (int i = 0; i < size; i++) {
            if (a[i] % 2 == 0)
                count_even++;
            else
                count_odd++;
        }

        System.out.printf("Count >> Even: %d | Odd: %d\n", count_even, count_odd);

    }
}