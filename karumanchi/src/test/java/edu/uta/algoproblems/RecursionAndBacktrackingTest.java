package edu.uta.algoproblems;

import edu.uta.algoproblems.recursionandbacktracking.BacktrackingProblems;
import edu.uta.algoproblems.recursionandbacktracking.RecursionProblems;
import junit.framework.TestCase;

public class RecursionAndBacktrackingTest extends TestCase{

	public void testTowerOfHenoi(){
		RecursionProblems rp = new RecursionProblems();
		rp.towerOfHenoi(3, 'A', 'B','C');
	}
	
	public void testIsArraySorted(){
		RecursionProblems rp = new RecursionProblems();
		int arr[] = {3,4,5,6,7};
		assertTrue(rp.checkSortedArray(arr,arr.length));
		int arr1[] = {4,6,3,7,5};
		assertFalse(rp.checkSortedArray(arr1, arr1.length));
	}
	
	public void testCreateBinaryStringIterative(){
	//	BacktrackingProblems bp = new BacktrackingProblems(5);
		//bp.createBinaryStringIterative();
	}
	public void testCreateBinaryStringRecursive(){
		BacktrackingProblems bp = new BacktrackingProblems(5);
		bp.createBinaryStringRecursive(5);
	}
}
