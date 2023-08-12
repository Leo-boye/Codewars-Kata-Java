package main.java.kyu8;

public class CountSheeps {
    public int countSheeps(Boolean[] arrayOfSheeps) {
        int sum = 0;

        for (Boolean sheep : arrayOfSheeps) {
            if (sheep == null) {
                continue;
            }

            if (sheep) {
                sum++;
            }
        }

        return sum;
    }
}
