package sui.algoproblems.stack;

import com.sui.datastructures.GenericStack;

import junit.framework.TestCase;
import sui.algroproblems.stack.StackProblems;

public class StackTest extends TestCase{

	public void testBalancingOfExpession(){
		StackProblems stp = new StackProblems();
		String exp = "[A+(B*C)]";
		boolean result = stp.checkForBalancingExpression(exp);
		assertTrue(result);
		exp = "[A+{B*C)]";
		result = stp.checkForBalancingExpression(exp);
		assertFalse(result);
	}
	
	public void testEvalutePostfix(){
		StackProblems stp=new StackProblems();
		String[] exp={"2","1","+","3","*"};
		 assertEquals(9,stp.EvalutePostfix(exp));
		 String[] exp2 = {"4","13","5","/","+"};
		 assertEquals(6,stp.EvalutePostfix(exp2));
	}
	public void testPalindrome(){
		StackProblems stp=new StackProblems();
		String[] exp={"a","b","c","X","c","b","a"};
		String[] exp1={"a","d","c","X","c","b","a"};
		boolean result= stp.checkPalindrome(exp1);
		assertFalse(result);
	
	
	}
	public void testPalindrome1(){
		StackProblems stp=new StackProblems();
		String[] exp={"a","b","c","X","c","b","a"};
		String[] exp1={"a","d","c","X","c","b","a"};
		boolean result1=stp.checkPalindrome(exp);
		boolean result=stp.checkPalindrome(exp1);
		assertTrue(result1);
		assertFalse(result);
		
	}
	public void testSimplyPath(){
		StackProblems stp=new StackProblems();
		String exp="/a/./b/../../c/";
		assertEquals("/c",stp.simplyPath(exp));
		exp = "/home/";
		assertEquals("/home",stp.simplyPath(exp));
		exp = "/home//foo/";
		assertEquals("/home/foo",stp.simplyPath(exp));
		exp = "/../";
		assertEquals("/",stp.simplyPath(exp));
		
	}
	public void testCaculSpan(){
		StackProblems stp=new StackProblems();
		int price[]={8,5,7,9,4,6};
		int[] result = stp.calcualteSpan(price);
		String res = printArray(result);
		//System.out.println(res);
		assertEquals("1 1 2 4 1 2",res);
	}
	
	private static String printArray(int[] input){
		String res="";
			for(int i=0;i<input.length;i++){
				res+=input[i]+" ";
			}
		return res.trim();
	}
	public void testMaxRectangle(){
		StackProblems stp=new StackProblems();
		int height[]={3,2,5,6,1,4,4};
		//int max=stp.MaxRectangle(height);
		assertEquals(10,stp.MaxRectangle(height));
	}
}
