package com.senith.hackerrank.ch06;

import java.util.*;

class Solution{
    public static void main(String [] args) {
        Scanner in = new Scanner(System.in);
        int query = in.nextInt();

        if (query >= 0 && query <= 500) {
            for (int i = 0; i < query; i++) {
                int a = in.nextInt();
                int b = in.nextInt();
                int n = in.nextInt();

                if ((a >= 0 && a <= 50) || (b >= 0 && b <= 50)) {
                    if (n >= 1 && n <= 15) {
                        int tempResult = 0;

                        for (int j = 0; j < n; j++) {
                            int powerOfNumber = (int) (pow(j) * b);
                            tempResult += powerOfNumber;
                            calculateResult(a, tempResult);
                        }
                    }
                }
                System.out.format("%n");
            }
            in.close();
        }
    }

    private static double pow(Integer count) {
        return Math.pow(2, count);
    }

    private static void calculateResult(int a, int tempResult) {
        int result = a + tempResult;
        System.out.format("%d ", result);
    }
}
