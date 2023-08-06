package main.java.kyu6;

public class Order {
    public static String order(String words) {
        StringBuilder stringBuilder = new StringBuilder(words.length());
        String[] wordArray = words.split(" ");

        for (int i = 1; i <= wordArray.length; i++) {
            for (String word : wordArray) {
                if (word.contains(String.valueOf(i))) {
                    stringBuilder.append(word).append(" ");
                    break;
                }
            }
        }

        return stringBuilder.toString().trim();
    }
}