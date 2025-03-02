package main.tasks.isAnagram;

import java.util.HashMap;
import java.util.Map;

/**
 * Valid Anagram
 * Given two strings s and t, return true if the two strings are anagrams of each other, otherwise return false.
 * An anagram is a string that contains the exact same characters as another string, but the order of the characters can be different.
 * Example 1:
 * Input: s = "racecar", t = "carrace"
 * Output: true
 * Example 2:
 * Input: s = "jar", t = "jam"
 * Output: false
 * Constraints:
 * s and t consist of lowercase English letters.
 */
public class Solution {
    public static void main(String[] args) {

        System.out.println("Input: s = \"racecar\", t = \"carrace\" should be true: " +
                isAnagram("racecar", "carrace"));

        System.out.println("Input: s = \"racecar\", t = \"carrace\" should be false: " +
                isAnagram("jar", "jam"));
    }

    private static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        Map<Character, Integer> result = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            if (result.containsKey(s.charAt(i))) {
                Integer valueS = result.get(s.charAt(i));
                valueS += 1;
                if (valueS == 0) {
                    result.remove(s.charAt(i));
                } else {
                    result.put(s.charAt(i), valueS);
                }

            } else {
                result.put(s.charAt(i), 1);
            }

            if (result.containsKey(t.charAt(i))) {
                Integer valueT = result.get(t.charAt(i));
                valueT -= 1;
                if (valueT == 0) {
                    result.remove(t.charAt(i));
                } else {
                    result.put(t.charAt(i), valueT);
                }
            } else {
                result.put(t.charAt(i), -1);
            }
        }

        return result.isEmpty();
    }
}
