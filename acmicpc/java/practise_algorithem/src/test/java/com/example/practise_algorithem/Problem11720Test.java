package com.example.practise_algorithem;

import org.junit.jupiter.api.*;

import java.io.*;

import static java.lang.System.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem11720Test {

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
        setIn(new ByteArrayInputStream("1\n1".getBytes()));
        Problem11720.main(null);
        assertEquals("1", outputStream.toString());
    }

    @Test
    @DisplayName("[EXAM-2]")
    public void exam2() {
        setIn(new ByteArrayInputStream("5\n54321".getBytes()));
        Problem11720.main(null);
        assertEquals("15", outputStream.toString());
    }

    @Test
    @DisplayName("[EXAM-3]")
    public void exam3() {
        setIn(new ByteArrayInputStream("25\n7000000000000000000000000".getBytes()));
        Problem11720.main(null);
        assertEquals("7", outputStream.toString());
    }

    @Test
    @DisplayName("[EXAM-4]")
    public void exam4() {
        setIn(new ByteArrayInputStream("11\n10987654321".getBytes()));
        Problem11720.main(null);
        assertEquals("46", outputStream.toString());
    }
}