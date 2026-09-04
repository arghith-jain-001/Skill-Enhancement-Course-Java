// package Strings;

import java.util.Scanner;

public class stringText {
    public static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        System.out.println("Length of string is " + text.length());
        System.out.println("char at 0 is " + text.charAt(0));
        System.out.printf("subString after index 6 is " + text.substring(6));
        System.out.printf("Upper >> %s\n",  text.toUpperCase());
        System.out.printf("Lower >> %s\n",  text.toLowerCase());
        System.out.println("Java in string >> " + text.contains("Java"));
        System.out.println("startWith Hello in string >> " + text.startsWith("Hello"));
        System.out.println("endsWith Java in string >> " + text.endsWith("Java"));
        System.out.println("indexOf Java in string >> " + text.indexOf("Java"));
    }
}