package main.java.kyu6;

public class TriBonacci {
    public double[] tribonacci(double[] s, int n) {
        double[] result = new double[n];
        if(n == 0) return result;

        result[0] = s[0];
        if(n == 1) return result;

        result[1] = s[1];
        if(n == 2) return result;

        result[2] = s[2];

        for (int i = 3; i < n; i++) {
            result[i] = result[i-1] + result[i-2] + result[i-3];
        }

        return result;
    }
}
