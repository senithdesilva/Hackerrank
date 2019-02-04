package com.senith.hackerrank.ch03;

//In this problem, you have to add and multiply huge numbers! These numbers are so big that you can't contain them in any ordinary data types like a long integer.
//
//Use the power of Java's BigInteger class and solve this problem.
//
//Input Format
//
//There will be two lines containing two numbers,  and .
//
//Constraints
//
// and  are non-negative integers and can have maximum  digits.
//
//Output Format
//
//Output two lines. The first line should contain , and the second line should contain . Don't print any leading zeros.
//
//Sample Input
//
//1234
//20
//Sample Output
//
//1254
//24680

import java.math.BigInteger;
import java.util.Scanner;

public class Solution {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String a = scanner.nextLine();
        String b = scanner.nextLine();

        BigInteger bigIntegerA, bigIntegerB;

        bigIntegerA = new BigInteger(a);
        bigIntegerB = new BigInteger(b);

        System.out.println(bigIntegerA.add(bigIntegerB));
        System.out.println(bigIntegerA.multiply(bigIntegerB));

        scanner.close();
    }
}
