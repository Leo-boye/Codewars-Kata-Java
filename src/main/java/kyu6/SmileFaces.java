package main.java.kyu6;

import java.util.*;

public class SmileFaces {

    public static int countSmileys(List<String> arr) {

        List<String> validSmileyList = new ArrayList<>();

        String[] eyes = new String[]{";", ":"};
        String[] noses = new String[]{"-", "~"};
        String[] mouths = new String[]{"D", ")"};

        for (String eye : eyes) {
            for (String mouth : mouths) {
                for (String nose : noses) {
                    validSmileyList.add(eye.concat(nose).concat(mouth));
                }
                validSmileyList.add(eye.concat(mouth));
            }
        }

        return (int) arr.stream().filter(validSmileyList::contains).count();
    }
}