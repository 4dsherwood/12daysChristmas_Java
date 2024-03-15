package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @Test
    void commonLyrics() {
        assertEquals("On the first day of Christmas\n" +
                "My true love gave to me:", Main.common(1));
    }
}