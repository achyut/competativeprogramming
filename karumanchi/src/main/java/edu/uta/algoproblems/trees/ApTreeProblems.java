package edu.uta.algoproblems.trees;

import java.util.List;
import java.util.Random;

import com.sui.datastructures.GenericStack;
import com.sui.datastructures.Queue;
import com.sui.datastructures.SinglyList;
import com.sui.datastructures.nodes.SinglyNode;
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
	 * Method to create a half tree having 7 Nodes
	 * @return
	 */
	public TreeNode<Integer> createHalfTree(){
		TreeNode<Integer> root = new TreeNode<Integer>(1);
		
		TreeNode<Integer> node2 = new TreeNode<Integer>(2);
		TreeNode<Integer> node3 = new TreeNode<Integer>(3);
		
		root.setLeft(node2);
		root.setRight(node3);
		
		TreeNode<Integer> node4 = new TreeNode<Integer>(4);
		TreeNode<Integer> node5 = new TreeNode<Integer>(5);
		node2.setLeft(node4);
		node2.setRight(node5);
		
		return root;
	}
	
	/**
	 * Method to create a half tree having 7 Nodes
	 * @return
	 */
	public TreeNode<Integer> createIncompleteTree(){
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
		node3.setRight(node6);
		
		TreeNode<Integer> node7 = new TreeNode<Integer>(7);
		TreeNode<Integer> node8 = new TreeNode<Integer>(8);
		node4.setLeft(node7);
		node4.setRight(node8);
		
		TreeNode<Integer> node9 = new TreeNode<Integer>(9);
		TreeNode<Integer> node10 = new TreeNode<Integer>(10);
		node5.setLeft(node9);
		node5.setRight(node10);
		
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
		
		TreeNode<Integer> node4 = new TreeNode<Integer>(rand.nextInt(10));
		TreeNode<Integer> node5 = new TreeNode<Integer>(rand.nextInt(10));
		node2.setLeft(node4);
		node2.setRight(node5);
		
		TreeNode<Integer> node6 = new TreeNode<Integer>(rand.nextInt(10));
		TreeNode<Integer> node7 = new TreeNode<Integer>(rand.nextInt(10));
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

	/**
	 * Method to find the number of nodes in a binary tree using recursion
	 * @param root
	 * @return
	 */
	public int findSizeOfBinaryTree(TreeNode<Integer> root) {
		if(root==null){
			return 0;
		}
		else{
			int val = findSizeOfBinaryTree(root.getLeft());
			int val1 = findSizeOfBinaryTree(root.getRight());
			int total = val + val1 + 1;
			return total;
		}
	}

	/**
	 * find the number of nodes in a tree using stacks
	 * @param root
	 * @return
	 */
	public int findSizeOfBinaryTreeIterative(TreeNode<Integer> root) {
		if(root==null){
			return 0;
		}
		GenericStack<TreeNode<Integer>> stack = new GenericStack<TreeNode<Integer>>();
		stack.push(root);
		int count = 0;
		while(!stack.isEmpty()){
			count++;
			TreeNode<Integer> val = stack.pop();
			if(val.getLeft()!=null){
				stack.push(val.getLeft());
			}
			if(val.getRight()!=null){
				stack.push(val.getRight());
			}
		}
		return count;
	}

	/**
	 * Insert a node into the tree using recursion
	 * @param root
	 * @param newnode
	 */
	public void insertIntoTree(TreeNode<Integer> root, TreeNode<Integer> newnode) {
		if(root.getLeft()==null){
			root.setLeft(newnode);
			return;
		}
		insertIntoTree(root.getLeft(), newnode);
	}

	/**
	 * Insert a node into a tree without using recursion
	 * @param root
	 * @param newnode
	 */
	public void insertIntoTreeWithoutRecursion(TreeNode<Integer> root, TreeNode<Integer> newnode) {
		if(root==null){
			root = newnode;
		}
		TreeNode<Integer> curr = root;
		while(curr.getLeft()!=null){
			curr = curr.getLeft();
		}
		curr.setLeft(newnode);
	}

	/**
	 * Method to print level order of a tree in reverse order
	 * @param root
	 * @return
	 * @throws Exception
	 */
	public String printLevelOrderInReverse(TreeNode<Integer> root) throws Exception {
		String res = "";
		if(root==null){
			return res;
		}
		GenericStack<TreeNode<Integer>> stack = new GenericStack<TreeNode<Integer>>();
		Queue<TreeNode<Integer>> queue = new Queue<TreeNode<Integer>>();
		queue.enQueue(root);
		while(!queue.isEmpty()){
			TreeNode<Integer> val = queue.deQueue();
			stack.push(val);
			if(val.getRight()!=null){
				queue.enQueue(val.getRight());	
			}
			if(val.getLeft()!=null){
				queue.enQueue(val.getLeft());	
			}
			
		}
		while(!stack.isEmpty()){
			res+=stack.pop().value+",";
		}
		return res;
	}

	/**
	 * Find the depth of a tree recursively
	 * @param root
	 * @return
	 */
	public int findDepthOfTreeRecursive(TreeNode<Integer> root) {
		if(root==null){
			return 0;
		}
		int dep1 = findDepthOfTreeRecursive(root.getLeft());
		int dep2 = findDepthOfTreeRecursive(root.getRight());
		if(dep1>dep2){
			return dep1+1;
		}
		else{
			return dep2+1;
		}
	}

	/**
	 * Method to find the depth of the tree using stack
	 * @param root
	 * @return
	 */
	public int findDepthOfTreeWithStack(TreeNode<Integer> root) {
		if(root==null){
			return 0;
		}
		int depth = 0;
		GenericStack<TreeNode<Integer>> stack = new GenericStack<TreeNode<Integer>>();
		stack.push(root);
		while(!stack.isEmpty()){
			TreeNode<Integer> val = stack.pop();
			if(val.getLeft()!=null && val.getRight()!=null){
				depth--;
			}
			if(val.getLeft()!=null){
				depth++;
				stack.push(val.getLeft());
			}
			if(val.getRight()!=null){
				depth++;
				stack.push(val.getRight());
			}
		}
		return depth;
	}

	/**
	 * Method to find the minimum depth of a binary tree using recursion
	 * @param root
	 * @return
	 */
	public int findMinimumDepthOfTree(TreeNode<Integer> root) {
		if(root==null){
			return 0;
		}
		else{
			int dep1 = 0;
			int dep2 = 0;
			if(root.getLeft()!=null && root.getRight()==null){
				dep1 = findMinimumDepthOfTree(root.getLeft());
				return dep1+1;
			}
			else if(root.getRight()!=null){
				dep2 = findMinimumDepthOfTree(root.getRight());	
				return dep2+1;
			}
			else{
				if(dep1<dep2){
					return dep1+1;
				}
				else{
					return dep2+1;
				}	
			}
			
		}
	}

	/**
	 * Method to find the minimum depth of a tree using iteration
	 * @param root
	 * @return
	 * @throws Exception 
	 */
	public int findMinimumDepthOfTreeIterative(TreeNode<Integer> root) throws Exception {
		if(root==null){
			return 0;
		}
		int depth = 1;
		Queue<TreeNode<Integer>> queue = new Queue<TreeNode<Integer>>();
		queue.enQueue(root);
		queue.enQueue(null);
		while(!queue.isEmpty()){
			TreeNode<Integer> val = queue.deQueue();
			while(val!=null){
				if(val.getLeft()==null && val.getRight()==null){
					return depth;
				}
				if(val.getLeft()!=null){
					queue.enQueue(val.getLeft());
				}
				if(val.getRight()!=null){
					queue.enQueue(val.getRight());
				}
				val = queue.deQueue();
			}
			if(!queue.isEmpty()){
				depth++;
				queue.enQueue(null);
			}	
		}
		return depth;
	}

	/**
	 * Method to delete a node by the value of the node
	 * @param root
	 * @param value
	 * @throws Exception 
	 */
	public boolean deleteANodeByValue(TreeNode<Integer> root, int value) throws Exception {
		if(root==null){
			throw new Exception("Tree is empty cannot delete a node");
		}
		if(root.value==value){
			root = null;
			return true;
		}
		boolean deleted = false;
		GenericStack<TreeNode<Integer>> stack = new GenericStack<TreeNode<Integer>>();
		stack.push(root);
		while(!stack.isEmpty()){
			TreeNode<Integer> curr = stack.pop();
			if(curr.getLeft()!=null){
				if(curr.getLeft().value==value){
					curr.setLeft(null);
					deleted = true;
				}
				else{
					stack.push(curr.getLeft());
				}
			}
			
			if(curr.getRight()!=null){
				if(curr.getRight().value==value){
					curr.setRight(null);
					deleted = true;
				}
				else{
					stack.push(curr.getRight());
				}
			}
		}
		return deleted;
	}

	/**
	 * Method to find the deepest node in a tree
	 * @param root
	 * @return
	 * @throws Exception
	 */
	public TreeNode<Integer> findDeepestNodeOfTree(TreeNode<Integer> root) throws Exception {
		if(root==null){
			throw new Exception("Tree is empty!!!");
		}
		Queue<TreeNode<Integer>> queue = new Queue<TreeNode<Integer>>();
		queue.enQueue(root);
		TreeNode<Integer> val = root;
		while(!queue.isEmpty()){
			val = queue.deQueue();
			if(val.getLeft()!=null){
				queue.enQueue(val.getLeft());
			}
			if(val.getRight()!=null){
				queue.enQueue(val.getRight());
			}		
		}
		return val;
	}

	/**
	 * Method to find the number of full nodes in a tree. The full node has both left and right child
	 * @param root
	 * @return
	 * @throws Exception
	 */
	public int findNumberOfFullNode(TreeNode<Integer> root) throws Exception {
		if(root==null){
			throw new Exception("Tree is empty!!!");
		}
		int count = 0;
		Queue<TreeNode<Integer>> queue = new Queue<TreeNode<Integer>>();
		queue.enQueue(root);
		while(!queue.isEmpty()){
			TreeNode<Integer> val = queue.deQueue();
			if(val.getLeft()!=null && val.getRight()!=null){
				count++;
			}
			if(val.getLeft()!=null){
				queue.enQueue(val.getLeft());
			}
			if(val.getRight()!=null){
				queue.enQueue(val.getRight());
			}		
		}
		return count;
	}
	
	/**
	 * Method to find the number of leaf nodes in a binary tree
	 * @param root
	 * @return
	 * @throws Exception
	 */
	public int findNumberOfLeaveNode(TreeNode<Integer> root) throws Exception {
		if(root==null){
			throw new Exception("Tree is empty!!!");
		}
		int count = 0;
		Queue<TreeNode<Integer>> queue = new Queue<TreeNode<Integer>>();
		queue.enQueue(root);
		while(!queue.isEmpty()){
			TreeNode<Integer> val = queue.deQueue();
			//check if it is a leaf node
			if(val.getLeft()==null && val.getRight()==null){
				count++;
			}
			
			if(val.getLeft()!=null){
				queue.enQueue(val.getLeft());
			}
			if(val.getRight()!=null){
				queue.enQueue(val.getRight());
			}		
		}
		return count;
	}
	
	/**
	 * Method to find the number of half nodes in a binary tree
	 * @param root
	 * @return
	 * @throws Exception
	 */
	public int findNumberOfHalfNode(TreeNode<Integer> root) throws Exception {
		if(root==null){
			throw new Exception("Tree is empty!!!");
		}
		int count = 0;
		Queue<TreeNode<Integer>> queue = new Queue<TreeNode<Integer>>();
		queue.enQueue(root);
		while(!queue.isEmpty()){
			TreeNode<Integer> val = queue.deQueue();
			//check if left exist and right doesnot exist
			if(val.getLeft()!=null && val.getRight()==null){
				count++;
			}
			//check left doesnot exist and right exists
			if(val.getLeft()==null && val.getRight()!=null){
				count++;
			}
			if(val.getLeft()!=null){
				queue.enQueue(val.getLeft());
			}
			if(val.getRight()!=null){
				queue.enQueue(val.getRight());
			}		
		}
		return count;
	}

	/**
	 * Method to find if two trees are structurally similar
	 * @param root
	 * @param root1
	 * @return
	 * @throws Exception
	 */
	public boolean checkIfStructurallySimilar(TreeNode<Integer> root, TreeNode<Integer> root1) throws Exception {
		if(root==null && root1==null){
			return true;
		}
		if(root==null && root1!=null || root!=null && root1==null){
			return false;
		}
		Queue<TreeNode<Integer>> queue = new Queue<TreeNode<Integer>>();
		queue.enQueue(root);
		queue.enQueue(root1);
		while(!queue.isEmpty()){
			TreeNode<Integer> val = queue.deQueue();
			TreeNode<Integer> val1 = queue.deQueue();
			if(val.getLeft()!=null && val1.getLeft()==null || val.getLeft()==null && val1.getLeft()!=null){
				return false;
			}
			if(val.getRight()!=null && val1.getRight()==null || val.getRight()==null && val1.getRight()!=null){
				return false;
			}
			if(val.getLeft()!=null){
				queue.enQueue(val.getLeft());
			}
			if(val.getRight()!=null){
				queue.enQueue(val.getRight());
			}
			if(val1.getLeft()!=null){
				queue.enQueue(val1.getLeft());
			}
			if(val1.getRight()!=null){
				queue.enQueue(val1.getRight());
			}
		}
		return true;
	}

	/**
	 * Method to find which level has the maximum sum
	 * @param root
	 * @return
	 * @throws Exception
	 */
	public int findTheLevelHavingMaxSum(TreeNode<Integer> root) throws Exception {
		if(root==null){
			throw new Exception("Tree is empty!!!");
		}
		int maxSum = 0;
		int maxLevel = 0;
		int currlevel = 0;
		int sum = 0;
		Queue<TreeNode<Integer>> queue = new Queue<TreeNode<Integer>>();
		queue.enQueue(root);
		int i=0;
		while(!queue.isEmpty()){
			i = queue.getSize();
			while(i>0){
				TreeNode<Integer> val = queue.deQueue();
				sum+=val.value;
				if(val.getLeft()!=null){
					queue.enQueue(val.getLeft());
				}
				if(val.getRight()!=null){
					queue.enQueue(val.getRight());
				}	
				i--;
			}
			currlevel++;
			if(sum>maxSum){
				maxSum = sum;
				maxLevel = currlevel;
			}
			sum = 0;
		}
		return maxLevel;
	}

	/**
	 * Method to print all the paths from the root to the leaf of the tree recursively
	 * @param root
	 * @param res
	 * @param paths
	 * @throws Exception
	 */
	public void printAllPathOfTreeRecursion(TreeNode<Integer> root,String res,List<String> paths) throws Exception {
		if(root==null){
			return;
		}
		res += root.value+",";
		if(root.getLeft()!=null){
			printAllPathOfTreeRecursion(root.getLeft(),res,paths);	
		}
		if(root.getRight()!=null){
			printAllPathOfTreeRecursion(root.getRight(),res,paths);	
		}
		if(root.getLeft()==null && root.getRight()==null){
			paths.add(res);
		}
	}
	
	/**
	 * Method to find all the paths from root to leaf of the tree iteratively
	 * @param root
	 */
	public void findAllPathIterative(TreeNode<Integer> root){
		//TODO: remains to implement
	}
	
	/**
	 * Method to find the sum of all the nodes of the tree recursively
	 * @param root
	 * @return
	 */
	public int findSumOfAllElementsWithRecursion(TreeNode<Integer> root) {
		if(root==null){
			return 0;
		}
		else{
			int leftsum = findSumOfAllElementsWithRecursion(root.getLeft());
			int rightsum = findSumOfAllElementsWithRecursion(root.getRight());
			return leftsum + rightsum + root.value;
		}
	}

	/**
	 * Method to find sum of all the nodes of the tree iteratively
	 * @param root
	 * @return
	 * @throws Exception
	 */
	public int findSumOfAllElementsWithoutRecursion(TreeNode<Integer> root) throws Exception {
		if(root==null){
			throw new Exception("Tree is empty!!!");
		}
		int sum = 0;
		Queue<TreeNode<Integer>> queue = new Queue<TreeNode<Integer>>();
		queue.enQueue(root);
		while(!queue.isEmpty()){
			TreeNode<Integer> val = queue.deQueue();
			//check if left exist and right doesnot exist
			sum+=val.value;
			
			if(val.getLeft()!=null){
				queue.enQueue(val.getLeft());
			}
			if(val.getRight()!=null){
				queue.enQueue(val.getRight());
			}		
		}
		return sum;
	}

	/**
	 * Method to check if the path with given sum exist or not using recursion
	 * @param root
	 * @param input
	 * @param pathSum
	 * @return
	 */
	public boolean checkIfPathExistWithSum(TreeNode<Integer> root, int input,int pathSum) {
		int sum = pathSum+root.value;
		if(root.getLeft()==null && root.getRight()==null){
			if(sum == input){
				return true;
			}
			return false;
		}
		else{
			boolean result = checkIfPathExistWithSum(root.getLeft(), input,sum);
			if(result==true){
				return true;
			}
			result = checkIfPathExistWithSum(root.getRight(), input,sum);
			if(result==true){
				return true;
			}
			return false;
		}
	}

	/**
	 * Method to recursively convert tree to its mirror
	 * @param root
	 */
	public void convertTreeToItsMirror(TreeNode<Integer> root) {
		if(root==null){
			return;
		}
		else{
			convertTreeToItsMirror(root.getLeft());
			convertTreeToItsMirror(root.getRight());
			TreeNode<Integer> temp = root.getLeft();
			root.setLeft(root.getRight());
			root.setRight(temp);
		}
	}

	/**
	 * Method to check if two trees are mirror to each other
	 * @param root
	 * @param root1
	 * @return
	 */
	public boolean checkIfTreesAreMirror(TreeNode<Integer> root, TreeNode<Integer> root1) {
		if(root==null && root1==null){
			return true;
		}
		else{
			if((root==null && root1!=null) || (root!=null && root1==null)){
				return false;
			}
			else{
					
					boolean result = checkIfTreesAreMirror(root.getLeft(), root1.getRight());
					if(result == false){
						return false;
					}
					if(root.value == root1.value){
						return true;
					}
					result = checkIfTreesAreMirror(root.getRight(), root1.getLeft());
					if(result == false){
						return false;
					}
					if(root.value == root1.value){
						return true;
					}
					return false;
				}	
			}
		}
	
}
