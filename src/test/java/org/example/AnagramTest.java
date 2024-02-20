package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AnagramTest {

    @Test
    public void testConstructor() {
        new Anagram("a");
    }

    @Test
    public void testCompareWithA() {
        Anagram a = new Anagram("a");
        Anagram b = new Anagram("a");
        assertTrue(a.compare(b));
    }

    @Test
    public void testCompareWithAAndB() {
        Anagram a = new Anagram("a");
        Anagram b = new Anagram("b");
        assertFalse(a.compare(b));
    }

    @Test
    public void testCompareWithAbAndBa() {
        Anagram a = new Anagram("ab");
        Anagram b = new Anagram("ba");
        assertTrue(a.compare(b));
    }

    @Test
    public void testCompareWithAbbAndBab() {
        Anagram a = new Anagram("abb");
        Anagram b = new Anagram("bab");
        assertTrue(a.compare(b));
    }

    @Test
    public void testCompareWithRegalAndLager() {
        Anagram a = new Anagram("Regal");
        Anagram b = new Anagram("Lager");
        assertTrue(a.compare(b));
    }
    @Test
    public void testCompareWithAnagrammAndMamaGarn() {
        Anagram a = new Anagram("Anagramm");
        Anagram b = new Anagram("Mama Garn");
        assertTrue(a.compare(b));
    }
}
