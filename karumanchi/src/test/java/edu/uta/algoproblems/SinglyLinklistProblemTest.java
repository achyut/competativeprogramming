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
		SinglyNode<String> node7 = new SinglyNode<String>("node7");
		SinglyNode<String> node6 = new SinglyNode<String>("node6");
		SinglyNode<String> node5 = new SinglyNode<String>("node5");
		SinglyNode<String> node4 = new SinglyNode<String>("node4");
		SinglyNode<String> node3 = new SinglyNode<String>("node3");
		SinglyNode<String> node2 = new SinglyNode<String>("node2");
		SinglyNode<String> node1 = new SinglyNode<String>("node1");
		
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
		SinglyNode<String> node7 = new SinglyNode<String>("node7");
		SinglyNode<String> node6 = new SinglyNode<String>("node6");
		SinglyNode<String> node5 = new SinglyNode<String>("node5");
		SinglyNode<String> node4 = new SinglyNode<String>("node4");
		SinglyNode<String> node3 = new SinglyNode<String>("node3");
		SinglyNode<String> node2 = new SinglyNode<String>("node2");
		SinglyNode<String> node1 = new SinglyNode<String>("node1");
		
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
		SinglyNode<String> node7 = new SinglyNode<String>("node7");
		SinglyNode<String> node6 = new SinglyNode<String>("node6");
		SinglyNode<String> node5 = new SinglyNode<String>("node5");
		SinglyNode<String> node4 = new SinglyNode<String>("node4");
		SinglyNode<String> node3 = new SinglyNode<String>("node3");
		SinglyNode<String> node2 = new SinglyNode<String>("node2");
		SinglyNode<String> node1 = new SinglyNode<String>("node1");
		
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
	
	public void testSortingOfList() throws Exception{
		SinglyLinklistProblems<Integer> sls = new SinglyLinklistProblems<Integer>();
		SinglyList<Integer> sl = new SinglyList<Integer>();
		SinglyNode<Integer> node8 = new SinglyNode<Integer>(8);
		SinglyNode<Integer> node7 = new SinglyNode<Integer>(7);
		SinglyNode<Integer> node6 = new SinglyNode<Integer>(6);
		SinglyNode<Integer> node5 = new SinglyNode<Integer>(5);
		SinglyNode<Integer> node4 = new SinglyNode<Integer>(4);
		SinglyNode<Integer> node3 = new SinglyNode<Integer>(3);
		SinglyNode<Integer> node2 = new SinglyNode<Integer>(2);
		SinglyNode<Integer> node1 = new SinglyNode<Integer>(1);
		
		sl.addInTail(node1);
		sl.addInTail(node2);
		sl.addInTail(node3);
		sl.addInTail(node4);
		sl.addInTail(node5);
		sl.addInTail(node6);
		sl.addInTail(node7);
		sl.addInTail(node8);
		assertTrue(sls.isSorted(sl));
		node2.value = 4;
		assertFalse(sls.isSorted(sl));
		sls.sortLinkList(sl);
		assertTrue(sls.isSorted(sl));		
	}

	
	public void testInsertInSortedList() throws Exception{
		SinglyLinklistProblems<Integer> sls = new SinglyLinklistProblems<Integer>();
		SinglyList<Integer> sl = new SinglyList<Integer>();
		SinglyNode<Integer> node8 = new SinglyNode<Integer>(8);
		SinglyNode<Integer> node7 = new SinglyNode<Integer>(7);
		SinglyNode<Integer> node6 = new SinglyNode<Integer>(6);
		SinglyNode<Integer> node5 = new SinglyNode<Integer>(5);
		SinglyNode<Integer> node4 = new SinglyNode<Integer>(4);
		SinglyNode<Integer> node3 = new SinglyNode<Integer>(3);
		SinglyNode<Integer> node2 = new SinglyNode<Integer>(2);
		SinglyNode<Integer> node1 = new SinglyNode<Integer>(1);
		
		sl.addInTail(node1);
		sl.addInTail(node2);
		sl.addInTail(node3);
		sl.addInTail(node4);
		sl.addInTail(node5);
		sl.addInTail(node6);
		sl.addInTail(node7);
		sl.addInTail(node8);
		
		assertTrue(sls.isSorted(sl));
		sls.insertInSortedList(sl,1);
		sls.insertInSortedList(sl,5);
		sls.insertInSortedList(sl,7);
		assertTrue(sls.isSorted(sl));		
	}
	
	public void testReversingOfList() throws Exception{
		SinglyLinklistProblems<Integer> sls = new SinglyLinklistProblems<Integer>();
		SinglyList<Integer> sl = new SinglyList<Integer>();
		SinglyNode<Integer> node8 = new SinglyNode<Integer>(1);
		SinglyNode<Integer> node7 = new SinglyNode<Integer>(2);
		SinglyNode<Integer> node6 = new SinglyNode<Integer>(3);
		SinglyNode<Integer> node5 = new SinglyNode<Integer>(4);
		SinglyNode<Integer> node4 = new SinglyNode<Integer>(5);
		SinglyNode<Integer> node3 = new SinglyNode<Integer>(6);
		SinglyNode<Integer> node2 = new SinglyNode<Integer>(7);
		SinglyNode<Integer> node1 = new SinglyNode<Integer>(8);
		
		sl.addInTail(node1);
		sl.addInTail(node2);
		sl.addInTail(node3);
		sl.addInTail(node4);
		sl.addInTail(node5);
		sl.addInTail(node6);
		sl.addInTail(node7);
		sl.addInTail(node8);
		assertTrue(sls.isReverseSorted(sl));
		node2.value = 1;
		assertFalse(sls.isReverseSorted(sl));
		node2.value = 7;
		sls.reverseList(sl);
		assertTrue(sls.isSorted(sl));		
	}
}
