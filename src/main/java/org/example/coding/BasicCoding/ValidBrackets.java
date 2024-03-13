package org.example.coding.BasicCoding;

import java.util.Stack;

public class ValidBrackets {
    public static boolean checkBrackets(String str){
        Stack<Character> stack = new Stack<>();
        int len = str.length();
        for(int i = 0 ; i<len ; i++){
            char ch = str.charAt(i);
            if(ch == '[' || ch == '{' || ch =='('){
                stack.push(ch);
            }
            else if(ch == ']' || ch == '}' || ch ==')'){
                if(stack.isEmpty()){
                    return false;
                }
                char top = stack.pop();
                if ((ch == ']' && top != '[') || (ch == '}' && top != '{') || (ch == ')' && top != '(')) {
                    return false; // Mismatched brackets
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        // Test cases with properly balanced brackets
        String[] balancedTests = {
                "",                 // Empty string
                "()",               // Single pair of parentheses
                "{}",               // Single pair of curly braces
                "[]",               // Single pair of square brackets
                "(){}[]",           // Multiple pairs of balanced brackets
                "({[]})",           // Nested balanced brackets
                "[{()}]",           // Another example of nested balanced brackets
                "a(b[c]d)e{f}g"     // String with balanced brackets and other characters
        };

        // Test cases with improperly balanced brackets
        String[] unbalancedTests = {
                "(",                // Single opening parenthesis without closing one
                ")",                // Single closing parenthesis without opening one
                "(]",               // Mismatched brackets
                "[({})",             // Missing closing square bracket
                "{[}]",             // Missing closing parenthesis
                "{[()]})"           // Extra closing parenthesis
        };

        // Testing properly balanced brackets
        System.out.println("Testing properly balanced brackets:");
        for (String test : balancedTests) {
            System.out.println(test + ": " + checkBrackets(test));
        }

        // Testing improperly balanced brackets
        System.out.println("\nTesting improperly balanced brackets:");
        for (String test : unbalancedTests) {
            System.out.println(test + ": " + checkBrackets(test));
        }
    }

}
