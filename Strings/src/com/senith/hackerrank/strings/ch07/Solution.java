package com.senith.hackerrank.strings.ch07;

//Using Regex, we can easily match or search for patterns in a text. Before searching for a pattern, we have to specify one using some well-defined syntax.
//
//In this problem, you are given a pattern. You have to check whether the syntax of the given pattern is valid.
//
//Note: In this problem, a regex is only valid if you can compile it using the Pattern.compile method.
//
//Input Format
//
//The first line of input contains an integer , denoting the number of test cases. The next  lines contain a string of any printable characters representing the pattern of a regex.
//
//Output Format
//
//For each test case, print Valid if the syntax of the given pattern is correct. Otherwise, print Invalid. Do not print the quotes.
//
//Sample Input
//
//3
//([A-Z])(.+)
//[AZ[a-z](a-z)
//batcatpat(nat
//Sample Output
//
//Valid
//Invalid
//Invalid

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class Solution {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        String[] checkerResult = new String[testCases];
        int count = 0;
        while((testCases--)>0){
            String pattern = in.nextLine();
            checkerResult[count] = patternCheck(pattern);
            count++;
        }
        for (String item: checkerResult) {
            System.out.println(item);
        }
    }

    private static String patternCheck(String pattern) {
        try {
            Pattern.compile(pattern);
            return "Valid";
        } catch (PatternSyntaxException e) {
            return "Invalid";
        }
    }
}