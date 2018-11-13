package com.company;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> turtleList = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        int lineQuantity = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < lineQuantity; i++) {
            String line = sc.nextLine();
            turtleList.add(line);
        }

        sc.close();

        System.out.println(getCoords(turtleList));
    }

    public static String getCoords(List<String> turtleList) {
        long x = 0;
        long y = 0;

        Iterator<String> iterator = turtleList.iterator();

        while (iterator.hasNext()) {
            String[] line = iterator.next().split(" ");
            String direction = line[0];
            int distance = Integer.parseInt(line[1]);

            switch (direction) {
                case "North": {
                    y = y + distance;
                    break;
                }

                case "South": {
                    y = y - distance;
                    break;
                }

                case "East": {
                    x = x + distance;
                    break;
                }

                case "West": {
                    x = x - distance;
                    break;
                }

            }
        }

        return x + " " + y;
    }
}
