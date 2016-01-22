package edu.uta.algoproblems;

import com.sui.datastructures.CircularList;
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
		SinglyLinklistProblems<String> sls = new SinglyLinklistProblems<String>();
		SinglyList<String> sl = new SinglyList<String>();
		sl.addInTail("node1");
		sl.addInTail("node2");
		sl.addInTail("node3");
		sl.addInTail("node4");
		sl.addInTail("node5");
		sl.addInTail("node6");
		assertEquals("node3",sls.findMiddleOfList(sl).value);
		sl.addInTail("node7");
		assertEquals("node3",sls.findMiddleOfList(sl).value);
		sl.addInTail("node8");
		assertEquals("node4",sls.findMiddleOfList(sl).value);
	}
	
	public void testDisplayListFromEnd() throws Exception{
		SinglyLinklistProblems<String> sls = new SinglyLinklistProblems<String>();
		SinglyList<String> sl = new SinglyList<String>();
		sl.addInTail("node1");
		sl.addInTail("node2");
		sl.addInTail("node3");
		sl.addInTail("node4");
		sl.addInTail("node5");
		sl.addInTail("node6");
		assertEquals("node6->node5->node4->node3->node2->node1->/",sls.displayListFromEnd(sl));
	}
	
	public void testListIsOddOrEven() throws Exception{
		SinglyLinklistProblems<String> sls = new SinglyLinklistProblems<String>();
		SinglyList<String> sl = new SinglyList<String>();
		sl.addInTail("node1");
		sl.addInTail("node2");
		sl.addInTail("node3");
		sl.addInTail("node4");
		sl.addInTail("node5");
		sl.addInTail("node6");
		assertTrue(sls.isListEven(sl));
		sl.addInTail("node7");
		assertFalse(sls.isListEven(sl));
	}
	
	public void testMergeTwoSortedList() throws Exception{
		SinglyLinklistProblems<Integer> sls = new SinglyLinklistProblems<Integer>();
		SinglyList<Integer> sl1 = new SinglyList<Integer>();
		sl1.addInTail(1);
		sl1.addInTail(2);
		sl1.addInTail(3);
		sl1.addInTail(4);
		sl1.addInTail(5);
		sl1.addInTail(6);
		
		SinglyList<Integer> sl2 = new SinglyList<Integer>();
		sl2.addInTail(11);
		sl2.addInTail(12);
		sl2.addInTail(13);
		sl2.addInTail(14);
		sl2.addInTail(15);
		sl2.addInTail(16);
		
		//System.out.println(sl1);
		//System.out.println(sl2);
		
		//System.out.println(sl1.printList(sls.getMergedList(sl1,sl2)));
		assertEquals("1->2->3->4->5->6->11->12->13->14->15->16->/",sl1.printList(sls.getMergedListUsingExtraMemory(sl1,sl2)));
		
		
		SinglyList<Integer> sl3 = new SinglyList<Integer>();
		sl3.addInTail(1);
		sl3.addInTail(1);
		sl3.addInTail(3);
		sl3.addInTail(7);
		sl3.addInTail(8);
		sl3.addInTail(10);
		//System.out.println(sl3);
		//System.out.println(sl1.printList(sls.getMergedList(sl1,sl3)));
		assertEquals("1->1->1->2->3->3->4->5->6->7->8->10->/",sl1.printList(sls.getMergedListUsingExtraMemory(sl1,sl3)));
		
		
	}
	
	
	public void testReverseLinkListInPairs() throws Exception{
		SinglyLinklistProblems<String> sls = new SinglyLinklistProblems<String>();
		SinglyList<String> sl = new SinglyList<String>();
		sl.addInTail("node1");
		sl.addInTail("node2");
		sl.addInTail("node3");
		sl.addInTail("node4");
		sl.addInTail("node5");
		sl.addInTail("node6");
		sl.addInTail("node7");
		sl.addInTail("node8");
		sl.addInTail("node9");
		//System.out.println(sl.printList());
		sls.reverseLinkListInPairs(sl);
		assertEquals("node2->node1->node4->node3->node6->node5->node8->node7->node9->/",sl.printList());
		//System.out.println(sl.printList());
		
	}
	public void testSplitCircularListIntoTwo() throws Exception{
		SinglyLinklistProblems<String> sls = new SinglyLinklistProblems<String>();
		CircularList<String> sl= new CircularList<String>();
		sl.addInTail("node1");
		sl.addInTail("node2");
		sl.addInTail("node3");
		sl.addInTail("node4");
		sl.addInTail("node5");
		sl.addInTail("node6");
		sl.addInTail("node7");
		sl.addInTail("node8");
		//sl.addInTail("node9");
		//System.out.println(sl);
		SinglyList<SinglyNode<String>> sl1 = sls.splitCircularList(sl); 
		SinglyNode<String> cl1 = sl1.getHead().value;
		SinglyNode<String> cl2 = sl1.getTail().value;
		//System.out.println(cl1.next.value);
		//System.out.println(sl.printList(cl1));
		//System.out.println(sl.printList(cl2));
		assertEquals("node1->node2->node3->node4->/",sl.printList(cl1));
		assertEquals("node5->node6->node7->node8->/",sl.printList(cl2));
	}
	
	public void testIfListIsPalindrome() throws Exception{
		SinglyLinklistProblems<String> sls = new SinglyLinklistProblems<String>();
		SinglyList<String> sl = new SinglyList<String>();
		sl.addInTail("node1");
		sl.addInTail("node2");
		sl.addInTail("node3");
		sl.addInTail("node4");
		sl.addInTail("node3");
		sl.addInTail("node2");
		sl.addInTail("node1");
		assertTrue(sls.isPalindrome(sl));
		
		SinglyList<String> sl1 = new SinglyList<String>();
		sl1.addInTail("node1");
		sl1.addInTail("node2");
		sl1.addInTail("node1");
		assertTrue(sls.isPalindrome(sl1));
		
		SinglyList<String> sl2 = new SinglyList<String>();
		sl2.addInTail("node1");
		sl2.addInTail("node2");
		sl2.addInTail("node3");
		sl2.addInTail("node4");
		sl2.addInTail("node3");
		sl2.addInTail("node1");
		sl2.addInTail("node2");
		assertFalse(sls.isPalindrome(sl2));
		
		SinglyList<String> sl3 = new SinglyList<String>();
		sl3.addInTail("node1");
		sl3.addInTail("node2");
		assertFalse(sls.isPalindrome(sl3));	
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
		SinglyLinklistProblems<String> sls = new SinglyLinklistProblems<String>();
		SinglyList<String> sl = new SinglyList<String>();
		sl.addInTail("node1");
		sl.addInTail("node2");
		sl.addInTail("node3");
		sl.addInTail("node4");
		sl.addInTail("node5");
		sls.rotateListByKElements(sl,2);
		//System.out.println(sl.printList());
		assertEquals("node4->node5->node1->node2->node3->/",sl.printList());
	}
	
	public void testAddTwoNumbersInAList() throws Exception{
		//eg. (3->4->3)+(5->6->4) = (8->0->8) // the numbers are stored in reverse order
		SinglyLinklistProblems<Integer> sls = new SinglyLinklistProblems<Integer>();
		SinglyList<Integer> sl1 = new SinglyList<Integer>();
		sl1.addInTail(3);
		sl1.addInTail(4);
		sl1.addInTail(3);
		
		SinglyList<Integer> sl2 = new SinglyList<Integer>();
		sl2.addInTail(5);
		sl2.addInTail(6);
		sl2.addInTail(4);
		assertEquals("8->0->8->/",sl1.printList(sls.addTwoNumbersInAList(sl1,sl2)));
	}
	
	public void testPartitionFromKSmallestElements() throws Exception{
		//eg. 1->4->3->2->5->2 and k=3, return 1->2->2->4->3->5
		//the original relative order should be preserved
		SinglyLinklistProblems<String> sls = new SinglyLinklistProblems<String>();
		SinglyList<Integer> sl1 = new SinglyList<Integer>();
		sl1.addInTail(8);
		sl1.addInTail(4);
		sl1.addInTail(3);
		sl1.addInTail(2);
		sl1.addInTail(5);
		sl1.addInTail(2);
		//System.out.println(sl1);
		sls.partitionFromKSmallestElement(sl1,3);
		//System.out.println(sl1.printList());
		assertEquals("3->2->2->8->4->5->/",sl1.printList());
	}
	
	public void testRemoveDuplicatesFromSortedList() throws Exception{
		//eg.Given 1->1->2, return 1->2.
		//Given 1->1->2->3->3, return 1->2->3.
		SinglyLinklistProblems<String> sls = new SinglyLinklistProblems<String>();
		SinglyList<String> sl = new SinglyList<String>();
		sl.addInTail("node1");
		sl.addInTail("node2");
		sl.addInTail("node2");
		sl.addInTail("node3");
		sl.addInTail("node4");
		sl.addInTail("node4");
		sl.addInTail("node5");
		sl.addInTail("node6");
		sls.removeDuplicatesFromSortedList(sl);
		assertEquals("node1->node2->node3->node4->node5->node6->/",sl.printList());
		
	}

	public void testRemoveElementWithValue(){
		//eg.Given: 1 --> 2 --> 6 --> 3 --> 4 --> 5 --> 6, val = 6
		//Return: 1 --> 2 --> 3 --> 4 --> 5
		SinglyLinklistProblems<String> sls = new SinglyLinklistProblems<String>();
		SinglyList<String> sl = new SinglyList<String>();
		sl.addInTail("node1");
		sl.addInTail("node2");
		sl.addInTail("node3");
		sl.addInTail("node4");
		sl.addInTail("node3");
		sl.addInTail("node6");
		sls.removeElementByValue(sl,"node3");
		assertEquals("node1->node2->node4->node6->/",sl.printList());
	}
	
	public void testDeleteANodeWithOnlyThatNode(){
		//Write a function to delete a node (except the tail) in a singly linked list, given only access to that node.
		//Supposed the linked list is 1 -> 2 -> 3 -> 4 and you are given the third node with value 3, the linked list should become 1 -> 2 -> 4 after calling your function.
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
		SinglyNode<String> nodeToDelete = node3;
		sls.deleteNodeWithPointerToOnlyThatNode(nodeToDelete);
		sl.decreaseLength(1);
		assertEquals("node1->node2->node4->node5->node6->node7->node8->/",sl.toString());
		
	}
}
