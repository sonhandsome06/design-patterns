package com.sonph.pratices;

import java.util.HashSet;
import java.util.Set;

public class Solution3 {

    public static int lengthOfLongestSubstring(String s) {

        Set<Character> set = new HashSet();
        int max = 0;
        int left = 0;
        for (int right = 0; right < s.length(); right++) {
            while (!set.add(s.charAt(right))) {
                set.remove(s.charAt(left++));
            }
            max = Math.max(max, right - left + 1);
        }
        return max;
    }

    public static void main(String[] args) {
//        System.out.println(lengthOfLongestSubstring("abcbbcc"));
        System.out.println(longestPalindrome("bb"));
    }

    public static String longestPalindrome(String s) {
        String[] arrString = s.split("");
        int longArr = arrString.length;
        String palindrome = "";
        if (longArr == 1) palindrome = s;
        for (int i = 0; i < longArr; i++) {
            for (int k = i; k < longArr; k++) {
                String subString = s.substring(i, k + 1);
                if (isPalindrome(subString))
                    palindrome = palindrome.length() < subString.length() ? subString : palindrome;
            }
        }
        return palindrome;
    }

    private static boolean isPalindrome(String str) {
        int betweenSubStr = str.length();
        for (int lengthSubStr = 0; lengthSubStr < betweenSubStr; lengthSubStr++) {
            if (str.charAt(lengthSubStr) != str.charAt(str.length() - lengthSubStr - 1))
                return false;
        }
        return true;
    }
}
