package test;

import main.BalancedBrackets;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here

    @Test
    public void onlyBracketsReturnsTrue() {
        String spec = "a single set of balanced brackets returns true";
        String testData = "[]";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertTrue(spec, result);
    }

    @Test
    public void separatedBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[LaunchCode]"));
    }

    @Test
    public void bracketsWithinReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("Launch[Code]"));
    }

    @Test
    public void emptyBracketsAfterReturnsTrue() {
        String spec = "single set of balanced brackets after chars returns true";
        String testData = "LaunchCode[]";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertTrue(spec, result);
    }

    @Test
    public void bracketsBeforeReturnsTrue() {
        String spec = "single set of balanced brackets before other characters returns true";
        String testData = "[]LaunchCode";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertTrue(spec, result);
    }

    @Test
    public void multiplePairedBracketsReturnsTrue() {
        String spec = "multiple paired brackets return true";
        String testData = "[[[]]]";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertTrue(spec, result);
    }

    @Test
    public void singleBracketsAlignedReturnsTrue() {
        String spec = "single aligned brackets return true";
        String testData = "[][][]";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertTrue(spec, result);
    }

    @Test
    public void leftBracketsReturnsFalse() {
        String spec = "single open bracket returns false";
        String testData = "[";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertFalse(spec, result);
    }

    @Test
    public void rightBracketsReturnsFalse() {
        String spec = "single right bracket returns false";
        String testData = "]";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertFalse(spec, result);
    }

    @Test
    public void reverseBracketsReturnsFalse() {
        String spec = "reversed brackets returns false";
        String testData = "][";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertFalse(spec, result);
    }

    @Test
    public void singleBracketBeforeCharsFalse() {
        String spec = "single left bracket before string returns false";
        String testData = "[LaunchCode";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertFalse(spec, result);
    }

    @Test
    public void nestedReversedBracketsReturnsFalse() {
        String spec = "nested reversed brackets reversed returns false";
        String testData = "Launch]Code[";
        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertFalse(spec, result);
    }



}
