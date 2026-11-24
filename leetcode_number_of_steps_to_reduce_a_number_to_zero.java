public class leetcode_number_of_steps_to_reduce_a_number_to_zero {
    public int numberOfSteps(int num) {
        int steps = 0;

        while (num > 0) {
            if (num % 2 == 0) {
                num /= 2;
            } else {
                num--;
            }
            steps++;
        }
        return steps;
    }

    public static void main(String[] args) {
        leetcode_number_of_steps_to_reduce_a_number_to_zero solution = new leetcode_number_of_steps_to_reduce_a_number_to_zero();
        System.out.println(solution.numberOfSteps(14)); // 6
    }
}
