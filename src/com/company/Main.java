package com.company;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();

        System.out.println(getNOK(a, b));
    }

    static int nod(int a, int b) {
        return (b == 0) ? a : nod(b, a % b);
    }

    public static int getNOK(int a, int b) {
        return a*b/nod(a, b);
    }
}
