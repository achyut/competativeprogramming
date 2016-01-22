package edu.uta.algoproblems;

import com.sui.datastructures.GenericStack;

import edu.uta.algoproblems.stack.ApStackProblems;
import edu.uta.algoproblems.stack.BalancingOfSymbols;
import edu.uta.algoproblems.stack.InfixToPrefixAndPostFix;
import edu.uta.utils.ArrayUtils;
import edu.uta.utils.PrintUtils;
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
	
	public void testEvalutaionOfInfixExpressionInOnePass() throws Exception{
		ApStackProblems sp = new ApStackProblems();
		String[] exp = {"*","3","+","1","2"};
		assertEquals("9",sp.evaluatePrefixExpression(exp));
		String[] exp2 = {"+","/","4","13","5"};
		assertEquals("6",sp.evaluatePrefixExpression(exp2));
	}
	
	public void testIfStingIsPalindromeFromX(){
		//Given an array of characters formed by a and b, The string marked with special character
		// X which represents sthe middle of the list.(for eg. ababa..ababXbabababababa..baaa).
		// Check whether the string is palindrome.
		ApStackProblems sp = new ApStackProblems();
		String str = "abcdXdcba";
		assertTrue(sp.checkIfPalindrome(str,'X'));
		str = "abcdXdcbab";
		assertFalse(sp.checkIfPalindrome(str,'X'));
	}
	
	public void testReverseTheStackWithOnlyOneStackOperation(){
		// Given a stack how to reverse the contents of the stack using only one stack operation
		// i.e push and pop
		ApStackProblems sp = new ApStackProblems();
		sp.reverseStack();
	}
	
	public void testFindMinimumValueinStack(){
		ApStackProblems sp = new ApStackProblems();
		GenericStack<Integer> stack = new GenericStack<Integer>();
		stack.push(2);
		stack.push(4);
		stack.push(5);
		stack.push(1);
		stack.push(3);
		stack.push(6);
		int min = sp.findMinimumValue(stack);
		assertEquals(1,min);
	}
	
	public void testFindingSpans(){
		// Given an array A the span S[i] of A[i] is the maximum number of consecutive elements
		// A[j] immediatly preceding A[i] and such that a[j] <= A[j+1]
		ApStackProblems sp = new ApStackProblems();
		int[] input = {6,3,4,5,2};
		input = sp.findSpan1(input);
		assertEquals("1 1 2 3 1 ",PrintUtils.printArray(input));
		int[] input1 = {6,3,4,5,2};
		input1 = sp.findSpan(input1);
		assertEquals("1 1 2 3 1 ",PrintUtils.printArray(input1));
		
	}
	
	public void testLargestRectanglePossible(){
		// Given the array of heights of rectangles(assuming width to 1), we need to find the largest
		// rectangle possible in a histogram
		ApStackProblems sp = new ApStackProblems();
		int[] input = {3,2,5,6,1,4,4};
		int res  = sp.getAreaOfLargestRectangle(input);
		assertEquals(10,res);
	}
	
	public void testSortAStackInAcendingOrder(){
		ApStackProblems sp = new ApStackProblems();
		GenericStack<Integer> stack = new GenericStack<Integer>();
		stack.push(1);
		stack.push(3);
		stack.push(2);
		stack.push(6);
		stack.push(7);
		stack.push(4);
		stack = sp.sortStackInAscending(stack);
		//System.out.println(stack);
		boolean res = ArrayUtils.checkIfTheStackIsSorted(stack);
		assertTrue(res);
	}
	
	public void testRemoveAdjescentDuplicates(){
		// Recursively remove adjescent duplicates
		// eg. 1,5,6,8,8,8,0,1,1,0,6,5 => 1
		// eg. 1,9,6,8,8,8,0,1,1,0,6,5
		ApStackProblems sp = new ApStackProblems();
		int[] input = {1,5,6,8,8,8,0,1,1,0,6,5};
		GenericStack<Integer> stack = sp.removeAdjescentDuplicates(input);
		System.out.println(stack);
	}
	
	
	public void testTrappingRainWater(){
		//Given n non-negative integers representing an elevation map where the width of each bar is 1,
		//compute how much water it is able to trap after raining.
		//For example, 
		//Given [0,1,0,2,1,0,1,3,2,1,2,1], return 6.
		ApStackProblems sp = new ApStackProblems();
		int[] input = {0,1,0,2,1,0,1,3,2,1,2,1};
		int res  = sp.getTotalTrappedWaterWithTwoPointer(input);
		assertEquals(6,res);
		res = sp.getTotalTrappedWaterWithStack(input);
		assertEquals(6,res);
		int[] input1= {2,1,0,2};
		res = sp.getTotalTrappedWaterWithStack(input1);
		assertEquals(3,res);
		
	}
	
	public void testSimplifyUnixPaths(){
		//Given an absolute path for a file (Unix-style), simplify it.
		//For example,
		//path = "/home/", => "/home"
		//path = "/a/./b/../../c/d/", => "/c"
		//Corner Cases:
		//Did you consider the case where path = "/../"?
		//In this case, you should return "/".
		//Another corner case is the path might contain multiple slashes '/' together, 
		//such as "/home//foo/".
		//In this case, you should ignore redundant slashes and return "/home/foo".
		ApStackProblems sp = new ApStackProblems();
		String path = "/home/";
		String res = sp.simplifyUnixPath(path);
		assertEquals("/home",res);
		path = "/a/./b/../../c/";
		res = sp.simplifyUnixPath(path);
		assertEquals("/c",res);
		path = "/../";
		res = sp.simplifyUnixPath(path);
		assertEquals("/",res);
		path = "/home//foo/";
		res = sp.simplifyUnixPath(path);
		assertEquals("/home/foo",res);
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
		//Given a 2D binary matrix filled with 0's and 1's, find the largest rectangle containing all 
		//ones and return its area.
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
