package edu.uta.algoproblems.trees;

import java.util.Random;

import com.sui.datastructures.GenericStack;
import com.sui.datastructures.Queue;
import com.sui.datastructures.Stack;
import com.sui.datastructures.nodes.TreeNode;

public class ApTreeProblems{

	/**
	 * Method to create a complete tree having 7 Nodes
	 * @return
	 */
	public TreeNode<Integer> createCompleteTree(){
		TreeNode<Integer> root = new TreeNode<Integer>(1);
		
		TreeNode<Integer> node2 = new TreeNode<Integer>(2);
		TreeNode<Integer> node3 = new TreeNode<Integer>(3);
		
		root.setLeft(node2);
		root.setRight(node3);
		
		TreeNode<Integer> node4 = new TreeNode<Integer>(4);
		TreeNode<Integer> node5 = new TreeNode<Integer>(5);
		node2.setLeft(node4);
		node2.setRight(node5);
		
		TreeNode<Integer> node6 = new TreeNode<Integer>(6);
		TreeNode<Integer> node7 = new TreeNode<Integer>(7);
		node3.setLeft(node6);
		node3.setRight(node7);
		
		return root;
	}
	
	/**
	 * Method to create a random tree having 7 Nodes
	 * @return
	 */
	public TreeNode<Integer> createRandomTree(){
		Random rand = new Random();
		TreeNode<Integer> root = new TreeNode<Integer>(rand.nextInt(100));
		
		TreeNode<Integer> node2 = new TreeNode<Integer>(rand.nextInt(100));
		TreeNode<Integer> node3 = new TreeNode<Integer>(rand.nextInt(100));
		
		root.setLeft(node2);
		root.setRight(node3);
		
		TreeNode<Integer> node4 = new TreeNode<Integer>(rand.nextInt(100));
		TreeNode<Integer> node5 = new TreeNode<Integer>(rand.nextInt(100));
		node2.setLeft(node4);
		node2.setRight(node5);
		
		TreeNode<Integer> node6 = new TreeNode<Integer>(rand.nextInt(100));
		TreeNode<Integer> node7 = new TreeNode<Integer>(rand.nextInt(100));
		node3.setLeft(node6);
		node3.setRight(node7);
		
		return root;
	}
	
	/**
	 * Method to create a complete tree having 15 nodes
	 * @return
	 */
	public TreeNode<Integer> createLargeTree(){
		TreeNode<Integer> root = new TreeNode<Integer>(1);
		
		TreeNode<Integer> node2 = new TreeNode<Integer>(2);
		TreeNode<Integer> node3 = new TreeNode<Integer>(3);
		
		root.setLeft(node2);
		root.setRight(node3);
		
		TreeNode<Integer> node4 = new TreeNode<Integer>(4);
		TreeNode<Integer> node5 = new TreeNode<Integer>(5);
		node2.setLeft(node4);
		node2.setRight(node5);
		
		TreeNode<Integer> node6 = new TreeNode<Integer>(6);
		TreeNode<Integer> node7 = new TreeNode<Integer>(7);
		node3.setLeft(node6);
		node3.setRight(node7);
		
		TreeNode<Integer> node8 = new TreeNode<Integer>(8);
		TreeNode<Integer> node9 = new TreeNode<Integer>(9);
		node4.setLeft(node8);
		node4.setRight(node9);
		
		TreeNode<Integer> node10 = new TreeNode<Integer>(10);
		TreeNode<Integer> node11 = new TreeNode<Integer>(11);
		node5.setLeft(node10);
		node5.setRight(node11);
		
		
		TreeNode<Integer> node12 = new TreeNode<Integer>(12);
		TreeNode<Integer> node13 = new TreeNode<Integer>(13);
		node6.setLeft(node12);
		node6.setRight(node13);
		
		
		TreeNode<Integer> node14 = new TreeNode<Integer>(14);
		TreeNode<Integer> node15 = new TreeNode<Integer>(15);
		node7.setLeft(node14);
		node7.setRight(node15);
		
		return root;
	}

	/**
	 * Method for recursive preorder traversal
	 * @param root
	 * @return
	 */
	public String preOrder(TreeNode<Integer> root) {
		String res = "";
		if(root==null){
			return res;
		}
		res+=root.value+",";
		res+=preOrder(root.getLeft());
		res+=preOrder(root.getRight());
		return res;
	}

	/**
	 * Method for doing recursive inorder traversal
	 * @param root
	 * @return
	 */
	public String inOrder(TreeNode<Integer> root) {
		String res = "";
		if(root==null){
			return res;
		}
		res+=inOrder(root.getLeft());
		res+=root.value+",";
		res+=inOrder(root.getRight());
		return res;
	}

	/**
	 * Method to do post order traversal of a tree using recursion
	 * @param root
	 * @return
	 */
	public String postOrder(TreeNode<Integer> root) {
		String res = "";
		if(root==null){
			return res;
		}
		res+=postOrder(root.getLeft());
		res+=postOrder(root.getRight());
		res+=root.value+",";
		return res;
	}

	/**
	 * Method for iterative traversal of tree in preorder
	 * @param root
	 * @return
	 */
	public String preOrderIterative(TreeNode<Integer> root) {
		GenericStack<TreeNode<Integer>> stack = new GenericStack<TreeNode<Integer>>();
		String res = "";
		if(root==null){
			return res;
		}
		stack.push(root);
		while(!stack.isEmpty()){
			TreeNode<Integer> node = stack.pop();
			res+=node.value+",";
			if(node.getRight()!=null){
				stack.push(node.getRight());
			}
			if(node.getLeft()!=null){
				stack.push(node.getLeft());
			}
		}
		return res;
	}

	/**
	 * Iterative traversal of inorder
	 * @param root
	 * @return
	 */
	public String inOrderIterative(TreeNode<Integer> root) {
		GenericStack<TreeNode<Integer>> stack = new GenericStack<TreeNode<Integer>>();
		String res = "";
		if(root==null){
			return res;
		}
		boolean done = false;
		TreeNode<Integer> curr = root;
		while(!done){
			while(curr!=null){
				stack.push(curr);
				curr = curr.getLeft();
			}
			if(stack.isEmpty()){
				done = true;
			}
			else{
				TreeNode<Integer> val = stack.pop();
				res+=val.value+",";
				curr = val.getRight();
			}
		}
		return res;
	}

	/**
	 * Method for post order traversal of tree using the stacks
	 * this method is not a compact method and has some redundant code
	 * in the next implementation we have refactored the code
	 * @param root
	 * @return
	 */
	public String postOrderIterative(TreeNode<Integer> root) {
		GenericStack<TreeNode<Integer>> stack = new GenericStack<TreeNode<Integer>>();
		String res = "";
		if(root==null){
			return res;
		}
		stack.push(root);
		TreeNode<Integer> prev = null;
		TreeNode<Integer> curr = null;
		while(!stack.isEmpty()){
			curr = stack.peek();
			if(prev==null || prev.getLeft()==curr || prev.getRight()==curr){
				if(curr.getLeft()!=null){
					stack.push(curr.getLeft());
				}
				else if(curr.getRight()!=null){
					stack.push(curr.getRight());
				}
				else{
					res+=curr.value+",";
					stack.pop();	
				}
			}
			else if(curr.getLeft()==prev){
				if(curr.getRight()!=null){
					stack.push(curr.getRight());
				}
				else{
					res+=curr.value+",";
					stack.pop();
				}
			}
			else if(curr.getRight()==prev){
				res+=curr.value+",";
				stack.pop();
			}
			prev = curr;
			
		}
		return res;
	}
	
	/**
	 * Post order traversal of stack.
	 * This implementation has a compact code removing the redundant code from the 
	 * previous implementation
	 * @param root
	 * @return
	 */
	public String postOrderIterative1(TreeNode<Integer> root) {
		GenericStack<TreeNode<Integer>> stack = new GenericStack<TreeNode<Integer>>();
		String res = "";
		if(root==null){
			return res;
		}
		stack.push(root);
		TreeNode<Integer> prev = null;
		TreeNode<Integer> curr = null;
		while(!stack.isEmpty()){
			curr = stack.peek();
			if(prev==null || prev.getLeft()==curr || prev.getRight()==curr){
				if(curr.getLeft()!=null){
					stack.push(curr.getLeft());
				}
				else if(curr.getRight()!=null){
					stack.push(curr.getRight());
				}
			}
			else if(curr.getLeft()==prev && curr.getRight()!=null){
				stack.push(curr.getRight());
			}
			else{
				res+=curr.value+",";
				stack.pop();
			}
			prev = curr;
			
		}
		return res;
	}

	/**
	 * This is the implementation of post order traversal using two stacks
	 * @param root2
	 * @return
	 */
	public String postOrderIterative2(TreeNode<Integer> root) {
		String res = "";
		if(root==null){
			return res;
		}
		else{
			GenericStack<TreeNode<Integer>> stack1 = new GenericStack<TreeNode<Integer>>();
			GenericStack<TreeNode<Integer>> stack2 = new GenericStack<TreeNode<Integer>>();
			stack1.push(root);
			while(!stack1.isEmpty()){
				TreeNode<Integer> val = stack1.pop();
				stack2.push(val);
				if(val.getLeft()!=null){
					stack1.push(val.getLeft());
				}
				if(val.getRight()!=null){
					stack1.push(val.getRight());
				}
			}
			while(!stack2.isEmpty()){
				res+=stack2.pop().value+",";
			}
			return res;
		}
	}

	/**
	 * Method to do level order traversal
	 * @param root
	 * @return
	 * @throws Exception
	 */
	public String levelOrder(TreeNode<Integer> root) throws Exception {
		String res = "";
		if(root==null){
			return res;
		}
		Queue<TreeNode<Integer>> queue = new Queue<TreeNode<Integer>>();
		queue.enQueue(root);
		while(!queue.isEmpty()){
			TreeNode<Integer> curr = queue.deQueue();
			if(curr.getLeft()!=null){
				queue.enQueue(curr.getLeft());
			}
			if(curr.getRight()!=null){
				queue.enQueue(curr.getRight());
			}
			res+=curr.value+",";
		}
		return res;
	}
	
	/**
	 * Method for recursively finding the maximum value in a binary tree
	 * @param root
	 * @return
	 */
	public int findMaximumInBTree(TreeNode<Integer> root) {
		if(root.getLeft()==null && root.getRight()==null){
			return root.value;
		}
		else{
			int max = root.value;
			int max1 = findMaximumInBTree(root.getLeft());
			int max2 = findMaximumInBTree(root.getRight());
			if(max1>max2){
				if(max1>max){
					max = max1;
				}
			}
			if(max2>max1){
				if(max2>max){
					max = max2;
				}
			}
			return max;
		}
	}

	/**
	 * Method to find maximum value in a b tree using iterative approach.
	 * @param root
	 * @return
	 * @throws Exception 
	 */
	public int findMaximumInBTreeIterative(TreeNode<Integer> root) throws Exception {
		if(root==null){
			throw new Exception("Empty tree found!");
		}
		GenericStack<TreeNode<Integer>> stack = new GenericStack<TreeNode<Integer>>();
		int max = root.value;
		stack.push(root);
		while(!stack.isEmpty()){
			TreeNode<Integer> val = stack.pop();
			if(val.getRight()!=null){
				stack.push(val.getRight());
			}
			if(val.getLeft()!=null){
				stack.push(val.getLeft());
			}
			if(val.value>max){
				max = val.value;
			}
		}
		return max;
	}

	/**
	 * Method to search an element in a binary without using recursion
	 * @param root
	 * @param testvalue
	 * @return
	 * @throws Exception
	 */
	public boolean searchElementWithoutRecursionInBTree(TreeNode<Integer> root, int testvalue) throws Exception{
		if(root==null){
			throw new Exception("Empty tree!");
		}
		GenericStack<TreeNode<Integer>> stack = new GenericStack<TreeNode<Integer>>();
		stack.push(root);
		while(!stack.isEmpty()){
			TreeNode<Integer> curr = stack.pop();
			if(curr.value==testvalue){
				return true;
			}
			if(curr.getRight()!=null){
				stack.push(curr.getRight());
			}
			if(curr.getLeft()!=null){
				stack.push(curr.getLeft());
			}
		}
		return false;
	}

	/**
	 * Method to search an element in a binary tree using recursion
	 * @param root
	 * @param testvalue
	 * @return
	 * @throws Exception 
	 */
	public boolean searchElementUsingRecursion(TreeNode<Integer> root, int testvalue) throws Exception {
		if(root==null){
			return false;
		}
		else{
			if(root.value==testvalue){
				return true;
			}
			boolean val = searchElementUsingRecursion(root.getLeft(),testvalue);
			if(val==true){
				return true;
			}
			val = searchElementUsingRecursion(root.getRight(),testvalue);
			if(val==true){
				return true;
			}
			return false;
		}
	}
	
	
}
