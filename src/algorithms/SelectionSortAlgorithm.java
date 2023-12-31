package algorithms;/*
 *
 * Created by
 * Binkam Abhilash
 * on 29-October-2023
 * java-datastructures-algorithms
 * Selection Sort
 * Iterate the elements in the array and find
 * Divide the array into two parts - unsorted array and sorted array
 * Iterate and
 *
 *
 */

import java.util.Arrays;

import static algorithms.BubbleSortAlgorithm.swap;

public class SelectionSortAlgorithm {

    private static int[] input = {-22, 89, 0, 22, 45, -96}; // {-96, -22, 0, 22, 45, 89};

    public static void main(String[] args) {


        int inputArrayLength = input.length;

        if(inputArrayLength == 0 || inputArrayLength == 1) {
            System.out.println("No Sort Required");
            return;
        }

        for (int parentPointer = 0; parentPointer < inputArrayLength; ) {
            int largestElementIndex = 0;
            for (int unsortedElementIndex = parentPointer; unsortedElementIndex < inputArrayLength; unsortedElementIndex++) {
                if (input[unsortedElementIndex] > input[largestElementIndex]) {
                    largestElementIndex = unsortedElementIndex;
                }
            }
            swap(input, --inputArrayLength, largestElementIndex);
        }
        System.out.println("Output");
        Arrays.stream(input).forEach(eachElement -> System.out.print(eachElement + " "));
    }
}