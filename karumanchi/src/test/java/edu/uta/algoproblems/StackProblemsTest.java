package edu.uta.algoproblems;

import edu.uta.algoproblems.stack.ApStackProblems;
import edu.uta.algoproblems.stack.BalancingOfSymbols;
import edu.uta.algoproblems.stack.InfixToPrefixAndPostFix;
import junit.framework.TestCase;

public class StackProblemsTest extends TestCase{

	public void testBalancingOfSymbols(){
		BalancingOfSymbols bos = new BalancingOfSymbols();
		String exp = "[A+(B*C)]";
		assertTrue(bos.checkIfBalanced(exp));
		exp = "[A+(B*C()]";
		assertFalse(bos.checkIfBalanced(exp));
	}
	
	public void testInfixToPostFix(){
		InfixToPrefixAndPostFix inf = new InfixToPrefixAndPostFix();
		String exp = "[A+(B*C)]";
		exp = "A+B-C";
		assertEquals("AB+C-",inf.convertInfixToPostFix(exp));
		exp = "(A+B)-C";
		assertEquals("AB+C-",inf.convertInfixToPostFix(exp));
		exp = "(A+B)*C-D";
		assertEquals("AB+C*D-",inf.convertInfixToPostFix(exp));
		exp = "(10+20)*7-2";
		assertEquals("1020+7*2-",inf.convertInfixToPostFix(exp));
	}
	
	public void testInfixToPrefix(){
		/*InfixToPrefixAndPostFix inf = new InfixToPrefixAndPostFix();
		String exp = "[A+(B*C)]";
		exp = "A+B-C";
		assertEquals("-+ABC",inf.convertInfixToPrefix(exp));
		exp = "(A+B)-C";
		assertEquals("-+ABC-",inf.convertInfixToPrefix(exp));
		exp = "(A+B)*C-D";
		assertEquals("-*+ABCD",inf.convertInfixToPrefix(exp));
		exp = "(10+20)*7-2";
		assertEquals("1020+7*2-",inf.convertInfixToPrefix(exp));
		*/
	}
	
	public void testEvaluationOfPostfix() throws Exception{
		//eg.["2", "1", "+", "3", "*"] -> ((2 + 1) * 3) -> 9
		 // ["4", "13", "5", "/", "+"] -> (4 + (13 / 5)) -> 6
		String[] exp = {"2","1","+", "3","*"};
		ApStackProblems sp = new ApStackProblems();
		assertEquals("9",sp.evaluatePostfixExpression(exp));
		String[] exp2 = {"4","13","5","/","+"};
		assertEquals("6",sp.evaluatePostfixExpression(exp2));
	}
	
	public void testEvalutaionOfInfixExpressionInOnePass(){
		
	}
	
	public void testAdvancedStack(){
		// advanced stack should give minimum element in O(1)
		// improve space complexity
	}
	
	public void testIfStingIsPalindromeFromX(){
		//Given an array of characters formed by a and b, The string marked with special character
		// X which represents sthe middle of the list.(for eg. ababa..ababXbabababababa..baaa).
		// Check whether the string is palindrome.
	}
	
	public void reverseTheStackWithOnlyOneStackOperation(){
		// Given a stack how to reverse the contents of the stack using only one stack operation
		// i.e push and pop
	}
	
	public void testImplementationOfQueueWithStack(){
		
	}
	
	public void testImplementTwoStackInOneArray(){
		
	}
	
	public void testImplementMStackInNsizedArray(){
		
	}
	
	public void testFindingSpans(){
		// Given an array A the span S[i] of A[i] is the maximum number of consecutive elements
		// A[j] immediatly preceding A[i] and such that a[j] <= A[j+1]
	}
	
	public void testLargestRectanglePossible(){
		// Given the array of heights of rectangles(assuming width to 1), we need to find the largest
		// rectangle possible in a histogram
	}
	
	public void sortAStackInAcendingOrder(){
		
	}
	
	public void removeAdjescentDuplicates(){
		// Recursively remove adjescent duplicates
		// eg. 1,5,6,888,0,1,1,0,6,5 => 1
		// eg. 1,9,6,8,8,8,0,1,1,0,6,5
	}
	
	public void testCreateANewStackWhenItOverBalance(){
		// overbalancing means when the stack gets too high 
		// in real life we would likely start the new stack when the previous stack exceeds some threshold.
		// implement the datastructure that mimics the composed of several stacks and should create 
		// a new stack once the previous one exceeds capacity
		// the push and pop operations should behave as a regular stack
	}
	
	public void testTrappingRainWater(){
		//Given n non-negative integers representing an elevation map where the width of each bar is 1,
		//compute how much water it is able to trap after raining.
		//For example, 
		//Given [0,1,0,2,1,0,1,3,2,1,2,1], return 6.
	}
	
	public void testSimplifyUnixPaths(){
		//Given an absolute path for a file (Unix-style), simplify it.
		//For example,
		//path = "/home/", => "/home"
		//path = "/a/./b/../../c/", => "/c"
		//Corner Cases:
		//Did you consider the case where path = "/../"?
		//In this case, you should return "/".
		//Another corner case is the path might contain multiple slashes '/' together, 
		//such as "/home//foo/".
		//In this case, you should ignore redundant slashes and return "/home/foo".
	}
	
	public void removeDuplicates(){
		//Given a string which contains only lowercase letters, remove duplicate letters so that 
		//every letter appear once and only once. You must make sure your result is the smallest in 
		//lexicographical order among all possible results.
		//Example:
		//Given "bcabc"
		//Return "abc"

		//Given "cbacdcbc"
		//Return "acdb"
	}
	
	public void testGetLargestRectangle(){
		//Given a 2D binary matrix filled with 0's and 1's, find the largest rectangle containing all ones and return its area.
	}
	
	public void implementBasicCalculator(){
		//Implement a basic calculator to evaluate a simple expression string.
		//The expression string may contain open ( and closing parentheses ), the plus + or minus sign -, non-negative integers and empty spaces .
		//You may assume that the given expression is always valid.
		//Some examples:
		//"1 + 1" = 2
		//" 2-1 + 2 " = 3
		//"(1+(4+5+2)-3)+(6+8)" = 23
	}
}
