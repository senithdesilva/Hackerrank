package com.senith.hackerrank.ch01;

class MyCalculator {
    static String power(int n, int p) throws Exception {
        if (n < 0 || p < 0) {
            throw new Exception("n or p should not be negative.");
        }
        if (n == 0 && p == 0) {
            throw new Exception("n and p should not be zero.");
        }

        return String.valueOf((int)Math.pow(n, p));
    }
}
