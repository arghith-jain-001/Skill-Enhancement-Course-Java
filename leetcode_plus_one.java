import java.util.Arrays;

public class leetcode_plus_one {
    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }

        int[] answer = new int[digits.length + 1];
        answer[0] = 1;
        return answer;
    }

    public static void main(String[] args) {
        leetcode_plus_one solution = new leetcode_plus_one();
        System.out.println(Arrays.toString(solution.plusOne(new int[]{1, 2, 9}))); // [1, 3, 0]
    }
}
