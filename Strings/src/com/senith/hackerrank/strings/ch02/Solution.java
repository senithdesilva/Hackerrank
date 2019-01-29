package com.senith.hackerrank.strings.ch02;

//Given a string, , and two indices,  and , print a substring consisting of all characters in the inclusive range from to . You'll find the String class' substring method helpful in completing this challenge.
//
//Input Format
//
//The first line contains a single string denoting .
//The second line contains two space-separated integers denoting the respective values of  and .
//
//Constraints
//
//String  consists of English alphabetic letters (i.e., ) only.
//Output Format
//
//Print the substring in the inclusive range from  to .
//
//Sample Input
//
//Helloworld
//3 7
//Sample Output
//
//lowo

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();

        if (S.length() >= 1 && S.length() <= 100) {
            if (S.matches("[a-zA-Z]+")) {
                System.out.println(S.substring(start, end));
            }
        }
    }
}