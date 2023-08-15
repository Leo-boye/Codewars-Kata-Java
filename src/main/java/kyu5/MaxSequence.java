package main.java.kyu5;

import java.util.Arrays;

public class MaxSequence {
    public static int sequence(int[] arr) {
        int bestSum = 0;
        int currentSum = 0;

        for (int element : arr) {
            currentSum = Math.max(0, currentSum + element);
            bestSum = Math.max(bestSum, currentSum);
        }

        return bestSum;
    }
}
