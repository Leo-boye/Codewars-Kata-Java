package main.java.kyu7;

public class GetMiddle {
    public static String getMiddle(String word) {
        int wordSize = word.length();
        return (wordSize % 2 == 0)
                ? word.substring(wordSize / 2 - 1, wordSize / 2 + 1)
                : String.valueOf(word.charAt(wordSize / 2));
    }
}
