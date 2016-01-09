package edu.uta.algoproblems.linklist;

import com.sui.datastructures.SinglyList;
import com.sui.datastructures.nodes.SinglyNode;

public class SinglyLinklistProblems<Itemtype extends Comparable<Itemtype>> {

	/**
	 * @author achyut O(n)+O(n) solution In this solution we first traverse to
	 *         the end of the list to get the length of the list and after that
	 *         we find the location of the node by comparison and return the
	 *         node
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

}
