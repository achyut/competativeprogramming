package edu.uta.algoproblems.linklist;

import com.sui.datastructures.SinglyList;
import com.sui.datastructures.nodes.SinglyNode;

public class SinglyLinklistProblems<Itemtype> {

	/**
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

	public SinglyNode<Itemtype> findBeginOfLoop(SinglyList<String> sl) {
		
		return null;
	}
	
	

}
