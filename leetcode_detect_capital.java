public class leetcode_detect_capital {
    public boolean detectCapitalUse(String word) {
        return word.equals(word.toUpperCase())
            || word.equals(word.toLowerCase())
            || (Character.isUpperCase(word.charAt(0))
                && word.substring(1).equals(word.substring(1).toLowerCase()));
    }

    public static void main(String[] args) {
        leetcode_detect_capital solution = new leetcode_detect_capital();
        System.out.println(solution.detectCapitalUse("Google")); // true
    }
}
