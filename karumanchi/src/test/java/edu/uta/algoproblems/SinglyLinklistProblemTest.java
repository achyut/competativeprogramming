package edu.uta.algoproblems;

import com.sui.datastructures.SinglyList;

import edu.uta.algoproblems.linklist.SinglyLinklistProblems;
import junit.framework.TestCase;

public class SinglyLinklistProblemTest extends TestCase{

	public void testFindNthFromEnd() throws Exception{
		SinglyLinklistProblems<String> sls = new SinglyLinklistProblems<String>();
		SinglyList<String> sl = new SinglyList<String>();
		sl.addInTail("node1");
		sl.addInTail("node2");
		sl.addInTail("node3");
		sl.addInTail("node4");
		sl.addInTail("node5");
		sl.addInTail("node6");
		assertEquals("node1",sls.findNthFromEnd(sl,6));
		assertEquals("node3",sls.findNthFromEnd(sl,4));
		assertEquals("node6",sls.findNthFromEnd(sl,1));
	}
	
	public void testFindNthFromEndFast() throws Exception{
		SinglyLinklistProblems<String> sls = new SinglyLinklistProblems<String>();
		SinglyList<String> sl = new SinglyList<String>();
		sl.addInTail("node1");
		sl.addInTail("node2");
		sl.addInTail("node3");
		sl.addInTail("node4");
		sl.addInTail("node5");
		sl.addInTail("node6");
		assertEquals("node1",sls.findNthFromEndFast(sl,6));
		assertEquals("node3",sls.findNthFromEndFast(sl,4));
		assertEquals("node6",sls.findNthFromEndFast(sl,1));
	}
}
