package Array;

import java.util.Scanner;

public class arrayA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter size of array: ");
        int size = sc.nextInt();
        int[] a = new int[size];

        System.out.printf("Enter %d values: ", size);
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }

        for (int i = 0; i < a.length; i++) {
            System.out.printf("%d ", a[i]);
        }

    }
}
