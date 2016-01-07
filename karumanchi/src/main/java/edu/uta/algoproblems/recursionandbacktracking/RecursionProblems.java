package edu.uta.algoproblems.recursionandbacktracking;

public class RecursionProblems {

	public void towerOfHenoi(int n,char frompeg,char auxpeg,char topeg){
		if(n==1){
			//System.out.println("Moving the disk 1 from "+frompeg+" to "+topeg);
			return;
		}
		towerOfHenoi(n-1, frompeg,topeg,auxpeg);
		//System.out.println("Moving the disk "+n+" from "+frompeg+" to "+topeg);
		towerOfHenoi(n-1, auxpeg, frompeg,topeg);
	}
	
	public boolean checkSortedArray(int[] input,int n){
		if(n==1){
			if(input[0]<input[1]){
				return true;
			}
			else{
				return false;
			}
		}
		if(input[n-1]<input[n-2]){
			return false;
		}
		else{
			return checkSortedArray(input,n-1);
		}
	}
	
	
}
