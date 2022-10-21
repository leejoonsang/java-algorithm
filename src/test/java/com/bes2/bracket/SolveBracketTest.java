package com.bes2.bracket;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolveBracketTest {
    @Test
    @DisplayName("bracket well dissolved")
    void bracket(){
        SolveBracket sb = new SolveBracket();
        assertTrue(sb.solution("()()"));
//        assertTrue(sb.solution("(())()"));
//        assertTrue(sb.solution(")()("));
//        assertTrue(sb.solution("(()("));
    }
}