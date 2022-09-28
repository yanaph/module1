package ua.fan;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        int[] initialArray = {1, 4, 5, 1, 1, 3};
        int[] sortedArray = bubbleSort(initialArray);
        System.out.println("Initial: " + Arrays.toString(initialArray));
        System.out.printf("Quantity of unique elements: %d%n", countUniqueElements(sortedArray));
    }

    private static int countUniqueElements(int[] array) {
        int count = 1;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] != array[i + 1]) {
                count++;
            }
        }
        return count;
    }

    private static int[] bubbleSort(int[] initialArray) {
        int[] sorted = Arrays.copyOf(initialArray, initialArray.length);
        int tmp;
        for (int i = 0; i < sorted.length; i++) {
            for (int j = 1; j < sorted.length - i; j++) {
                if (sorted[j - 1] > sorted[j]) {
                    tmp = sorted[j - 1];
                    sorted[j - 1] = sorted[j];
                    sorted[j] = tmp;
                }
            }
        }
        return sorted;
    }
}
