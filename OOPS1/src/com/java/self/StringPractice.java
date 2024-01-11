package com.java.self;

import java.util.*;

public class StringPractice {

    static String reverseString(String s){
        char[] arr = s.toCharArray();
        for(int i = 0 ; i < arr.length / 2; i++) {
            int j = arr.length - 1 - i;
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        return String.valueOf(arr);
    }

    static void countOccurrence(String s) {
        Map<Character, Integer> m = new LinkedHashMap<>();
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(m.containsKey(c)) {
                m.put(c, m.get(c) + 1);
            }
            else{
                m.put(c,1);
            }
        }
        m.forEach((key, value) -> System.out.print(key + " = " + value + " "));
    }

    static void isPalindrome(String s) {
        if(s.equals(reverseString(s)))
            System.out.print("Entered string is palindrome.");
        else
            System.out.print("Entered string is not a palindrome.");
    }

    static String removeDuplicates(String s) {
        char[] arr = s.toCharArray();
        Set<Character> set = new LinkedHashSet<>();
        for(char c : arr)
            set.add(c);
        String result = "";
        for(char c : set)
            result += c;
        return result;
    }

    static String capitalize(String s){
        int loc = 0;
        String res = "";
        s.trim();
        do {
            res += s.substring(loc, loc + 1).toUpperCase();
            int newLoc = s.indexOf(" ", loc + 1);
            if(newLoc == -1) {
                res += s.substring(loc + 1);
                break;
            }
            res += s.substring(loc + 1, newLoc + 1);
            loc = newLoc + 1;
        }
        while(true);
        return res;
    }

    static void countSpecificOccurrence(String s, char c) {
        int count = 0;
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == c)
                count++;
        }
        System.out.print("'" + c + "' occurred " + count + " times in the entered string.");
    }

    static void isAnagram(String s1, String s2) {
        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        if(String.valueOf(arr1).equals(String.valueOf(arr2)))
            System.out.print("Entered strings are anagrams.");
        else
            System.out.print("Entered strings are not anagrams.");
    }

    static String removeWhitespace(String s) {
        return s.replaceAll("\\s","");
    }

    static String findPrefix(String[] sArr) {
        Arrays.sort(sArr);
        String res = "";
        String word1 = sArr[0];
        String word2 = sArr[sArr.length - 1];
        int len = Math.min(word1.length(),word2.length());
        for(int i = 0; i < len; i ++) {
           if(word1.charAt(i) == word2.charAt(i))
               res += word1.charAt(i);
        }
        return res;
    }

    static String caseModify(String s, boolean toUpper) {
        if(toUpper)
            return s.toUpperCase();
        return s.toLowerCase();
    }

    static void swapString(String s1, String s2) {
        s1 = s1 + s2;
        s2 = s1.substring(0,s1.length() - s2.length());
        s1 = s1.substring(s2.length());
        System.out.print("Strings swapped, so the first string becomes \"" + s1 + "\" and the second string becomes \"" + s2 + "\".");
    }

    static void checkRotation(String s1, String s2) {
        int j = s2.indexOf(s1.charAt(0));
        if(j == -1 || s1.length() != s2.length()) {
            System.out.print("False (since \"" + s2 + "\" is not a rotation of \"" + s1 + "\")");
            return;
        }
        j++;
        for(int i = 1; i < s1.length(); i++) {
            if(j >= s2.length())
                j = 0;
            if(s1.charAt(i) != s2.charAt(j)) {
                System.out.print("False (since \"" + s2 + "\" is not a rotation of \"" + s1 + "\")");
                return;
            }
            j++;
        }
        System.out.print("True (since \"" + s2 + "\" is a rotation of \"" + s1 + "\")");
    }

    static String reverseSentence(String s) {
        String res = "";
        s.trim();
        int curr = 0;
        while (true) {
            int nextSpace = s.indexOf(" ", curr);
            if(nextSpace != -1) {
                res += reverseString(s.substring(curr, nextSpace)) + " ";
                curr = nextSpace + 1;
            }
            else {
                res += reverseString(s.substring(curr));
                break;
            }
        }
        return res;
    }

    static void printFirstNonRepeat(String s) {
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(s.indexOf(c) == s.lastIndexOf(c)) {
                System.out.print("The first non-repeated character, e.g., \"" + c + "\"");
                return;
            }
        }
    }

    static void printDuplicates(String s) {
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        String res = "";
        for(int i = 0; i < arr.length; i++) {
            if((i == 0 || arr[i-1] != arr[i]) && (i != arr.length - 1 && arr[i] == arr[i+1]))
                res += arr[i] + ",";
        }
        System.out.print(res.substring(0,res.length() - 1));
    }

    static void printLargestWord(String s) {
        int maxLength = 0;
        int index = -1;
        s.trim();
        int curr = 0;
        while (true) {
            int nextSpace = s.indexOf(" ", curr);
            if(nextSpace != -1) {
                String word = s.substring(curr, nextSpace);
                if(word.length() > maxLength) {
                    maxLength = word.length();
                    index = curr;
                }
                curr = nextSpace + 1;
            }
            else {
                String word = s.substring(curr);
                if(word.length() > maxLength) {
                    maxLength = word.length();
                    index = curr;
                }
                break;
            }
        }
        System.out.print("The largest word - \"" + s.substring(index, index + maxLength) + "\"");
    }

    static String reverseString2(String s) {
        StringBuilder str = new StringBuilder(s);
        str.reverse();
        return str.toString();
    }

    public static void main(String[] args) {
        System.out.print("\nProblem 1 - Input: \"hello\" Output: \"" + reverseString("hello") + "\"");
        System.out.print("\nProblem 2 - Input: \"hello\" Output: ");
        countOccurrence("hello");
        System.out.print("\nProblem 3 - Input: \"radar\" Output: ");
        isPalindrome("radar");
        System.out.print("\nProblem 3 - Input: \"hello\" Output: ");
        isPalindrome("hello");
        System.out.print("\nProblem 4 - Input: \"aabbcdd\" Output: \"" + removeDuplicates("aabbcdd") + "\"");
        System.out.print("\nProblem 5 - Input: \"this is a sample sentence\" Output: \"" + capitalize("this is a sample sentence") + "\"");
        System.out.print("\nProblem 6 - Input: \"hello world\" and a character (e.g., \"o\") Output: ");
        countSpecificOccurrence("hello world", 'o');
        System.out.print("\nProblem 7 - Input: \"listen\" and \"silent\" Output: ");
        isAnagram("listen", "silent");
        System.out.print("\nProblem 7 - Input: \"hello\" and \"world\" Output: ");
        isAnagram("hello", "world");
        System.out.print("\nProblem 8 - Input: \"hello world\" Output: \"" + removeWhitespace("hello world") + "\"");
        String[] p9 = {"apple", "appetite", "apprehend"};
        System.out.print("\nProblem 9 - Input: [\"apple\", \"appetite\", \"apprehend\"] Output: The longest common prefix - \"" + findPrefix(p9) + "\"");
        System.out.print("\nProblem 10 - Input: A string, e.g., \"Hello\", and a flag indicating lowercase Output: \"" + caseModify("hello", false) + "\"");
        System.out.print("\nProblem 11 - Input: \"hello\" and \"world\" Output: ");
        swapString("hello", "world");
        System.out.print("\nProblem 12 - Input: \"apple\" and \"leapp\" Output: ");
        checkRotation("apple", "leapp");
        System.out.print("\nProblem 12 - Input: \"hello\" and \"world\" Output: ");
        checkRotation("hello", "world");
        System.out.print("\nProblem 13 - Input: \"hello world\" Output: \"" + reverseSentence("hello world") + "\"");
        System.out.print("\nProblem 14 - Input: A string, e.g., \"hello\" Output: ");
        printFirstNonRepeat("hello");
        System.out.print("\nProblem 15 - Input: \"programming\" Output: ");
        printDuplicates("programming");
        System.out.print("\nProblem 16 - Input: \"This is a sample sentence\" Output: ");
        printLargestWord("This is a sample sentence");
        System.out.print("\nProblem 17 - Input: \"hello\" Output: \"" + reverseString2("hello") + "\"");
    }


}
