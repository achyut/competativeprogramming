package edu.uta.algoproblems.stack;

import com.sui.datastructures.GenericStack;

import edu.uta.utils.AlgoUtils;

public class InfixToPrefixAndPostFix {

	public String convertInfixToPrefix(String infixString){
		return AlgoUtils.reverseString(convertInfixToPostFix(infixString));
	}
	
	public String convertInfixToPostFix(String infixString){
		GenericStack<Character> stack = new GenericStack<Character>();
		String finalString = "";
		for(int i=0;i<infixString.length();i++){
			char curr = infixString.charAt(i);
			if(curr=='(' || curr=='{' || curr=='[' || curr=='/' || curr=='*' || curr=='+' || curr=='-'){
				if(!stack.isEmpty()){
					char temp = stack.pop();
					// check for low priority or opening bracket
					if(temp!='(' && temp!='{' && temp!='[' && !AlgoUtils.checkPrescedence(curr,temp)){
						finalString+=temp;
					}
				}
				stack.push(curr);
			}
			else if(curr==')' || curr=='}' || curr==']'){
				char temp = stack.pop();
				while(temp!='(' && temp!='{' && temp!='['){
					finalString+=temp;
					if(!stack.isEmpty()){
						temp = stack.pop();	
					}
					else{
						break;
					}
				}
			}
			else{
				finalString+=curr;
			}
		}
		while(!stack.isEmpty()){
			finalString+=stack.pop();	
		}
		//System.out.println(finalString);
		return finalString;
	}
	
}
