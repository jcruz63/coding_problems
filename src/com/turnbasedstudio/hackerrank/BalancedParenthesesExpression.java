package com.turnbasedstudio.hackerrank;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class BalancedParenthesesExpression {
    private static final Map<Character, Character> expressionPairs = new HashMap<>();

    static {
        expressionPairs.put('{', '}');
        expressionPairs.put('(', ')');
        expressionPairs.put('[', ']');
    }


    static boolean isExpressionBalanced(String expression) {


        boolean answer = false;
        Stack<Character> characters = new Stack<>();

        for (int i = 0; i < expression.length(); i++) {
            char current = expression.charAt(i);
            if (i == 0) {
                switch (current) {
                    case '{':
                    case '(':
                    case '[':
                        characters.push(current);
                        break;
                    default:
                        return false;
                }
            } else {
                switch (current) {
                    case '{':
                    case '(':
                    case '[':
                        characters.push(current);
                        break;

                    case '}':
                    case ')':
                    case ']':
                        if (expressionPairs.get(characters.peek()) == current) {
                            characters.pop();
                        } else {
                            return answer;
                        }
                        break;


                    default:
                        return answer;
                }
            }
        }

        if (characters.empty()) {
            answer = true;
        }
        return answer;
    }

}
