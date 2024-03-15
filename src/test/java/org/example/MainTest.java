package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @Test
    void commonLyrics() {
        assertEquals("On the first day of Christmas\n" +
                "My true love gave to me:", Main.common(1));
        // test common code for second day
        assertEquals("On the second day of Christmas\n" +
                "My true love gave to me:", Main.common(2));
        // test common code for third day
        assertEquals("On the third day of Christmas\n" +
                "My true love gave to me:", Main.common(3));
    }
}