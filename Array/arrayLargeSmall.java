package Array;

import java.util.Scanner;

public class arrayLargeSmall {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int size = sc.nextInt();
        int[] a = new int[size];

        System.out.printf("Enter %d values: ", size);
        for (int i = 0; i < size; i++) {
            a[i] = sc.nextInt();
        }

        int high = a[0];
        int low = a[0];

        for (int i = 0; i < size; i++) {
            if (a[i] > high) 
                high = a[i];

            if (a[i] < low)
                low = a[i];
        }

        System.out.printf("Max is %d | Min is %d", high, low);
    }
}
