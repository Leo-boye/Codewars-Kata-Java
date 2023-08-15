package main.java.kyu5;

import java.util.Arrays;

public class MaxSequence {
    public static int sequence(int[] arr) {
        return  Arrays.stream(arr).sum();
    }
}
