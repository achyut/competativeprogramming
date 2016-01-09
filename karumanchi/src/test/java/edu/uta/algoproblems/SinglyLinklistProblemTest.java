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
	public void testFindNthFromEndUsingRecursion() throws Exception{
		SinglyLinklistProblems<String> sls = new SinglyLinklistProblems<String>();
		SinglyList<String> sl = new SinglyList<String>();
		sl.addInTail("node1");
		sl.addInTail("node2");
		sl.addInTail("node3");
		sl.addInTail("node4");
		sl.addInTail("node5");
		sl.addInTail("node6");
		//TODO:implementation remains
		//assertEquals("node1",sls.findNthFromEndRecursion(sl,6));
		//assertEquals("node3",sls.findNthFromEndFast(sl,4));
		//assertEquals("node6",sls.findNthFromEndFast(sl,1));
	}
	
	public void testRemoveNodeFromEnd() throws Exception{
		//eg.Given linked list: 1->2->3->4->5, and n = 2.
		//After removing the second node from the end, the linked list becomes 1->2->3->5.
		SinglyLinklistProblems<String> sls = new SinglyLinklistProblems<String>();
		SinglyList<String> sl = new SinglyList<String>();
		sl.addInTail("node1");
		sl.addInTail("node2");
		sl.addInTail("node3");
		sl.addInTail("node4");
		sl.addInTail("node5");
		sl.addInTail("node6");
		sls.removeNthFromEnd(sl,6);
		assertEquals("node2->node3->node4->node5->node6->/",sl.toString());
		sls.removeNthFromEnd(sl,1);
		assertEquals("node2->node3->node4->node5->/",sl.toString());
		sls.removeNthFromEnd(sl,3);
		assertEquals("node2->node4->node5->/",sl.toString());
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
	
	public void testReverseAListFromMtoN()throws Exception{
		//For example:
		//Given 1->2->3->4->5->NULL, m = 2 and n = 4,
		//return 1->4->3->2->5->NULL.
		SinglyLinklistProblems<Integer> sls = new SinglyLinklistProblems<Integer>();
		SinglyList<Integer> sl = new SinglyList<Integer>();
		
		sl.addInTail(1);
		sl.addInTail(2);
		sl.addInTail(3);
		sl.addInTail(4);
		sl.addInTail(5);
		sl.addInTail(6);
		sl.addInTail(7);
		//System.out.println(sl);
		assertEquals("1->2->3->4->5->6->7->/",sl.toString());
		sls.reverseListFromMtoN(sl,2,4);
		//System.out.println(sl);
		assertEquals("1->4->3->2->5->6->7->/",sl.toString());
	}
	
	public void testSortListInNlogN() throws Exception{
		//TODO:implementation remains
	}

	public void testIntersectionPointOfList() throws Exception{
		SinglyLinklistProblems<Integer> sls = new SinglyLinklistProblems<Integer>();
		SinglyList<Integer> sl = new SinglyList<Integer>();
		SinglyNode<Integer> node1 = new SinglyNode<Integer>(1);
		SinglyNode<Integer> node2 = new SinglyNode<Integer>(2);
		SinglyNode<Integer> node3 = new SinglyNode<Integer>(3);
		SinglyNode<Integer> node4 = new SinglyNode<Integer>(4);
		
		SinglyNode<Integer> node6 = new SinglyNode<Integer>(6);
		SinglyNode<Integer> node7 = new SinglyNode<Integer>(7);
		SinglyNode<Integer> node8 = new SinglyNode<Integer>(8);
		SinglyNode<Integer> node9 = new SinglyNode<Integer>(9);
		SinglyNode<Integer> node10 = new SinglyNode<Integer>(10);
		SinglyNode<Integer> node11 = new SinglyNode<Integer>(11);
		SinglyNode<Integer> node12 = new SinglyNode<Integer>(12);
		SinglyNode<Integer> node13 = new SinglyNode<Integer>(13);
		SinglyNode<Integer> node14 = new SinglyNode<Integer>(14);
		SinglyNode<Integer> node15 = new SinglyNode<Integer>(15);
		
		SinglyList<Integer> sl1 = new SinglyList<Integer>();
		SinglyList<Integer> sl2 = new SinglyList<Integer>();
		
		sl.addInTail(node1);
		sl.addInTail(node2);
		sl.addInTail(node3);
		sl.addInTail(node4);
		
		sl1.addInTail(node6);
		sl1.addInTail(node7);
		sl1.addInTail(node8);
		sl1.addInTail(node9);
		sl1.addInTail(node10);
		sl1.addInTail(node11);
		sl1.addInTail(node12);
		
		
		sl2.addInTail(node13);
		sl2.addInTail(node14);
		sl2.addInTail(node15);
		
		node4.next = node13;
		node12.next=node13;
		
		assertEquals(13,(int)sls.findInterSectionNode(sl1,sl).value);
		
	}
	
	public void testFindMiddleOfList() throws Exception{
		
	}
	
	public void testDisplayListFromEnd() throws Exception{
		
	}
	
	public void testListIsOddOrEven() throws Exception{
		
	}
	
	public void testMergeTwoSortedList() throws Exception{
		
	}
	
	public void testReverseLinkListInPairs() throws Exception{
		
	}
	public void testSplitCircularListIntoTwo() throws Exception{
		
	}
	public void testIfListIsPalindrome() throws Exception{
		
	}
	
	public void testReverseByBlockOfKSize() throws Exception{
		
	}
	
	public void testReverseByBlockOfKSizeUsingRecursion() throws Exception{
		
	}
	
	public void testGetJosephPosition() throws Exception{
		
	}
	public void testCloneWithRandomPointer() throws Exception{
		//A linked list is given such that each node contains an additional random pointer which could point to any node in the list or null.
		//Return a deep copy of the list.
	}
	
	public void testReorderWithEndOfList() throws Exception{
		
	}
	
	public void testReorderWithEndOfListRecursive() throws Exception{
		
	}
	
	public void testInsertionSortOfList() throws Exception{
		
	}
	
	public void testRotateListByKElements() throws Exception{
		//eg 1->2->3->4->5 if k=2 4->5->1->2->3->null
	}
	
	public void testAddTwoNumbersInAList() throws Exception{
		//eg. (3->4->3)+(5->6->4) = (8->0->8) // the numbers are stored in reverse order
	}
	
	public void testPartitionWFromKSmallestElements() throws Exception{
		//eg. 1->4->3->2->5->2 and k=3, return 1->2->2->4->3->5
		//the original relative order should be preserved
	}
	
	public void testMergeKSortedList() throws Exception{
		
	}
	
	public void testRemoveDuplicatesFromSortedList() throws Exception{
		//eg.Given 1->1->2, return 1->2.
		//Given 1->1->2->3->3, return 1->2->3.
	}

	public void testRemoveDuplicatesFromUnsortedList() throws Exception{
		
	}
	
	public void testRemoveElementWithValue(){
		//eg.Given: 1 --> 2 --> 6 --> 3 --> 4 --> 5 --> 6, val = 6
		//Return: 1 --> 2 --> 3 --> 4 --> 5
	}
	
	public void testDeleteANodeWithOnlyThatNode(){
		//Write a function to delete a node (except the tail) in a singly linked list, given only access to that node.
		//Supposed the linked list is 1 -> 2 -> 3 -> 4 and you are given the third node with value 3, the linked list should become 1 -> 2 -> 4 after calling your function.
	}
}
