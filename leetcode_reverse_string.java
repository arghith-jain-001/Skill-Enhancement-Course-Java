import java.util.Arrays;

public class leetcode_reverse_string {
    public void reverseString(char[] s) {
        int left = 0;
        int right = s.length - 1;

        while (left < right) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        leetcode_reverse_string solution = new leetcode_reverse_string();
        char[] letters = {'h', 'e', 'l', 'l', 'o'};
        solution.reverseString(letters);
        System.out.println(Arrays.toString(letters)); // [o, l, l, e, h]
    }
}
