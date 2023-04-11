package test;

import main.BalancedBrackets;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    @Test
    public void onlyBracketsReturnsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void emptyStringReturnsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
    }

    @Test
    public void wrongOrderBracketsReturnFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }
    @Test
    public void returnsTrueMatchingBracketsWithString(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[Launchcode]"));
    }

    @Test
    public void returnsFalseWithOnlyLeftBracket(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }
    @Test
    public void returnsFalseWithOnlyRightBracket(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("]"));

    }
    @Test
    public void returnsFalseWrongOrderBracketsWithString(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("Launch]Code["));
    }
    @Test
    public void returnsTrueWithBracketsInString(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("Launch[Code]"));
    }
    @Test
    public void returnsFalseOnlyOneBracketWithString(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("[LaunchCode"));
    }
    @Test
    public void returnsFalseWrongOrderBracketsMultiple(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("[[]]]["));
    }
    @Test
    public void returnsTrueStringWithNoBrackets(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("Launchcode"));

    }
}
