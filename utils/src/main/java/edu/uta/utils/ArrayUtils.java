package edu.uta.utils;

import com.sui.datastructures.GenericStack;

public class ArrayUtils {

	public static void initializeArrayByZeros(int[] inputArray){
		for(int i=0;i<inputArray.length;i++){
			inputArray[i] = 0;
		}
	}
	
	public static boolean checkIfTheStackIsSorted(GenericStack<Integer> stack){
		if(stack.isEmpty()){
			return true;
		}
		int prev = stack.pop();
		while(!stack.isEmpty()){
			int val = stack.pop();
			if(val>prev){
				return false;
			}
		}
		return true;
	}
}
