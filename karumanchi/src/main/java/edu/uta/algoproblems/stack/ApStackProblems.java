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

	public boolean checkIfPalindrome(String str, char c) {
		GenericStack<Character> stack = new GenericStack<Character>();
		int i = 0;
		char curr = str.charAt(0);
		while(curr!=c && i<str.length()){
			stack.push(curr);
			i++;
			curr = str.charAt(i);
		}
		i++;
		while(!stack.isEmpty() && i<str.length()){
			curr = str.charAt(i);
			char c1 = stack.pop();
			if(c1!=curr){
				return false;
			}
			i++;
		}
		if(stack.isEmpty() && i==str.length()){
			return true;
		}
		else{
			return false;
		}
	}

	public void reverseStack() {
		GenericStack<Integer> stack = new GenericStack<Integer>();
		GenericStack<Integer> newstack = new GenericStack<Integer>();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		reverse(stack,newstack);
		//System.out.println(stack.isEmpty());
		//System.out.println(newstack);
	}

	/**
	 * Implementation of reversing a stack
	 * @param stack
	 * @param newstack
	 * @return
	 */
	private int reverse(GenericStack<Integer> stack,GenericStack<Integer> newstack){
		int temp = stack.pop();
		if(!stack.isEmpty()){
			return temp;
		}
		else{
			int val = reverse(stack,newstack);
			newstack.push(val);
			return temp;
		}
	}

	/**
	 * Implementation of finding minimum value of a stack problem
	 * @param stack
	 * @return
	 */
	public int findMinimumValue(GenericStack<Integer> stack) {
		GenericStack<Integer> minstack = new GenericStack<Integer>();
		Integer minval = stack.pop();
		minstack.push(minval);
		while(!stack.isEmpty()){
			int val = stack.pop();
			if(val<=minval){
				minstack.push(val);
				minval = val;
			}
		}
		return minstack.peek();
	}

	
	/**
	 * Implementation of simplifying unix path problem
	 * @param path
	 * @return
	 */
	public String simplifyUnixPath(String path) {
		GenericStack<String> stack = new GenericStack<String>();
		String arr[] = path.split("\\/");
		for(int i=0;i<arr.length;i++){
			if(!arr[i].trim().isEmpty()){
				if(arr[i].equals("..")){
					if(!stack.isEmpty()){
						stack.pop();
						stack.pop();
					}
				}
				else if(arr[i].equals(".")){
					continue;
				}
				else{
					stack.push("/");
					stack.push(arr[i]);
				}
			}
		}
		if(stack.isEmpty()){
			stack.push("/");
		}
		
		String res = "";
		while(!stack.isEmpty()){
			res = stack.pop()+res;
		}
		return res;
		/*
		if(res.length()>1){
			return res.substring(0,res.length()-1);	
		}
		else{
			return res;
		}*/
	}

	
	public int[] findSpan1(int[] input){
		GenericStack<Integer> stack = new GenericStack<Integer>();
		int[] span = new int[input.length];
		span[0] = 1;
		stack.push(0);
		
		for(int i=1;i<input.length;i++){
		//	System.out.println(stack);
			while(!stack.isEmpty() && input[i]>input[stack.peek()]){
				stack.pop();
			}
			if(stack.isEmpty()){
				span[i] = 1;
			}
			else{
				span[i] = i - stack.peek();
			}
			stack.push(i);
		}
		return span;
	}
	
	public int[] findSpan(int[] input) {
		GenericStack<Integer> stack = new GenericStack<Integer>();
		int[] span = new int[input.length];
		int p =0;
		for(int i=0;i<input.length;i++){
			while(!stack.isEmpty() && input[i]>input[stack.peek()]){
				stack.pop();
			}
			if(stack.isEmpty()){
				p = -1;
			}
			else{
				p = stack.peek();
			}
			span[i] = (i - p);
			stack.push(i);
		}
		return span;
	}

	/**
	 * Implementation of find largest rectangle from a histogram problem
	 * @param input
	 * @return
	 */
	public int getAreaOfLargestRectangle(int[] input){
		GenericStack<Integer> stack = new GenericStack<Integer>();
		int maxArea = 0;
		int i = 0;
		while(i<input.length){
			if(stack.isEmpty() || input[i]>=input[stack.peek()]){
				stack.push(i++);
			}
			else{
				int top = stack.pop();
				int area = 0;
				if(stack.isEmpty()){
					area = input[top]*i;
				}
				else{
					area = input[top]*(i-stack.peek()-1);
				}
				if(area>maxArea){
					maxArea= area;
				}
			}
		}
		
		while(!stack.isEmpty()){
			int top = stack.pop();
			int area = 0;
			if(stack.isEmpty()){
				area = input[top]*i;
			}
			else{
				area = input[top]*(i-stack.peek()-1);
			}
			if(area>maxArea){
				maxArea = area;
			}
		}
		return maxArea;
	}

	public GenericStack<Integer> sortStackInAscending(GenericStack<Integer> stack) {
		GenericStack<Integer> stack1 = new GenericStack<Integer>();
		
		return null;
	}

	
	/**
	 * Method for getting trapped water with two pointer method
	 * @param input
	 * @return
	 */
	public int getTotalTrappedWaterWithTwoPointer(int[] input) {
		int maxHeight = 0;
		for(int i=0;i<input.length;i++){
			if(input[i]>input[maxHeight]){
				maxHeight = i;
			}
		}
		int totalWater = 0;
		int edge = 0;
		for(int i=0;i<maxHeight;i++){
			if(input[i]>input[edge]){
				edge = i;
			}
			else{
				totalWater+=input[edge]-input[i];
			}
		}
		edge = input.length-1;
		for(int i=input.length-2;i>maxHeight;i--){
			if(input[i]>input[edge]){
				edge = i;
			}
			else{
				totalWater+=input[edge]-input[i];
			}
		}
		return totalWater;
	}

	
	/**
	 * Method to trap water using stacks
	 * @param input
	 * @return
	 */
	public int getTotalTrappedWaterWithStack(int[] input) {
		GenericStack<Integer> stack = new GenericStack<Integer>();
		int totalWater = 0;
		for(int i=0;i<input.length;i++){
			while(!stack.isEmpty() && input[i]>input[stack.peek()]){
				int temp = stack.pop();
				if(!stack.isEmpty()){
					int minimum = getMinimumValue(input[i],input[stack.peek()]);
					int waterInOneBox = minimum-input[temp];
					totalWater += waterInOneBox * (i-stack.peek()-1);
				}
			}
			stack.push(i);
		}
		return totalWater;
	}
	
	private int getMinimumValue(int val1,int val2){
		if(val1<val2){
			return val1;
		}
		else{
			return val2;
		}
	}
	
	
}
