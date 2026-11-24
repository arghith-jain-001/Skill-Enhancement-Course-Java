import java.util.Arrays;

public class leetcode_concatenation_of_array {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] answer = new int[2 * n];

        for (int i = 0; i < n; i++) {
            answer[i] = nums[i];
            answer[i + n] = nums[i];
        }
        return answer;
    }

    public static void main(String[] args) {
        leetcode_concatenation_of_array solution = new leetcode_concatenation_of_array();
        System.out.println(Arrays.toString(solution.getConcatenation(new int[]{1, 2, 1})));
    }
}
