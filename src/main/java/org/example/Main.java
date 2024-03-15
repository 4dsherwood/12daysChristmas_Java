package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public static String commonLyric(int day) {
        String dayString;
        dayString = toDayString(day);
        return "On the " + dayString + " day of Christmas\n" +
                "My true love gave to me:";
    }

    public static String toDayString(int day) {
        String[] dayStrings = new String[]{
                "first",
                "second",
                "third",
        };
        return dayStrings[day - 1];
    }
}