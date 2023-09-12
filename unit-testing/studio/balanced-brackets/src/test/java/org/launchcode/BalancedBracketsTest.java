package org.launchcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BalancedBracketsTest {
    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void testEmptyString() {
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
    }

    @Test
    public void testSingleOpeningBrackets() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }

    @Test
    public void testSingleClosingBrackets() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]"));
    }

    @Test
    public void testMultipleBrackets() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[]]"));
    }

    @Test
    public void testMultipleOpeningBrackets() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[["));
    }

    @Test
    public void testMultipleClosingBrackets() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]]"));
    }

    @Test
    public void testBracketsWithoutBracketCharacters() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("Launch [Code]"));
    }

    @Test
    public void testBracketsWithCharacters() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[Launch Code]"));
        assertTrue(BalancedBrackets.hasBalancedBrackets("Launch[Code]"));
    }

    @Test
    public void testBracketsWithIntegers() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[100]"));
    }

    @Test
    public void testBracketsWithNonBalancedBrackets() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[LaunchCode"));
        assertTrue(BalancedBrackets.hasBalancedBrackets("Launch]Code["));
    }





}

