// package Strings;

import java.util.*;

public class countAscii {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.print("Enter a string: ");
        String s = sc.nextLine();

        int count_space = 0;
        int count_digit = 0;
        int count_upper = 0;
        int count_lower = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isUpperCase(ch))
                count_upper++;
            if (Character.isLowerCase(ch))
                count_lower++;
            if (Character.isSpaceChar(ch))
                count_space++;
            if (Character.isDigit(ch))
                count_digit++;
        }

        System.err.println("Upper Count: " + count_upper);
        System.err.println("Lower Count: " + count_lower);
        System.err.println("Digit Count: " + count_digit);
        System.err.println("Space Count: " + count_space);
    }
}
