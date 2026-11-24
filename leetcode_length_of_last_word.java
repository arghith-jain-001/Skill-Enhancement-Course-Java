public class leetcode_length_of_last_word {
    public int lengthOfLastWord(String s) {
        int i = s.length() - 1;

        while (i >= 0 && s.charAt(i) == ' ') {
            i--;
        }

        int length = 0;
        while (i >= 0 && s.charAt(i) != ' ') {
            length++;
            i--;
        }
        return length;
    }

    public static void main(String[] args) {
        leetcode_length_of_last_word solution = new leetcode_length_of_last_word();
        System.out.println(solution.lengthOfLastWord("Hello World")); // 5
    }
}
