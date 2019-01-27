package com.senith.hackerrank.ch06;

//We use the integers , , and  to create the following series:
//
//You are given  queries in the form of , , and . For each query, print the series corresponding to the given , , and  values as a single line of  space-separated integers.
//
//Input Format
//
//The first line contains an integer, , denoting the number of queries.
//Each line  of the  subsequent lines contains three space-separated integers describing the respective , , and  values for that query.
//
//Constraints
//
//Output Format
//
//For each query, print the corresponding series on a new line. Each series must be printed in order as a single line of  space-separated integers.
//
//Sample Input
//
//2
//0 2 10
//5 3 5
//Sample Output
//
//2 6 14 30 62 126 254 510 1022 2046
//8 14 26 50 98

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
