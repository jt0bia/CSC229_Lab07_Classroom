/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.week8_skeletoncode_lab;

/**
 *
 * @author MoaathAlrajab, JaredTobias
 */
public class BubbleSort {

    // main method to test algorithm
    public static void main(String[] args) {
        int[] array = {4, 9, 8, 2, 1, 7};
        bubbleSort(array, array.length);

        // prints out bubble sorted array
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void bubbleSort(int[] a, int size) {
        int outer, inner, temp;
        for (outer = size - 1; outer > 0; outer--) { // counting down
            for (inner = 0; inner < outer; inner++) { // bubbling up
                if (a[inner] > a[inner + 1]) {
                    // Swaps inner and inner+1
                    temp = a[inner];
                    a[inner] = a[inner + 1];
                    a[inner + 1] = temp;
                }
            }
        }
    }
}

// The time complexity of this bubble sort array is O(n^2) because there is
// a nested for loop that each requires n amount of times to execute,
// therefore needing an exponential amount of time for the algorithm to execute.
