package org.example.dsa;

import java.util.Stack;


public class ValidParentheses {
    public boolean isValid(String str){
        Stack<Character> stack = new Stack<Character>();
        for(int i = 0 ; i<str.length() ; i++){
            char ch = str.charAt(i);
            if(ch == '(' || ch == '{' || ch == '[')
                stack.push(ch);
            else if (ch == ')' || ch == '}' || ch == ']'){
                if(stack.isEmpty()) {
                    return false;
                }
                char top = stack.peek();
                if(ch == ')' && top == '(' ||
                        ch == '}' && top == '{' ||
                        ch == ']' && top == '[')
                {
                    stack.pop();
                }
                else {
                    return false;
                }
            }
        }
        return stack.isEmpty();

    }
    public static void main(String[] args) {
        ValidParentheses validator = new ValidParentheses();
        System.out.println(validator.isValid("(){}[]")); // true
        System.out.println(validator.isValid("([{}])")); // true
        System.out.println(validator.isValid("({[)]}")); // false
        System.out.println(validator.isValid("("));      // false
        System.out.println(validator.isValid(""));// true
        System.out.println(validator.isValid("}])("));
    }
}
