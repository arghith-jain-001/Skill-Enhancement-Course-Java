package Array;

import java.util.Scanner;

public class array1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        int a[] = new int[n];

        System.out.print("Enter the elements: ");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        
        System.out.print("The elements are: ");
        for (int i = 0; i < n; i++) {
            System.out.printf("%d ", a[i]);
        }
    }
}
