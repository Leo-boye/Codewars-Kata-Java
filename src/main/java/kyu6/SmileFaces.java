package main.java.kyu6;

import java.util.*;

public class SmileFaces {

    public static int countSmileys(List<String> arr) {
        return (int) arr.stream().filter(smiley -> smiley.matches("[:;][-~]?[)D]")).count();
    }
}