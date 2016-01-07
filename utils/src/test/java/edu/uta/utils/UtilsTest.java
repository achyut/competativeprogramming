package edu.uta.utils;

import edu.uta.utils.PrintUtils;
import junit.framework.TestCase;

public class UtilsTest extends TestCase {

	public void testArrayPrintUtil(){
		int arr[] = {1,2,3,4,5};
		PrintUtils.printArray(arr);
	}
}
