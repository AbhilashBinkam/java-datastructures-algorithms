package algorithms;/*
 *
 * Created by
 * Binkam Abhilash
 * on 14-October-2023
 * datastructures-algorithms
 *
 */

import java.util.Arrays;

public class BubbleSortAlgorithm {


//    private static int[] input = {5, 3, 1, 4, 2}; // {1,2,3,4,5}
//    private static int[] input = {1, 2, 3, 4, 5}; // {1,2,3,4,5}
//    private static int[] input = {5, 4, 3, 2, 1}; // {1,2,3,4,5}
//    private static int[] input = {4, 2, 4, 1, 2}; // {1,2,2,4,4}
//    private static int[] input = {42}; // No Sort Required

    private static int[] input = {-22, 89, 0, 22, 45, -96}; // {-96, -22, 0, 22, 45, 89}

    public static void main(String[] args) {

        if (input.length == 1 || input.length == 0) {
            System.out.println("No Sort Required");
            return;
        }
        int size = input.length - 1;
        boolean alreadySortedArray = true;

        for (int parentPointer = 0; parentPointer < size; ) {

            for (int currentElement = parentPointer; currentElement < size; currentElement++) {
                int subsequentElement = currentElement + 1;
                if (input[currentElement] > input[subsequentElement]) {
                    alreadySortedArray = false;
                    swap(input, currentElement, subsequentElement);
                }
            }
            if (alreadySortedArray)
                break;
            size--;
        }
        Arrays.stream(input).forEach(eachElement -> System.out.print(eachElement + " "));
    }

    public static void swap(int[] input, int startingIndex, int endingIndex) {

        int temp = input[startingIndex];
        input[startingIndex] = input[endingIndex];
        input[endingIndex] = temp;
    }
}
