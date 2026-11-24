public class leetcode_number_of_good_pairs {
    public int numIdenticalPairs(int[] nums) {
        int pairs = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    pairs++;
                }
            }
        }
        return pairs;
    }

    public static void main(String[] args) {
        leetcode_number_of_good_pairs solution = new leetcode_number_of_good_pairs();
        System.out.println(solution.numIdenticalPairs(new int[]{1, 2, 3, 1, 1, 3})); // 4
    }
}
