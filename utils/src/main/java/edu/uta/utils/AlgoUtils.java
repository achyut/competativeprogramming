package edu.uta.utils;

import java.util.HashMap;
import java.util.Map;

public class AlgoUtils {
	private static Map<Character,Integer> operatorPrecedence = new HashMap<Character, Integer>();
	public AlgoUtils() {
		setPrecedence();
	}
	
	private void setPrecedence(){
		operatorPrecedence.put('/',13);
		operatorPrecedence.put('*',13);
		operatorPrecedence.put('+',12);
		operatorPrecedence.put('-',12);
	}
	
	public static boolean checkPrescedence(Character input1,Character input2){
		try{
			if(operatorPrecedence.get(input1)>operatorPrecedence.get(input2)){
				return true;
			}	
			return false;
		}
		catch (NullPointerException e){
			return false;
		}
	}
	
	public static String reverseString(String inputString){
		String out = "";
		for(int i=inputString.length()-1;i>=0;i--){
			out+=inputString.charAt(i);
		}
		return out;
	}
}
