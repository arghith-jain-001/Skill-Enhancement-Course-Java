import java.util.ArrayList;
import java.util.List;

public class leetcode_kids_with_the_greatest_number_of_candies {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int maximum = 0;
        for (int candy : candies) {
            maximum = Math.max(maximum, candy);
        }

        List<Boolean> answer = new ArrayList<>();
        for (int candy : candies) {
            answer.add(candy + extraCandies >= maximum);
        }
        return answer;
    }

    public static void main(String[] args) {
        leetcode_kids_with_the_greatest_number_of_candies solution = new leetcode_kids_with_the_greatest_number_of_candies();
        System.out.println(solution.kidsWithCandies(new int[]{2, 3, 5, 1, 3}, 3));
    }
}
