package com.example.practise_algorithem;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static java.lang.System.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem8958Test {

    private final ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    private final PrintStream out = System.out;

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStream));
    }

    @AfterEach
    public void restore() {
        System.setOut(out);
    }

    @Test
    @DisplayName("[EXAM-1]")
    public void exam1() {
        setIn(new ByteArrayInputStream((
                "5\n" +
                "OOXXOXXOOO\n" +
                "OOXXOOXXOO\n" +
                "OXOXOXOXOXOXOX\n" +
                "OOOOOOOOOO\n" +
                "OOOOXOOOOXOOOOX"
        ).getBytes()));
        Problem8958.main(null);
        assertEquals("10\r\n9\r\n7\r\n55\r\n30", outputStream.toString());
    }
}