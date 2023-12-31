package algorithms;/*
 *
 * Created by
 * Binkam Abhilash
 * on 04-November-2023
 * java-datastructures-algorithms
 *
 */

import java.util.Arrays;

/**
 * Insertion sort partitions the array to sorted and unsorted array
 * sorted array assumes to be the left most element and unsorted array index starts from array[1]
 * compare the most recent element in the sorted array and compare it with the left most element in the unsorted array
 */
public class InsertionSort {


    private static int[] input = {-22, 89, 45, 22, 0, -96}; // {-96, -22, 0, 22, 45, 89}

    public static void main(String[] args) {

        for (int sortedIndex = 0, unsortedIndex = 1; unsortedIndex < input.length; unsortedIndex++, sortedIndex++) {
            if (input[sortedIndex] > input[unsortedIndex]) {
                sort(input, sortedIndex, unsortedIndex);
            }
        }
        Arrays.stream(input).forEach(System.out::println);

    }


    private static void sort(int[] input, int sortedIndex, int unSortedIndex) {
        int localStore = input[unSortedIndex]; // 22

        while (unSortedIndex >= 0) {

            if (unSortedIndex == 0) {
                input[unSortedIndex] = localStore;
                return;
            }

            if (input[sortedIndex] > localStore) {
                input[unSortedIndex] = input[sortedIndex];
                --sortedIndex;
                --unSortedIndex;
            } else {
                input[sortedIndex + 1] = localStore;
                break;
            }
        }
    }
}
