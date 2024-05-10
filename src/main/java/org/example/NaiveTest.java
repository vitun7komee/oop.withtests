package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NaiveStrategyTest {

    @Test
    void testIsSubstring() {
        NaiveStrategy strategy = new NaiveStrategy();

        assertTrue(strategy.IsSubstring("hello", "ll"));
        assertFalse(strategy.IsSubstring("hello", "world"));
        assertTrue(strategy.IsSubstring("abcabc", "ca"));
        assertFalse(strategy.IsSubstring("abcabc", "cb"));
        assertTrue(strategy.IsSubstring("hello world", "lo wo"));
        assertFalse(strategy.IsSubstring("hello world", "world hello"));
        assertTrue(strategy.IsSubstring("the quick brown fox", "quick"));
        assertFalse(strategy.IsSubstring("the quick brown fox", "lazy"));
        assertTrue(strategy.IsSubstring("this is a test", "is a"));
        assertFalse(strategy.IsSubstring("this is a test", "is test"));
        assertTrue(strategy.IsSubstring("programming is fun", "ming is fu"));
        assertFalse(strategy.IsSubstring("programming is fun", "fun is"));
    }

    @Test
    void testNaiveStringMatcher() {
        NaiveStrategy strategy = new NaiveStrategy();

        assertEquals(strategy.NaiveStringMatcher("hello", "ll"), 2);
        assertEquals(strategy.NaiveStringMatcher("hello", "world"), -1);
        assertEquals(strategy.NaiveStringMatcher("abcabc", "ca"), 2);
        assertEquals(strategy.NaiveStringMatcher("abcabc", "cb"), -1);
    }
}
