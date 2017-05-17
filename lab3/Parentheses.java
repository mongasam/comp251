
/******************************************************************************
 *  Compilation:  javac Parentheses.java
 *  Execution:    java Parentheses file.txt
 *  
 *  Reads in a text file and checks to see if the paretheses, curly
 *  braces, and square brackets are balanced.
 *
 *  % java  java Parentheses
 *  [()]{}{[()()]()}
 *  true
 *
 *  % java Parentheses
 *  [(])
 *  false
 *
 ******************************************************************************/

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.util.Stack;

public class Parentheses {
    private static final char L_PAREN    = '(';
    private static final char R_PAREN    = ')';
    private static final char L_BRACE    = '{';
    private static final char R_BRACE    = '}';
    private static final char L_BRACKET  = '[';
    private static final char R_BRACKET  = ']';
	private static Scanner fin;

    public static boolean isBalanced(String s) {
    	 Stack<Character> stack = new Stack<Character>();
         for (int i = 0; i < s.length(); i++) {

             if      (s.charAt(i) == L_PAREN)   stack.push(L_PAREN);

             else if (s.charAt(i) == L_BRACE)   stack.push(L_BRACE);

             else if (s.charAt(i) == L_BRACKET) stack.push(L_BRACKET);

             else if (s.charAt(i) == R_PAREN) {
                 if (stack.isEmpty())        return false;
                 if (stack.pop() != L_PAREN) return false;
             }

             else if (s.charAt(i) == R_BRACE) {
                 if (stack.isEmpty())        return false;
                 if (stack.pop() != L_BRACE) return false;
             }

             else if (s.charAt(i) == R_BRACKET) {
                 if (stack.isEmpty())        return false;
                 if (stack.pop() != L_BRACKET) return false;
             }
             
    	// Put your solution here
    	// Hint: you might need to create a stack to keep characters
        //Stack<Character> stack = new Stack<Character>();
         }
        return stack.isEmpty();
    }


    public static void main(String[] args) throws FileNotFoundException {
       	fin = new Scanner(new FileReader("input.txt"));
        while (fin.hasNext()) {
            String str = fin.nextLine();
            System.out.println(str);
            System.out.println(isBalanced(str));
            System.out.println();
        }
    }

}