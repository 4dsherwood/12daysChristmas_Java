package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public static String commonLyric(int day) {
        String dayString;
        String[] dayStrings = new String[]{
                "first",
                "second",
                "third",
        };
        dayString = dayStrings[day - 1];
        return "On the " + dayString + " day of Christmas\n" +
                "My true love gave to me:";
    }

    public static String toDayString(int day) {
        return "first";
    }
}