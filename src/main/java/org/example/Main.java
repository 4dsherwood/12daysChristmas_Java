package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public static String common(int day) {
        String dayString;
        if (day == 1) {
            dayString = "first";
        } else {
            dayString = "second";
        }
        return "On the " + dayString + " day of Christmas\n" +
                "My true love gave to me:";
    }
}