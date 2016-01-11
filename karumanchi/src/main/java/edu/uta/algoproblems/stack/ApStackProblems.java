package edu.uta.algoproblems.stack;

import com.sui.datastructures.GenericStack;

public class ApStackProblems {

	/**
	 * Method to evaluate the postfix expression
	 * @param exp
	 * @return
	 * @throws Exception
	 */
	public String evaluatePostfixExpression(String[] exp) throws Exception {
		GenericStack<String> stack = new GenericStack<String>();
		for(int i=0;i<exp.length;i++){
			String curr = exp[i];
			if(curr.equals("+") || curr.equals("-") || curr.equals("*") || curr.equals("/")){
				String op1 = stack.pop();
				String op2 = stack.pop();
				String res = calculate(op2,op1,curr);
				stack.push(res);
			}
			else{
				stack.push(curr);
			}
		}
		return stack.pop();
	}
	
	/**
	 * Method to calcuate based on the operands and operator
	 * @param opd1
	 * @param opd2
	 * @param opr
	 * @return
	 * @throws Exception
	 */
	private String calculate(String opd1,String opd2,String opr) throws Exception{
		int iOp1 = Integer.parseInt(opd1);
		int iOp2 = Integer.parseInt(opd2);
		int res = 0;
		if(opr.equals("+")){
			res = iOp1+iOp2;
		}
		else if(opr.equals("-")){
			res = iOp1-iOp2;
		}
		else if(opr.equals("*")){
			res = iOp1*iOp2;
		}
		else if(opr.equals("/")){
			res = iOp1/iOp2;
		}
		else{
			throw new Exception("Operation not found!!!");
		}
		return String.valueOf(res);
	}

	public String evaluatePrefixExpression(String[] exp) throws Exception{
		GenericStack<String> operandStack = new GenericStack<String>();
		GenericStack<String> operationStack = new GenericStack<String>();
		for(int i=0;i<exp.length;i++){
			String curr = exp[i];
			if(curr.equals("+") || curr.equals("-") || curr.equals("*") || curr.equals("/")){
				operationStack.push(curr);
			}
			else{
				operandStack.push(curr);
			}
		}
		while(!operationStack.isEmpty()){
			String op1 = operandStack.pop();
			String op2 = operandStack.pop();
			String res = calculate(op2,op1,operationStack.pop());
			operandStack.push(res);
		}
		return operandStack.pop();
	}

}
