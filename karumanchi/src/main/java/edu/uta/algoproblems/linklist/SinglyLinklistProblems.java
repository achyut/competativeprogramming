package edu.uta.algoproblems.linklist;

import com.sui.datastructures.CircularList;
import com.sui.datastructures.GenericStack;
import com.sui.datastructures.SinglyList;
import com.sui.datastructures.nodes.SinglyNode;

public class SinglyLinklistProblems<Itemtype extends Comparable<Itemtype>> {

	/**
	 * @author achyut O(n)+O(n) solution In this solution we first traverse to
	 * the end of the list to get the length of the list and after that
	 * we find the location of the node by comparison and return the
	 * node
	 * @param sl
	 * @param i
	 * @return
	 * @throws Exception
	 */
	public Itemtype findNthFromEnd(SinglyList<Itemtype> sl, int i) throws Exception {
		if (sl.getHead() == null && sl.getTail() == null) {
			throw new Exception("Empty list.");
		} else {
			int length = 1;
			SinglyNode<Itemtype> curr = sl.getHead();
			do {
				length++;
				curr = curr.next;
			} while (curr != sl.getTail());

			int templength = 1;
			curr = sl.getHead();
			while ((length - templength) >= i) {
				templength++;
				curr = curr.next;
			}
			return curr.value;
		}

	}

	/**
	 * Method to find the nth element from the end of the list This algorithm
	 * finds the element in O(n) time complexity and O(1) space complexity In
	 * this method two pointers are used one is slow pointer and another is fast
	 * pointer the fast pointer is moved for n distance first and only slow
	 * pointer is started from there
	 * 
	 * @author achyut
	 * @param sl
	 * @param i
	 * @return
	 * @throws Exception
	 */
	public Itemtype findNthFromEndFast(SinglyList<Itemtype> sl, int i) throws Exception {
		if (sl.getHead() == null && sl.getTail() == null) {
			throw new Exception("Empty list.");
		} else {
			int length = 1;
			SinglyNode<Itemtype> slow = sl.getHead();
			SinglyNode<Itemtype> fast = sl.getHead();

			while (length < i) {
				length++;
				fast = fast.next;
			}

			while (fast != sl.getTail()) {
				slow = slow.next;
				fast = fast.next;
			}
			return slow.value;
		}
	}

	/**
	 * Floyds method to find if there exists a loop in the linked list.
	 * 
	 * @author achyut
	 * @param sl
	 * @return
	 */
	public boolean ifLoopExists(SinglyList<Itemtype> sl) {
		SinglyNode<Itemtype> curr1 = sl.getHead();
		SinglyNode<Itemtype> curr2 = sl.getHead().next;
		while (true) {
			if (curr2 == null) {
				return false;
			}
			if (curr1 == curr2) {
				return true;
			}
			curr1 = curr1.next;
			if (curr2.next != null) {
				curr2 = curr2.next.next;
			} else {
				curr2 = curr2.next;
			}
		}

	}

	/**
	 * Method to find the begin of the loop node in a link list using floyds
	 * method
	 * 
	 * @author achyut
	 * @param sl
	 * @return
	 * @throws Exception
	 */
	public SinglyNode<Itemtype> findBeginOfLoop(SinglyList<Itemtype> sl) throws Exception {
		if (sl.getHead() == null && sl.getTail() == null) {
			throw new Exception("Empty list.");
		}
		SinglyNode<Itemtype> curr1 = sl.getHead();
		SinglyNode<Itemtype> curr2 = sl.getHead().next.next;
		while (true) {
			if (curr2 == null) {
				throw new Exception("Loop not found in the linklist");
			}
			if (curr2 == curr1) {
				break;
			}
			curr1 = curr1.next;
			curr2 = curr2.next.next;
		}
		curr1 = sl.getHead();
		while (curr2 != curr1) {
			curr1 = curr1.next;
			curr2 = curr2.next.next;
		}
		return curr1;
	}

	/**
	 * Method to remove the loop from a link list using floyds method
	 * 
	 * @author achyut
	 * @param sl
	 * @throws Exception
	 */
	public void removeLoopFromList(SinglyList<Itemtype> sl) throws Exception {
		if (sl.getHead() == null && sl.getTail() == null) {
			throw new Exception("Empty list.");
		}
		SinglyNode<Itemtype> curr1 = sl.getHead();
		SinglyNode<Itemtype> curr2 = sl.getHead().next.next;
		while (true) {
			if (curr2 == null) {
				return;
			}
			if (curr1 == curr2) {
				break;
			}
			curr1 = curr1.next;
			curr2 = curr2.next.next;
		}
		SinglyNode<Itemtype> curr3 = curr1.next;
		curr1 = sl.getHead();

		while (curr2 != curr1) {
			curr2 = curr2.next.next;
			curr1 = curr1.next;
			curr3 = curr3.next;
		}
		// System.out.println(curr3.value);
		curr3.next = null;
	}

	/**
	 * Method to determine if the singly list is sorted
	 * 
	 * @author achyut
	 * @param sl
	 * @return
	 */
	public boolean isSorted(SinglyList<Itemtype> sl) {
		SinglyNode<Itemtype> curr = sl.getHead();
		Itemtype prev = curr.value;
		while (curr != null) {
			curr = curr.next;
			if (curr != null) {
				if (curr.value.compareTo(prev) < 0) {
					return false;
				}
				prev = curr.value;
			}
		}
		return true;
	}

	/**
	 * Method to determine if the singly list is reverse sorted
	 * 
	 * @author achyut
	 * @param sl
	 * @return
	 */
	public boolean isReverseSorted(SinglyList<Itemtype> sl) {
		boolean result = false;
		SinglyNode<Itemtype> curr = sl.getHead();
		Itemtype prev = curr.value;
		while (curr != null) {
			curr = curr.next;
			if (curr != null) {
				// System.out.println(curr.value+"|"+curr.value.compareTo(prev)+"|"+prev);
				if (curr.value.compareTo(prev) < 0) {
					result = true;
				} else {
					return false;
				}
				prev = curr.value;
			}
		}
		return result;
	}

	/**
	 * Method to sort a link list
	 * 
	 * @param sl
	 * @throws Exception
	 */
	public void sortLinkList(SinglyList<Itemtype> sl) throws Exception {
		if (sl.getHead() == null) {
			throw new Exception("Empty list");
		}
		SinglyNode<Itemtype> curr1 = sl.getHead();
		SinglyNode<Itemtype> curr2 = sl.getHead();
		for (int i = 1; i <= sl.getLength(); i++) {
			for (int j = i; j <= sl.getLength(); j++) {
				curr2 = curr1.next;
				if (curr2 != null && curr2.value.compareTo(curr1.value) < 0) {
					Itemtype temp = curr1.value;
					curr1.value = curr2.value;
					curr2.value = temp;
				}
			}
			curr1 = curr1.next;
		}
	}

	/**
	 * Method to reverse a link list
	 * 
	 * @param sl
	 */
	public void reverseList(SinglyList<Itemtype> sl) {
		SinglyNode<Itemtype> prev = sl.getHead();
		SinglyNode<Itemtype> curr1 = sl.getHead().next;
		SinglyNode<Itemtype> curr2 = sl.getHead().next.next;
		sl.setTail(sl.getHead());
		prev.next = null;
		while (curr2.next != null) {
			curr1.next = prev;
			prev = curr1;
			curr1 = curr2;
			curr2 = curr2.next;
		}
		curr2.next = curr1;
		curr1.next = prev;
		sl.setHead(curr2);
	}

	/**
	 * Method to insert an item in a sorted list
	 * 
	 * @param sl
	 * @param i
	 */
	public void insertInSortedList(SinglyList<Itemtype> sl, Itemtype i) {
		SinglyNode<Itemtype> curr = sl.getHead();
		while (curr.next != null && curr.next.value.compareTo(i) < 0) {
			curr = curr.next;
		}
		SinglyNode<Itemtype> newnode = new SinglyNode<Itemtype>(i);
		newnode.next = curr.next;
		curr.next = newnode;
		sl.increaseLength(1);
	}

	/**
	 * Method to reverse list from mth position to nth position
	 * For example:
	 * Given 1->2->3->4->5->NULL, m = 2 and n = 4,
	 * return 1->4->3->2->5->NULL.
	 * @param sl
	 * @param i
	 * @param j
	 * @throws Exception
	 */
	public void reverseListFromMtoN(SinglyList<Itemtype> sl, int i, int j) throws Exception {
		if (sl.isEmpty()) {
			throw new Exception("List is empty cannot reverse the list");
		} else if (i < 1 || j > sl.getLength()) {
			throw new Exception("Value of i or j out of range");
		} else {
			SinglyNode<Itemtype> curr0 = sl.getHead();
			int tempCount = 1;
			while (tempCount < i - 1) {
				curr0 = curr0.next;
				tempCount++;
			}
			SinglyNode<Itemtype> curr1 = curr0;

			while (tempCount <= j) {
				curr1 = curr1.next;
				tempCount++;
			}
			SinglyNode<Itemtype> fig = curr0.next;
			SinglyNode<Itemtype> pos1 = fig.next;
			SinglyNode<Itemtype> pos2 = pos1.next;
			fig.next = curr1;
			tempCount = i;
			while (tempCount < j) {
				pos1.next = fig;
				fig = pos1;
				pos1 = pos2;
				if (pos2 != null) {
					pos2 = pos2.next;
				}
				tempCount++;
			}
			curr0.next = fig;
		}
	}

	/**
	 * Remove nth node from the end of the list
	 * eg.Given linked list: 1->2->3->4->5, and n = 2.
	 * After removing the second node from the end, the linked list becomes 1->2->3->5.
	 * @param sl
	 * @param i
	 */
	public void removeNthFromEnd(SinglyList<Itemtype> sl, int i) {
		SinglyNode<Itemtype> curr1 = sl.getHead();
		int length = 1;
		while (length <= i) {
			length++;
			curr1 = curr1.next;
		}
		SinglyNode<Itemtype> curr2 = sl.getHead();
		
		if (curr1==null) {
			//condition for the head
			sl.setHead(curr2.next);
			curr2.next = null;
		} else {
			while (curr1.next != null) {
				curr1 = curr1.next;
				curr2 = curr2.next;
			}
			SinglyNode<Itemtype> nodetodelete = curr2.next;
			if (nodetodelete != null) {
				curr2.next = nodetodelete.next;
			} else {
				curr2.next = nodetodelete;
			}
			nodetodelete.next = null;

		}
		sl.decreaseLength(1);
	}

	/**
	 * Method to find the intersection node from given two link list
	 * @param sl
	 * @param sl1
	 * @return
	 * @throws Exception
	 */
	public SinglyNode<Itemtype> findInterSectionNode(SinglyList<Itemtype> sl, SinglyList<Itemtype> sl1) throws Exception{
		SinglyNode<Itemtype> curr1 = sl.getHead();
		SinglyNode<Itemtype> curr2 = sl1.getHead();
		int len1 = sl.getLength();
		int len2 = sl1.getLength();
		int count = 1;
		if(len1<len2){
			while(count<=len1){
				curr1 = curr1.next;
				curr2 = curr2.next;
				count++;
			}
			while(curr2!=null){
				if(curr2==curr1){
					return curr1;
				}
				curr2 = curr2.next;
			}
			throw new Exception("Doesnot interect");
		}
		else{
			while(count<=len2){
				curr1 = curr1.next;
				curr2 = curr2.next;
				count++;
			}
			while(curr1!=null){
				if(curr1==curr2){
					return curr2;
				}
				curr1 = curr1.next;
			}
			throw new Exception("Doesnot interect");
		}
	}

	/**
	 * Method to delete the node given the reference to only that node such that the given 
	 * Supposed the linked list is 1 -> 2 -> 3 -> 4 and you are given the third node with value 3, 
	 * the linked list should become 1 -> 2 -> 4 after calling your function.
	 * node is not a tail node
	 * @param nodeToDelete
	 */
	public void deleteNodeWithPointerToOnlyThatNode(SinglyNode<Itemtype> nodeToDelete) {
		SinglyNode<Itemtype> slowNode = nodeToDelete;
		nodeToDelete.value = nodeToDelete.next.value;
		nodeToDelete = nodeToDelete.next;
		while(nodeToDelete.next!=null){
			nodeToDelete.value = nodeToDelete.next.value;
			nodeToDelete = nodeToDelete.next;	
			slowNode = slowNode.next;
		}
		slowNode.next = null;
		nodeToDelete.next = null;
	}

	/**
	 * Method to delete an elements by value of the elements.
	 * eg.Given: 1 --> 2 --> 6 --> 3 --> 4 --> 5 --> 6, val = 6
	 * Return: 1 --> 2 --> 3 --> 4 --> 5
	 * @param sl
	 * @param string
	 */
	public void removeElementByValue(SinglyList<Itemtype> sl, Itemtype val) {
		SinglyNode<Itemtype> slow = sl.getHead();
		SinglyNode<Itemtype> curr = slow.next;
		while(curr!=null){
			if(curr.value == val){
				sl.decreaseLength(1);
				slow.next = curr.next;
			}
			else{
				slow = curr;
			}
			curr = curr.next;
		}
	}

	/**
	 * Method to remove duplicates from a sorted list
	 * eg.Given 1->1->2, return 1->2.
	 * Given 1->1->2->3->3, return 1->2->3.
	 * @param sl
	 */
	public void removeDuplicatesFromSortedList(SinglyList<Itemtype> sl) {
		SinglyNode<Itemtype> curr1 = sl.getHead();
		SinglyNode<Itemtype> curr2 = sl.getHead().next;
		while(curr2!=null){
			if(curr1.value==curr2.value){
				curr1.next = curr2.next;
				sl.decreaseLength(1);
			}
			else{
				curr1 = curr2;
			}
			curr2 = curr2.next;
		}
	}

	/**
	 * Method to find the middle of a singly link list
	 * @param sl
	 * @return
	 */
	public SinglyNode<Itemtype> findMiddleOfList(SinglyList<Itemtype> sl) {
		SinglyNode<Itemtype> slow = sl.getHead();
		if(slow.next==null){
			return slow;
		}
		SinglyNode<Itemtype> fast = slow.next.next;
		while(fast!=null && fast.next!=null){
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow;
	}

	/**
	 * Method to check if the list contains even number of elements or not
	 * @param sl
	 * @return
	 */
	public boolean isListEven(SinglyList<Itemtype> sl) {
		SinglyNode<Itemtype> slow = sl.getHead();
		if(slow.next==null){
			return false;
		}
		SinglyNode<Itemtype> fast = slow.next.next;
		while(fast!=null && fast.next!=null){
			slow = slow.next;
			fast = fast.next.next;
		}
		if(fast==null){
			return true;
		}
		return false;
	}

	
	/**
	 * Method to display the list from the end.
	 * This implementation uses stack to store the elements and then pops the stack and displays
	 * the elements
	 * @param sl
	 * @return
	 * @throws Exception 
	 */
	public String displayListFromEnd(SinglyList<Itemtype> sl) throws Exception {
		GenericStack<SinglyNode<Itemtype>> stack = new GenericStack<SinglyNode<Itemtype>>();
		SinglyNode<Itemtype> curr = sl.getHead();
		while(curr!=null){
			stack.push(curr);
			curr = curr.next;
		}
		String str = "";
		while(!stack.isEmpty()){
			str+=stack.pop().value+"->";
		}
		str+="/";
		return str;
	}

	/**
	 * Method to merge two sorted list to a single list using extra memory
	 * @param sl1
	 * @param sl2
	 * @return
	 */
	public SinglyNode<Itemtype> getMergedListUsingExtraMemory(SinglyList<Itemtype> sl1, SinglyList<Itemtype> sl2) {
		SinglyList<Itemtype> mergedList = new SinglyList<Itemtype>();
		SinglyNode<Itemtype> curr1 = sl1.getHead();
		SinglyNode<Itemtype> curr2 = sl2.getHead();
		while(curr1!=null && curr2!=null){
			if(curr1.value.compareTo(curr2.value)<0){
				mergedList.addInTail(curr1.value);
				curr1 = curr1.next;
			}
			else{
				mergedList.addInTail(curr2.value);
				curr2 = curr2.next;
			}
		}
		if(curr1==null && curr2!=null){
			while(curr2!=null){
				mergedList.addInTail(curr2.value);
				curr2 = curr2.next;
			}
		}
		else{
			while(curr1!=null){
				mergedList.addInTail(curr1.value);
				curr1 = curr1.next;
			}
		}
		return mergedList.getHead();
	}

	/**
	 * Method to reverse the linklist in pairs
	 * @param sl
	 */
	public void reverseLinkListInPairs(SinglyList<Itemtype> sl) {
		SinglyNode<Itemtype> curr1 = sl.getHead();
		SinglyNode<Itemtype> curr2 = curr1.next;
		sl.setHead(curr2);
		
		SinglyNode<Itemtype> pos1 = null;
		SinglyNode<Itemtype> pos2 = null;
		
		while(curr1.next!=null && curr2.next!=null){
			pos1 = curr1;
			
			pos2 = curr2.next;
			curr2.next = curr1;
			
			
			curr1 = pos2;
			curr2 = curr1.next;
			
			pos1.next = curr2;
			
		}
	/*	System.out.println(curr1.value);
	//	System.out.println(curr2.value);
		System.out.println(pos1.value);
	//	System.out.println(curr2.value);
	*/	pos1.next = curr1;
		curr1.next = null;
		
	}

	/**
	 * Method to test if the list is palindrome or not.
	 * This method uses stack so the space complexity is large.
	 * @param sl
	 * @return
	 */
	public boolean isPalindrome(SinglyList<Itemtype> sl) {
		GenericStack<Itemtype> stack = new GenericStack<Itemtype>();
		SinglyNode<Itemtype> slow = sl.getHead();
		if(slow.next==null){
			return false;
		}
		SinglyNode<Itemtype> fast = slow.next.next;
		while(fast!=null){
			stack.push(slow.value);
			slow = slow.next;
			if(fast.next!=null){
				fast = fast.next.next;	
			}
			else{
				fast = fast.next;	
			}
		}
		slow = slow.next;
		while(slow!=null && !stack.isEmpty()){
			if(slow.value.compareTo(stack.pop())!=0){
				return false;
			}
			slow = slow.next;
		}
		
		if(slow==null && !stack.isEmpty()){
			return false;
		}
		else if(slow!=null && stack.isEmpty()){
			return false;
		}
		else{
			return true;
		}
	}

	public void rotateListByKElements(SinglyList<Itemtype> sl, int i) {
		int count = 0;
		SinglyNode<Itemtype> fast = sl.getHead();
		SinglyNode<Itemtype> slow = sl.getHead();
		while(count<i){
			fast = fast.next;
			count++;
		}
		while(fast!=null && fast.next!=null){
			fast = fast.next;
			slow = slow.next;
		}
		if(fast!=null){
			fast.next = sl.getHead();	
		}
		else{
			if(slow.next!=null){
				slow.next.next = slow;	
			}
		}
		sl.setHead(slow.next);
		slow.next = null;
	}

	/**
	 * Method to add numbers in two list and return the result.
	 * @param sl1
	 * @param sl2
	 * @return
	 */
	public SinglyNode<Integer> addTwoNumbersInAList(SinglyList<Integer> sl1, SinglyList<Integer> sl2) {
		SinglyList<Integer> result = new SinglyList<Integer>();
		SinglyNode<Integer> curr1 = sl1.getHead();
		SinglyNode<Integer> curr2 = sl2.getHead();
		int carry = 0;
		while(curr1!=null && curr2!=null){
			Integer res = (curr1.value + curr2.value)+carry;
			if(res>=10){
				carry = 1;
				res = res%10;
			}
			else{
				carry = 0;
			}
			result.addInTail(res);
			res = 0;
			curr1 = curr1.next;
			curr2 = curr2.next;
		}
		if(carry!=0){
			result.addInTail(carry);
		}
		return result.getHead();
	}

	/**
	 * Method to seperate the list into two partitions with k smallest list from i to the left
	 * @param sl1
	 * @param i
	 */
	public void partitionFromKSmallestElement(SinglyList<Integer> sl1, int i) {
		SinglyNode<Integer> curr = sl1.getHead();
		SinglyNode<Integer> large = null;
		SinglyNode<Integer> small = null;
		SinglyNode<Integer> largestart = null;
		SinglyNode<Integer> smallstart = null;
		while(curr!=null){
			if(curr.value>i){
				if(large==null){
					large = curr;
					largestart = curr;
				}
				else{
					large.next = curr;	
				}
				large = curr;
				
			}
			else{
				if(small == null){
					small = curr;
					smallstart = curr;
				}
				else{
					small.next = curr;
				}
				small = curr;
			}
			curr = curr.next;
		}
		sl1.setHead(smallstart);
		small.next = largestart;
		large.next = null;
	}

	/**
	 * Method to split a circular list.
	 * @param sl
	 * @return
	 */
	public SinglyList<SinglyNode<Itemtype>> splitCircularList(CircularList<Itemtype> sl) {
		SinglyNode<Itemtype> curr = sl.getHead().next;
		SinglyNode<Itemtype> cl1 = sl.getHead();
		SinglyNode<Itemtype> slow = sl.getHead();
		while(curr!=sl.getHead() && curr.next!=sl.getHead()){
			if(curr.next.next==sl.getHead()){
				curr = curr.next;
			}
			else{
				curr = curr.next.next;	
				slow = slow.next;
			}
		}
		cl1 = slow.next;
		slow.next = sl.getHead();
		curr.next = cl1;
		
		SinglyList<SinglyNode<Itemtype>> newlist = new SinglyList<SinglyNode<Itemtype>>();
		newlist.addInHead(cl1);
		newlist.addInHead(sl.getHead());
		return newlist;
	}

}
