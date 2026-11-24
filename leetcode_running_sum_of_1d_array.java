import java.util.Arrays;

public class leetcode_running_sum_of_1d_array {
    public int[] runningSum(int[] nums) {
        int[] answer = new int[nums.length];
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            answer[i] = sum;
        }
        return answer;
    }

    public static void main(String[] args) {
        leetcode_running_sum_of_1d_array solution = new leetcode_running_sum_of_1d_array();
        System.out.println(Arrays.toString(solution.runningSum(new int[]{1, 2, 3, 4})));
    }
}
