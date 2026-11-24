public class leetcode_add_digits {
    public int addDigits(int num) {
        while (num >= 10) {
            int sum = 0;
            while (num > 0) {
                sum += num % 10;
                num /= 10;
            }
            num = sum;
        }
        return num;
    }

    public static void main(String[] args) {
        leetcode_add_digits solution = new leetcode_add_digits();
        System.out.println(solution.addDigits(38)); // 2
    }
}
