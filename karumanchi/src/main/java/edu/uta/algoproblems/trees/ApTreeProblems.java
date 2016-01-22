package edu.uta.algoproblems.trees;

import com.sui.datastructures.nodes.TreeNode;

public class ApTreeProblems{

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
	
	
	
}
