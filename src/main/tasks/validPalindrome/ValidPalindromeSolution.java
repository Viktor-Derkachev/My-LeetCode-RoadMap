package main.tasks.validPalindrome;

public class ValidPalindromeSolution {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";

        System.out.println("Is Palindrome: " + isPalindrome(s));

        String s2 = ",."; // in 447 testcase leetCode this String is palindrome

        System.out.println("Is Palindrome: " + isPalindrome(s2));
    }

    public static boolean isPalindrome(String s) {
        int indexLeft = 0;
        int indexRight = s.length() - 1;

        while (indexLeft < indexRight) {

            while (indexLeft < indexRight && !Character.isLetterOrDigit(s.charAt(indexLeft))) {
                indexLeft++;
            }

            while (indexRight > indexLeft && !Character.isLetterOrDigit(s.charAt(indexRight))) {
                indexRight--;
            }

            if (Character.toLowerCase(s.charAt(indexLeft)) != Character.toLowerCase(s.charAt(indexRight))) {

                return false;
            }

            indexLeft++;
            indexRight--;
        }

        return true;
    }
}
