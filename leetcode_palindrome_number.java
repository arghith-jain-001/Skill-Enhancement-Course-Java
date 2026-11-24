public class leetcode_palindrome_number {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }

        int original = x;
        long reversed = 0;

        while (x > 0) {
            reversed = reversed * 10 + x % 10;
            x /= 10;
        }
        return original == reversed;
    }

    public static void main(String[] args) {
        leetcode_palindrome_number solution = new leetcode_palindrome_number();
        System.out.println(solution.isPalindrome(121)); // true
    }
}
