package myPow_16;


import java.util.Scanner;

/**
 * @Description:
 * @Author: chong
 * @Data: 2021/4/17 10:36 下午
 */
public class OfficialSolution {
    public double myPowWay(double x, int n){
        if (x == 0) return 0;
        long b = n;
        double res = 1.0;

        if (b < 0){
            x = 1 / x;
            b = -b;
        }

        while (b > 0){
            if ((b & 1) == 1) res *= x;
            x *= x;
            b >>= 1;
        }
        return res;
    }

    public static void main(String[] args) {
        int i = 0;
        Scanner in = new Scanner(System.in);
    }
}
