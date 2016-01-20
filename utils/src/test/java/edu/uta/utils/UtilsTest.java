package edu.uta.utils;

import com.sui.datastructures.GenericStack;

import edu.uta.utils.PrintUtils;
import junit.framework.TestCase;

public class UtilsTest extends TestCase {

	public void testArrayPrintUtil(){
		int arr[] = {1,2,3,4,5};
		PrintUtils.printArray(arr);
	}
	
	public void testisStackAscendingOrder(){
		GenericStack<Integer> stack = new GenericStack<Integer>();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		stack.push(6);
		boolean res = ArrayUtils.checkIfTheStackIsSorted(stack);
		assertTrue(res);
		
		GenericStack<Integer> stack1 = new GenericStack<Integer>();
		stack1.push(1);
		stack1.push(2);
		stack1.push(3);
		stack1.push(8);
		stack1.push(5);
		stack1.push(6);
		res = ArrayUtils.checkIfTheStackIsSorted(stack1);
		assertFalse(res);
	}
}
