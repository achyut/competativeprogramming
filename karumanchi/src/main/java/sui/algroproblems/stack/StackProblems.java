package sui.algroproblems.stack;

import java.util.Stack;

import com.sui.datastructures.GenericStack;

public class StackProblems {

	public boolean checkForBalancingExpression(String exp) {
		GenericStack<Character> stack = new GenericStack<Character>();
		for (int i = 0; i < exp.length(); i++) {
			char curr = exp.charAt(i);
			if (curr == '(' || curr == '{' || curr == '[') {
				stack.push(curr);
			} else if (curr == ')' && stack.pop() != '(') {
				return false;
			} else if (curr == '}' && stack.pop() != '{') {
				return false;
			} else if (curr == ']' && stack.pop() != '[') {
				return false;
			}

		}
		return true;

	}

	public int EvalutePostfix(String[] exp) {

		GenericStack<Integer> stack = new GenericStack<Integer>();
		for (int i = 0; i < exp.length; i++) {
			String curr = exp[i];
			if (curr == "+") {
				int p1 = stack.pop();
				int p2 = stack.pop();
				stack.push(p2 + p1);
			} else if (curr == "-") {
				int p1 = stack.pop();
				int p2 = stack.pop();
				stack.push(p2 - p1);
			} else if (curr == "*") {
				int p1 = stack.pop();
				int p2 = stack.pop();
				stack.push(p2 * p1);
			} else if (curr == "/") {
				int p1 = stack.pop();
				int p2 = stack.pop();
				stack.push(p2 / p1);
			} else {
				stack.push(Integer.parseInt(curr));
			}
		}
		return stack.pop();
	}

	public boolean checkPalindrome(String[] exp) {
		int i = 0;
		int j = exp.length - 1;
		while (i < j && exp[i] == exp[j]) {
			i++;
			j--;
		}
		if (i < j) {
			return false;
		} else
			return true;
	}

	public boolean checkPalindrome1(String[] exp) {
		int i = 0, j = exp.length - 1 / 2;
		GenericStack<String> stack = new GenericStack<String>();
		for (i = 0; i < j; i++) {
			stack.push(exp[i]);
		}

		while (stack.pop().equals(exp[j++])) {
			j++;

		}

		if (stack.isEmpty() && j > exp.length) {
			return true;
		} else
			return false;
	}

	public String simplyPath(String exp) {
		String[] arr = exp.split("/");
		// GenericStack<String> stack=new GenericStack<String>();
		Stack<String> stack = new Stack<String>();
		for (int i = 0; i < arr.length; i++) {
			arr[i] = arr[i].trim();
			if (arr[i].equals("") || arr[i].equals(".")) {
				continue;
			} else if (arr[i].equals("..")) {
				if (!stack.isEmpty()) {
					stack.pop();
				}
			} else {
				stack.push(arr[i]);
			}
		}
		if (stack.isEmpty()) {
			return "/";
		}

		String result = "";
		while (!stack.isEmpty()) {
			result = "/" + stack.pop() + result;
		}
		return result;
	}

	public int[] calcualteSpan(int[] price) {
		Stack<Integer> st = new Stack<Integer>();
		int[] span = new int[price.length];
		st.push(0);
		span[0] = 1;
		for (int i = 1; i < price.length; i++) {
			while (!st.isEmpty() && price[st.peek()] < price[i]) {
				st.pop();
			}
			
			if (st.isEmpty()) {
				span[i] =i+1;
			} else {
				span[i] = i - st.peek();
			}
			st.push(i);
		}
		
		return span;
	}

	public int MaxRectangle(int[] height) {
		Stack<Integer> st=new Stack<Integer>();
		int max=0;
		int i=0;
		while(i<height.length){
			if(st.isEmpty()||height[st.peek()]<height[i]){
				st.push(i++);
			}
			else{
				
					int top=st.pop();
				if(st.empty()){
					max=Math.max(max, height[top]*i);
				}
				else{
					max=Math.max(max,height[top]*(i-st.peek()-1));
				}
			}
			}
		
		
		while(!st.empty()){
			int top=st.pop();
	if(st.empty()){
		max=Math.max(max, height[top]*i);
	}
	else{
			max=Math.max(max,height[top]* (i-st.peek()-1));
		}
		}
		
	
		return max;
	}

	public int TrapWater(int[] height) {
		int water=0;
		Stack<Integer> st=new Stack<Integer>();
		for(int i=0;i<height.length;i++){
			if(st.isEmpty()||height[st.peek()]>=height[i]){
				st.push(i);
			}
			else{
				int temp=st.pop();			
				if(!st.isEmpty()){
					int min=(Math.min(height[st.peek()], height[i]));
					water+=(min-height[temp])*(i-st.peek()-1);
				}
				i--;
			}
		}
		
		return water;
	}
}