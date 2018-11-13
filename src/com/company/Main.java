package com.company;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inputNum = sc.nextInt();
        sc.close();

        System.out.println(getFact(inputNum));
    }

    public static BigInteger getFact(int n) {
        BigInteger result = BigInteger.valueOf(1);

        if (n != 0) {
            while (n > 0) {
                result = result.multiply(BigInteger.valueOf(n));
                n = n - 2;
            }
        }

        return result;
    }
}
