public class leetcode_count_the_digits_that_divide_a_number {
    public int countDigits(int num) {
        int original = num;
        int count = 0;

        while (num > 0) {
            int digit = num % 10;
            if (digit != 0 && original % digit == 0) {
                count++;
            }
            num /= 10;
        }
        return count;
    }

    public static void main(String[] args) {
        leetcode_count_the_digits_that_divide_a_number solution = new leetcode_count_the_digits_that_divide_a_number();
        System.out.println(solution.countDigits(1248)); // 4
    }
}
