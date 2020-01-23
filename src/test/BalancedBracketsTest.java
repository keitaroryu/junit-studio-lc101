package test;

import main.BalancedBrackets;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here

    @Test
    public void onlyBalancedBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void onlySingleRightBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]"));
    }

    @Test
    public void onlySingleLeftBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }

    @Test
    public void onlyUnbalancedBracketsWrongOrderReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }

    @Test
    public void multipleBalancedBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[][]"));

    }

    @Test
    public void multipleBracketsUnblanacedLeftReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[[]"));
    }

    @Test
    public void multipleBracketsUnbalancedRightReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[]]"));
    }

    @Test
    public void multipleNestedBalancedBracketsReturnTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[]]"));
    }

    @Test
    public void balancedBracketsWithCharactersInsideReturnTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[dfsds/]"));
    }

    @Test
    public void balancedBracketsWithCharactersOutsideReturnTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("dfsds/[]"));
    }

    @Test
    public void balancedBracketsWithCharactersReturnTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("dfsds/[dfs*]"));
    }

    @Test
    public void multipleBalancedBracketsWithCharactersReturnTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[dfsds/][]"));
    }

}
