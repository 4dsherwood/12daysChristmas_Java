package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public static String common(int day) {
        String dayString;
        String[] dayStrings = new String[]{
                "first",
                "second",
                "third",
        };
        if (day == 1) {
            dayString = "first";
        } else if (day == 2) {
            dayString = "second";
        } else {
            dayString = "third";
        }
        return "On the " + dayString + " day of Christmas\n" +
                "My true love gave to me:";
    }
}