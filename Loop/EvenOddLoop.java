class EvenOddLoop {
    public static void main(String[] args) {

        // 1 to 100 (even numbers)
        System.out.print("Even numbers: ");
        for (int i = 1; i < 100; i++) {
            if (i%2==0) {
                System.out.print(i + " ");
            }
        }

        // 1 to 100 (odd numbers)
        System.out.print("\nOdd numbers: ");
        for (int i = 1; i < 100; i++) {
            if (i%2==1) {
                System.out.print(i + " ");
            }
        }

        // 1 to 100 (sum of numbers)
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum+=i;
            System.out.printf("\ni: %d | sum: %d", i, sum);
        }
        System.err.println("\nSum of numbers: " + sum);
    }
}