package com.turnbasedstudio.hackerrank;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


class BalancedParenthesesExpressionTest {

    @Test
    public void checkBalancedExpression() {

        String balancedExpression = "{[()()]}";

        assertTrue(BalancedParenthesesExpression.isExpressionBalanced(balancedExpression));

        String balancedExpression2 = "{[(){}()][]}";

        assertTrue(BalancedParenthesesExpression.isExpressionBalanced(balancedExpression2));
    }

    @Test
    public void checkUnbalancedExpression() {

        String unbalanceExpression = "{[()({)}}]}";

        assertFalse(BalancedParenthesesExpression.isExpressionBalanced(unbalanceExpression));

        String unbalanceExpression2 = "{[}]";

        assertFalse(BalancedParenthesesExpression.isExpressionBalanced(unbalanceExpression2));
    }

}