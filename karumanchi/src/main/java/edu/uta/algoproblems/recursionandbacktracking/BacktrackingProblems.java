package edu.uta.algoproblems.recursionandbacktracking;

import edu.uta.utils.ArrayUtils;
import edu.uta.utils.PrintUtils;

public class BacktrackingProblems {

	int binstr[];
	
	public BacktrackingProblems(int n) {
		binstr = new int[n];
		ArrayUtils.initializeArrayByZeros(binstr);
	}
	
	public void createBinaryStringIterative(){
		PrintUtils.printArray(binstr);
		for(int i=0;i<binstr.length;i++){
			for(int j=binstr.length-1;j>=0;j--){
				for(int k=0;k<=1;k++){
					binstr[j] = k;
					PrintUtils.printArray(binstr);	
				}
			}
		}
	}
	
	public void createBinaryStringRecursive(int n){
		if(n<1){
			PrintUtils.printArray(binstr);
		}
		else{
			binstr[n-1] = 0;
			createBinaryStringRecursive(n-1);
			binstr[n-1] = 1;
			createBinaryStringRecursive(n-1);
		}
	}
}
