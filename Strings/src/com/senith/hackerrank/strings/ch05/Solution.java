package com.senith.hackerrank.strings.ch05;

//Two strings,  and , are called anagrams if they contain all the same characters in the same frequencies. For example, the anagrams of CAT are CAT, ACT, TAC, TCA, ATC, and CTA.
//
//Complete the function in the editor. If  and  are case-insensitive anagrams, print "Anagrams"; otherwise, print "Not Anagrams" instead.
//
//Input Format
//
//The first line contains a string denoting .
//The second line contains a string denoting .
//
//Constraints
//
//Strings  and  consist of English alphabetic characters.
//The comparison should NOT be case sensitive.
//Output Format
//
//Print "Anagrams" if  and  are case-insensitive anagrams of each other; otherwise, print "Not Anagrams" instead.
//
//Sample Input 0
//
//anagram
//margana
//Sample Output 0
//
//Anagrams

import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {
        char[] aCharacters = a.toLowerCase().toCharArray();
        char[] bCharacters = b.toLowerCase().toCharArray();

        java.util.Map<Character, Integer> frequencyA = new java.util.HashMap<>();
        java.util.Map<Character, Integer> frequencyB = new java.util.HashMap<>();

        for (char word: aCharacters) {
            if (frequencyA.containsKey(word)) {
                int count = frequencyA.get(word);
                frequencyA.put(word, count + 1);
            } else {
                frequencyA.put(word,1);
            }
        }

        for (char word: bCharacters) {
            if (frequencyB.containsKey(word)) {
                int count = frequencyB.get(word);
                frequencyB.put(word, count + 1);
            } else {
                frequencyB.put(word,1);
            }
        }

        if (frequencyA.equals(frequencyB) || frequencyB.equals(frequencyA)) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}