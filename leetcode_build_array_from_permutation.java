import java.util.Arrays;

public class leetcode_build_array_from_permutation {
    public int[] buildArray(int[] nums) {
        int[] answer = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            answer[i] = nums[nums[i]];
        }
        return answer;
    }

    public static void main(String[] args) {
        leetcode_build_array_from_permutation solution = new leetcode_build_array_from_permutation();
        System.out.println(Arrays.toString(solution.buildArray(new int[]{0, 2, 1, 5, 3, 4})));
    }
}
