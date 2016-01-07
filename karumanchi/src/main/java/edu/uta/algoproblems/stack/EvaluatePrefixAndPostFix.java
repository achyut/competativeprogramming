package edu.uta.algoproblems.stack;

import com.sui.datastructures.GenericStack;

public class EvaluatePrefixAndPostFix {

	public int EvaluatePostFixExpression(String postFixInput){
		GenericStack<Character> stack = new GenericStack<Character>();
		for(int i=0;i<postFixInput.length();i++){
			char curr = postFixInput.charAt(i);
			if(curr == '+'){
		//		int item1 = Integer.parseInt(stack.pop().toString());
		//		int item2 = Integer.parseInt(stack.pop().toString());
				//stack.push(item1+item2);
			}
			else if(curr == '-'){
				
			}
			else if(curr == '*'){
				
			}
			else if(curr == '/'){
				
			}
			else{
				stack.push(curr);
			}
		}
		return 0;
	}
}
