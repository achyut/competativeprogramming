package edu.uta.utils;

public class PrintUtils {

	public static void printArray(Object[] arr){
		System.out.println("");
		for(int i =0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println("");
	}
	
	public static String printArray(int[] arr){
		//System.out.println("");
		String output = "";
		for(int i =0;i<arr.length;i++){
			output += arr[i]+" ";
		}
		return output;
	}	
}
