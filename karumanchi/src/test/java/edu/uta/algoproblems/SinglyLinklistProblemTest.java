package edu.uta.algoproblems;

import com.sui.datastructures.SinglyList;
import com.sui.datastructures.nodes.SinglyNode;

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
	
	public void testFindIfLooopExists(){
		SinglyLinklistProblems<String> sls = new SinglyLinklistProblems<String>();
		SinglyList<String> sl = new SinglyList<String>();
		SinglyNode<String> node8 = new SinglyNode<String>("node8");
		node8.next = null;
		SinglyNode<String> node7 = new SinglyNode<String>("node7");
		node7.next = node8;
		SinglyNode<String> node6 = new SinglyNode<String>("node6");
		node6.next = node7;
		SinglyNode<String> node5 = new SinglyNode<String>("node5");
		node5.next = node6;
		SinglyNode<String> node4 = new SinglyNode<String>("node4");
		node4.next = node5;
		SinglyNode<String> node3 = new SinglyNode<String>("node3");
		node3.next = node4;
		SinglyNode<String> node2 = new SinglyNode<String>("node2");
		node2.next = node3;
		SinglyNode<String> node1 = new SinglyNode<String>("node1");
		node1.next = node2;
		
		sl.addInTail(node1);
		sl.addInTail(node2);
		sl.addInTail(node3);
		sl.addInTail(node4);
		sl.addInTail(node5);
		sl.addInTail(node6);
		sl.addInTail(node7);
		sl.addInTail(node8);
		
		node8.next=node3;
		assertTrue(sls.ifLoopExists(sl));
		node8.next = null;
		assertFalse(sls.ifLoopExists(sl));
	}
	
	public void testFindBeginOfLoop() throws Exception{
		SinglyLinklistProblems<String> sls = new SinglyLinklistProblems<String>();
		SinglyList<String> sl = new SinglyList<String>();
		SinglyNode<String> node8 = new SinglyNode<String>("node8");
		node8.next = null;
		SinglyNode<String> node7 = new SinglyNode<String>("node7");
		node7.next = node8;
		SinglyNode<String> node6 = new SinglyNode<String>("node6");
		node6.next = node7;
		SinglyNode<String> node5 = new SinglyNode<String>("node5");
		node5.next = node6;
		SinglyNode<String> node4 = new SinglyNode<String>("node4");
		node4.next = node5;
		SinglyNode<String> node3 = new SinglyNode<String>("node3");
		node3.next = node4;
		SinglyNode<String> node2 = new SinglyNode<String>("node2");
		node2.next = node3;
		SinglyNode<String> node1 = new SinglyNode<String>("node1");
		node1.next = node2;
		
		sl.addInTail(node1);
		sl.addInTail(node2);
		sl.addInTail(node3);
		sl.addInTail(node4);
		sl.addInTail(node5);
		sl.addInTail(node6);
		sl.addInTail(node7);
		sl.addInTail(node8);
		
		node8.next=node3;
		assertTrue(sls.ifLoopExists(sl));
		assertEquals("node3",(String)sls.findBeginOfLoop(sl).value);
	}
	
	public void testRemoveOfLoopInList() throws Exception{
		SinglyLinklistProblems<String> sls = new SinglyLinklistProblems<String>();
		SinglyList<String> sl = new SinglyList<String>();
		SinglyNode<String> node8 = new SinglyNode<String>("node8");
		node8.next = null;
		SinglyNode<String> node7 = new SinglyNode<String>("node7");
		node7.next = node8;
		SinglyNode<String> node6 = new SinglyNode<String>("node6");
		node6.next = node7;
		SinglyNode<String> node5 = new SinglyNode<String>("node5");
		node5.next = node6;
		SinglyNode<String> node4 = new SinglyNode<String>("node4");
		node4.next = node5;
		SinglyNode<String> node3 = new SinglyNode<String>("node3");
		node3.next = node4;
		SinglyNode<String> node2 = new SinglyNode<String>("node2");
		node2.next = node3;
		SinglyNode<String> node1 = new SinglyNode<String>("node1");
		node1.next = node2;
		
		sl.addInTail(node1);
		sl.addInTail(node2);
		sl.addInTail(node3);
		sl.addInTail(node4);
		sl.addInTail(node5);
		sl.addInTail(node6);
		sl.addInTail(node7);
		sl.addInTail(node8);
		
		node8.next=node3;
		assertTrue(sls.ifLoopExists(sl));
		assertEquals("node3",(String)sls.findBeginOfLoop(sl).value);
		sls.removeLoopFromList(sl);
		assertFalse(sls.ifLoopExists(sl));
	}
	
}
