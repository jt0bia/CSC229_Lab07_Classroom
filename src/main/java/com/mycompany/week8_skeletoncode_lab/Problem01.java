/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.week8_skeletoncode_lab;

/**
 *
 * @author MoaathAlrajab, JaredTobias
 */
public class Problem01 {

    // main method to test algorithm
    public static void main(String[] args) {
        long sumOfPrimes = getSumOfPrimes(100);
        System.out.println(sumOfPrimes);
    }

    public static long getSumOfPrimes(int n) {
        int sum = 0;
        for (int i = 2; i <= n; i++) { // 1 is not a prime number so the loop can initialize at 2
            boolean isPrime = true;

            // tests if number is a prime number
            for (int j = 2; j <= i/2; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            // if number is a prime number, it is added to sum
            if (isPrime) {
                sum += i;
            }
        }

        n = sum; // assigning the value of sum to n
        return n;
    }
}

// Time and Space Analysis

// The time complexity of this algorithm is O(n^2) because there is a nested loop,
// one to count each number from n, and another to compare to test if the number is
// a prime number or not. Both loops run linearly, which the overall time it takes
// for the algorithm to execute is exponential.

// Meanwhile, the space complexity is O(1) because the input is constant, therefore
// the amount of space needed is constant.
