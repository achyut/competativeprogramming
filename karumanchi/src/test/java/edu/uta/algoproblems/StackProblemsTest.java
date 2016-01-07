package edu.uta.algoproblems;

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
	
	public void testEvaluationOfPostfix(){
		InfixToPrefixAndPostFix inf = new InfixToPrefixAndPostFix();
		String exp = "(1+2)*7-2";
		exp = inf.convertInfixToPostFix(exp);
		
		//assertEquals("12+7*2-",19);
	}
}
