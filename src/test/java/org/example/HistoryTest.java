package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;


import java.util.List;

public class HistoryTest {

    public static final String STRING_A = "aab";
    public static final String STRING_B = "aba";
    public static final String STRING_C = "aca";
    public static final String STRING_D = "baa";
    private Historie historie;
    private Anagram anagramA;
    private Anagram anagramB;
    private Anagram anagramC;
    private Anagram anagramD;

    @BeforeEach
    public void setup() {
        historie = new Historie();
        anagramA = new Anagram(historie, STRING_A);
        anagramB = new Anagram(historie, STRING_B);
        anagramC = new Anagram(historie, STRING_C);
        anagramD = new Anagram(historie, STRING_D);
    }

    @Test
    public void testF2A() {
        anagramA.compare(anagramB);
        anagramA.compare(anagramC);
        anagramA.compare(anagramD);

        List<String> strings = historie.listFor(STRING_A);
        assertArrayEquals(new String[] {STRING_B, STRING_D}, strings.toArray());
    }

    @Test
    public void testF2B() {
        anagramA.compare(anagramB);
        anagramA.compare(anagramC);
        anagramA.compare(anagramD);

        List<String> strings = historie.listFor(STRING_B);
        assertArrayEquals(new String[] {STRING_A, STRING_D}, strings.toArray());
    }

    @Test
    public void testF2C() {
        anagramA.compare(anagramB);
        anagramA.compare(anagramC);
        anagramA.compare(anagramD);

        List<String> strings = historie.listFor(STRING_C);
        assertArrayEquals(new String[] {}, strings.toArray());
    }
}
