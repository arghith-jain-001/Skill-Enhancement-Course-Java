public class leetcode_find_numbers_with_even_number_of_digits {
    public int findNumbers(int[] nums) {
        int count = 0;

        for (int number : nums) {
            int digits = String.valueOf(number).length();
            if (digits % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        leetcode_find_numbers_with_even_number_of_digits solution = new leetcode_find_numbers_with_even_number_of_digits();
        System.out.println(solution.findNumbers(new int[]{12, 345, 2, 6, 7896})); // 2
    }
}
