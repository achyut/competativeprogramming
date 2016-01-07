package edu.uta.algoproblems.stack;

import com.sui.datastructures.GenericStack;

/**
 * This is a solution for the problem of checking if the arithmetic expression is balanced or not
 * @author achyut
 *
 */
public class BalancingOfSymbols {

	GenericStack<Character> stack = new GenericStack<Character>();
	
	public boolean checkIfBalanced(String input){
		for(int i=0;i<input.length();i++){
			char curr = input.charAt(i);
			if(curr=='[' || curr=='{' || curr=='('){
				stack.push(curr);
			}
			if(curr==']' || curr=='}' || curr==')'){
				char popedItem = stack.pop();
				if(curr== ']' && popedItem=='['){
					continue;
				}
				else if(curr== '}' && popedItem=='{'){
					continue;
				}
				else if(curr== ')' && popedItem=='('){
					continue;
				}
				else{
					return false;
				}
			}
		}
		return true;
	}
	
}
