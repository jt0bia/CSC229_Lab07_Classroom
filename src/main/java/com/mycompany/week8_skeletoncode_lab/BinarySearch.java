/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.week8_skeletoncode_lab;

/**
 *
 * @author MoaathAlrajab, JaredTobias
 */
public class BinarySearch {

    // main method to call algorithm
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9}; // example of an array

        int index = runBinarySearchIteratively(array, 5, 0, array.length - 1); // method call

        // print statements if binary search found element
        if (index != -1)
            System.out.println("Key found at index: " + index);
        else
            System.out.println("Key not found in array");
    }

    public static int runBinarySearchIteratively (int[] sortedArray, int key, int low, int high) {
        int index = Integer.MAX_VALUE;

        while (low <= high) {
            int mid = low + ((high - low) / 2);
            if (sortedArray[mid] < key) {
                low = mid + 1;
            } else if (sortedArray[mid] > key) {
                high = mid - 1;
            } else if (sortedArray[mid] == key) {
                index = mid;
                break;
            }
        }
        return index;
    }
}

// Time and Space Analysis

// The time complexity is O(log(n)) because as each time the algorithm executes,
// the amount of comparisons it needs to make to find the number is reduced in half,
// henceforth the algorithm the time needed to find the number growing logarithmically.

// The space complexity is O(1) because the input is constant as the array
// maintains its size. The algorithm does not change the size of the array.