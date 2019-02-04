package com.senith.hackerrank.ch02;

//A prime number is a natural number greater than  whose only positive divisors are  and itself. For example, the first six prime numbers are , , , , , and .
//
//Given a large integer, , use the Java BigInteger class' isProbablePrime method to determine and print whether it's prime or not prime.
//
//Input Format
//
//A single line containing an integer,  (the number to be checked).
//
//Constraints
//
// contains at most  digits.
//Output Format
//
//If  is a prime number, print prime; otherwise, print not prime.
//
//Sample Input
//
//13
//Sample Output
//
//prime
//Explanation
//
//The only positive divisors of  are  and , so we print prime.

import java.math.BigInteger;
import java.util.Scanner;

public class Solution {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String n = scanner.nextLine();
        BigInteger bigInteger;
        Boolean bigIntBool;

        bigInteger = new BigInteger(n);

        bigIntBool = bigInteger.isProbablePrime(1);

        if (bigIntBool.equals(Boolean.TRUE)) {
            System.out.println("prime");
        } else {
            System.out.println("not prime");
        }

        scanner.close();
    }
}
