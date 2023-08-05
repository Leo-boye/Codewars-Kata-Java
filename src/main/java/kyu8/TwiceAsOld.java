package main.java.kyu8;

public class TwiceAsOld {

    public static int TwiceAsOld(int dadYears, int sonYears) {

        int ageGap = dadYears - sonYears;

        return ageGap > sonYears ? ageGap - sonYears : sonYears - ageGap;

    }
}