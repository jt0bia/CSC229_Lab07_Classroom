/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.week8_skeletoncode_lab;

/**
 *
 * @author MoaathAlrajab, JaredTobias
 */
public class LinearSearch {
    
    public static int search(int[] arr, int x) {
        int n = arr.length;

        // loop that repeats until it finds x
        for (int i = 0; i < n; i++) {
            if (x == arr[i])
                x = arr[i];
        }
        return x;
    }
}

// Asymptotic Analysis

// The time complexity of this algorithm would be O(n) because the number that
// needs to be found might scale with how large the array is.

// In the worst-case scenario, the number might be at the end of the array, causing the
// algorithm to execute n amount of times, n being the length of the array [O(n)].

// In the best-case scenario, the number might be at the very beginning, causing the
// algorithm to run only once, having a time complexity of O(1).

// Even then, on average it could take n/2 comparisons to match the
// number with the array's element in the algorithm [O(n)].

