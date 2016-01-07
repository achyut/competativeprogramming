package edu.uta.algoproblems.linklist;

import com.sui.datastructures.SinglyList;
import com.sui.datastructures.nodes.SinglyNode;

public class SinglyLinklistProblems<Itemtype> {

	/**
	 * @author achyut
	 * O(n)+O(n) solution
	 * In this solution we first traverse to the end of the list to get the length of the list
	 * and after that we find the location of the node by comparison and return the node
	 * @param sl
	 * @param i
	 * @return
	 * @throws Exception 
	 */
	public Itemtype findNthFromEnd(SinglyList<Itemtype> sl, int i) throws Exception {
		if(sl.getHead()==null && sl.getTail()==null){
			throw new Exception("Empty list.");
		}
		else{
			int length = 1;
			SinglyNode<Itemtype> curr = sl.getHead();
			do{
				length++;
				curr = curr.next;
			}
			while(curr!=sl.getTail());
			
			
			int templength = 1;
			curr = sl.getHead();
			while((length-templength)>=i)
			{
				templength++;
				curr = curr.next;
			}
			return curr.value;	
		}
		
	}

	/**
	 * Method to find the nth element from the end of the list
	 * This algorithm finds the element in O(n) time complexity and O(1) space complexity
	 * In this method two pointers are used one is slow pointer and another is fast pointer
	 * the fast pointer is moved for n distance first and only slow pointer is started from there
	 * @author achyut
	 * @param sl
	 * @param i
	 * @return
	 * @throws Exception
	 */
	public Itemtype findNthFromEndFast(SinglyList<Itemtype> sl, int i) throws Exception {
		if(sl.getHead()==null && sl.getTail()==null){
			throw new Exception("Empty list.");
		}
		else{
			int length = 1;
			SinglyNode<Itemtype> slow = sl.getHead();
			SinglyNode<Itemtype> fast = sl.getHead();
			
			while(length<i){
				length++;
				fast = fast.next;
			}
			
			while(fast!=sl.getTail()){
				slow=slow.next;
				fast=fast.next;
			}	
			return slow.value;	
		}
	}

	/**
	 * Floyds method to find if there exists a loop in the linked list.
	 * @author achyut
	 * @param sl
	 * @return
	 */
	public boolean ifLoopExists(SinglyList<Itemtype> sl) {
		SinglyNode<Itemtype> curr1 = sl.getHead();
		SinglyNode<Itemtype> curr2 = sl.getHead().next;
		while(true){
			if(curr2==null){
				return false;
			}
			if(curr1==curr2){
				return true;
			}
			curr1=curr1.next;
			if(curr2.next!=null){
				curr2=curr2.next.next;	
			}
			else{
				curr2 = curr2.next;
			}
		}
		
	}

	/**
	 * Method to find the begin of the loop node in a link list using floyds method
	 * @author achyut
	 * @param sl
	 * @return
	 * @throws Exception
	 */
	public SinglyNode<Itemtype> findBeginOfLoop(SinglyList<Itemtype> sl) throws Exception {
		if(sl.getHead()==null && sl.getTail()==null){
			throw new Exception("Empty list.");
		}
		SinglyNode<Itemtype> curr1 = sl.getHead();
		SinglyNode<Itemtype> curr2 = sl.getHead().next.next;
		while(true){
			if(curr2==null){
				throw new Exception("Loop not found in the linklist");
			}
			if(curr2==curr1){
				break;
			}
			curr1 = curr1.next;
			curr2=curr2.next.next;
		}
		curr1 = sl.getHead();
		while(curr2!=curr1){
			curr1=curr1.next;
			curr2 = curr2.next.next;
		}
		return curr1;
	}

	/**
	 * Method to remove the loop from a link list using floyds method
	 * @author achyut
	 * @param sl
	 * @throws Exception
	 */
	public void removeLoopFromList(SinglyList<Itemtype> sl) throws Exception {
		if(sl.getHead()==null && sl.getTail()==null){
			throw new Exception("Empty list.");
		}
		SinglyNode<Itemtype> curr1 = sl.getHead();
		SinglyNode<Itemtype> curr2 = sl.getHead().next.next;
		while(true){
			if(curr2==null){
				return;
			}
			if(curr1==curr2){
				break;
			}
			curr1 = curr1.next;
			curr2 = curr2.next.next;
		}
		SinglyNode<Itemtype> curr3 = curr1.next;
		curr1 = sl.getHead();
		
		while(curr2!=curr1){
			curr2 = curr2.next.next;
			curr1 = curr1.next;
			curr3 = curr3.next;
		}
		//System.out.println(curr3.value);
		curr3.next = null;
	}
	
	

}
