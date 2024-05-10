package org.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.List;

class RabinKarpStrategyTest {

    @Test
    void testIsSubstring() {
        RabinKarpStrategy strategy = new RabinKarpStrategy();

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
    void testPrefixFunction() {
        RabinKarpStrategy strategy = new RabinKarpStrategy();

        List<Integer> result1 = strategy.PrefixFunction("hello", "ll");
        assertEquals(1, result1.size());
        assertTrue(result1.contains(2));

        List<Integer> result2 = strategy.PrefixFunction("hello", "world");
        assertTrue(result2.isEmpty());

        List<Integer> result3 = strategy.PrefixFunction("abcabc", "ca");
        assertEquals(1, result3.size());
        assertTrue(result3.contains(2));

        List<Integer> result4 = strategy.PrefixFunction("abcabc", "cb");
        assertTrue(result4.isEmpty());
    }

    @Test
    void testCompareText() {
        RabinKarpStrategy strategy = new RabinKarpStrategy();

        assertTrue(strategy.CompareText("hello", 2, "ll"));
        assertFalse(strategy.CompareText("hello", 2, "world"));
    }
}
