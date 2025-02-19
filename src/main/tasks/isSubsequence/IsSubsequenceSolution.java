package main.tasks.isSubsequence;

/*
392. Is Subsequence
Solved
Easy
Topics
Companies
Given two strings s and t, return true if s is a subsequence of t, or false otherwise.

A subsequence of a string is a new string that is formed from the original string by deleting some (can be none) of the characters without disturbing the relative positions of the remaining characters. (i.e., "ace" is a subsequence of "abcde" while "aec" is not).



Example 1:

Input: s = "abc", t = "ahbgdc"
Output: true
Example 2:

Input: s = "axc", t = "ahbgdc"
Output: false


Constraints:

0 <= s.length <= 100
0 <= t.length <= 104
s and t consist only of lowercase English letters.
 */
public class IsSubsequenceSolution {
    public static void main(String[] args) {
        String s = "abc";
        String t = "ahbgdc";

        System.out.println("Is Subsequence: " + isSubsequence(s, t));
    }

    public static boolean isSubsequence(String s, String t) {
        if (s.isEmpty()) {
            return true;
        }

        int sIndex = 0;

        for (int i = 0; i < t.length(); i++) {
            if (t.charAt(i) == s.charAt(sIndex)) {
                sIndex++;
                if (sIndex == s.length()) {
                    return true;
                }
            }
        }
        return false;
    }
}
