package org.example;

/**
 * Solution for reversing vowels in a string
 */
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        // Test with examples from the README
        String example1 = "IceCreAm";
        System.out.println("Example 1:");
        System.out.println("Input: " + example1);
        System.out.println("Output: " + solution.reverseVowels(example1));
        
        String example2 = "leetcode";
        System.out.println("\nExample 2:");
        System.out.println("Input: " + example2);
        System.out.println("Output: " + solution.reverseVowels(example2));
    }
}

class Solution {
    public String reverseVowels(String s) {
        char[] word = s.toCharArray();
        String vowels = "aeiouAEIOU";
        for (int start = 0, end = s.length() - 1; start < end; ) {
            if (vowels.indexOf(word[start]) > -1) start++;
            else if (vowels.indexOf(word[end]) == -1) end--;
            else {
                char temp = word[start];
                word[start++] = word[end--];
                word[end--] = temp;
            }
        }
        return new String(word);
    }
}