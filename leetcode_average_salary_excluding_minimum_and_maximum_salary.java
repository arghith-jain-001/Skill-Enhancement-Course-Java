public class leetcode_average_salary_excluding_minimum_and_maximum_salary {
    public double average(int[] salary) {
        int minimum = salary[0];
        int maximum = salary[0];
        int sum = 0;

        for (int value : salary) {
            sum += value;
            minimum = Math.min(minimum, value);
            maximum = Math.max(maximum, value);
        }

        return (double) (sum - minimum - maximum) / (salary.length - 2);
    }

    public static void main(String[] args) {
        leetcode_average_salary_excluding_minimum_and_maximum_salary solution = new leetcode_average_salary_excluding_minimum_and_maximum_salary();
        System.out.println(solution.average(new int[]{4000, 3000, 1000, 2000})); // 2500.0
    }
}
