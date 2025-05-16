package com.stringclass;

import java.util.Arrays;

public class PracticeQue {
    public static void main(String[] args) {
        String str = "   Madam   ";
        StringBuilder sb = new StringBuilder(str);

        // Que 1 - Reverse string
        String rev = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            rev += str.charAt(i);
        }
        System.out.println("Reversed: " + rev);

        // Que 2 - Check Palindrome
        String newStr = str.trim().toLowerCase();
        boolean isPalindrome = true;
        for (int i = 0; i < newStr.length() / 2; i++) {
            if (newStr.charAt(i) != newStr.charAt(newStr.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }
        System.out.println(isPalindrome ? "Palindrome" : "Not Palindrome");

        // Que 3 - Count vowels and consonants
        int vowels = 0;
        int consonants = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = Character.toLowerCase(str.charAt(i));
            if (ch >= 'a' && ch <= 'z') {
                if ("aeiou".indexOf(ch) != -1) {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);

        // Que 4 - Trim spaces
        String newStr1 = str.trim();
        System.out.println("Trimmed: " + newStr1);

        // Que 5 - Count words
        String sentence = "Counting the number of words in a string";
        int count = 0;
        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) == ' ') {
                count++;
            }
        }
        System.out.println("Total Words in sentence: " + (count + 1));

        // Que 6 - Upper and Lower
        System.out.println(sentence.toUpperCase());
        System.out.println(sentence.toLowerCase());

        // Que 7 - Replace characters
        System.out.println(sentence.replace('a', 'z'));

        // Que 8 - String to char array and length
        String strLength = "Hey There!!";
        char charArr[] = strLength.toCharArray();
        System.out.println(Arrays.toString(charArr));
        int strCount = 0;
        for (char c : charArr) {
            strCount++;
        }
        System.out.println("Length: " + strCount);

        // Que 9 - Compare strings without equals
        String str1 = "Hiii";
        String str2 = "Hello";
        boolean areSame = true;

        if (str1.length() != str2.length()) {
            areSame = false;
        } else {
            for (int i = 0; i < str1.length(); i++) {
                if (str1.charAt(i) != str2.charAt(i)) {
                    areSame = false;
                    break;
                }
            }
        }

        System.out.println(areSame ? "Strings are same" : "Strings are not same");

        // Que 10 - Find duplicates in string
        String str4 = "Hey There";
        char c[] = str4.toCharArray();
        String str5 = "";
        for (char chars : c) {
            String charss = String.valueOf(chars);
            if (str5.contains(charss)) {
                System.out.println("Duplicate: " + charss);
            } else {
                str5 += chars;
            }
        }
    }
}
