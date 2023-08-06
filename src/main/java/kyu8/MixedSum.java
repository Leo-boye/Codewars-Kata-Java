package main.java.kyu8;

import java.util.List;

public class MixedSum {

    /*
     * Assume input will be only of Integer o String type
     */
    public int sum(List<?> mixed) {
        int sum = 0;

        for (var mixeElement : mixed) {
            sum += Integer.parseInt(mixeElement.toString());
        }

        return sum;

        //return mixed.stream().mapToInt(e -> Integer.parseInt(e.toString())).sum();
    }
}