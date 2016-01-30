package edu.uta.algoproblems;

import java.util.ArrayList;
import java.util.List;

import com.sui.datastructures.Utils.BTreePrinter;
import com.sui.datastructures.nodes.TreeNode;

import edu.uta.algoproblems.trees.ApTreeProblems;
import junit.framework.TestCase;

public class TreeProblemsTest extends TestCase{
	
	
	public void testPreOrderTraversal(){
		ApTreeProblems apt = new ApTreeProblems();
		TreeNode<Integer> root = apt.createCompleteTree();
		String preorder = apt.preOrder(root);
		assertEquals("1,2,4,5,3,6,7,",preorder);
	}
	
	public void testIterativePreOrderTraversal(){
		ApTreeProblems apt = new ApTreeProblems();
		TreeNode<Integer> root = apt.createCompleteTree();
		String preorder = apt.preOrderIterative(root);
		assertEquals("1,2,4,5,3,6,7,",preorder);
	}
	
	public void testInorderTraversal(){
		ApTreeProblems apt = new ApTreeProblems();
		TreeNode<Integer> root = apt.createCompleteTree();
		String inorder = apt.inOrder(root);
		assertEquals("4,2,5,1,6,3,7,",inorder);
	}
	
	public void testIterativeInorderTraversal(){
		ApTreeProblems apt = new ApTreeProblems();
		TreeNode<Integer> root = apt.createCompleteTree();
		String inorder = apt.inOrderIterative(root);
		assertEquals("4,2,5,1,6,3,7,",inorder);
	}
	
	public void testPostOrderTraversal(){
		ApTreeProblems apt = new ApTreeProblems();
		TreeNode<Integer> root = apt.createCompleteTree();
		String postorder = apt.postOrder(root);
		assertEquals("4,5,2,6,7,3,1,",postorder);
	}
	
	public void testIterativePostorderTraversal(){
		ApTreeProblems apt = new ApTreeProblems();
		TreeNode<Integer> root = apt.createCompleteTree();
		String postorder = apt.postOrderIterative(root);
		assertEquals("4,5,2,6,7,3,1,",postorder);
		
		TreeNode<Integer> root1 = apt.createCompleteTree();
		postorder = apt.postOrderIterative1(root1);
		assertEquals("4,5,2,6,7,3,1,",postorder);
		
		TreeNode<Integer> root2 = apt.createCompleteTree();
		postorder = apt.postOrderIterative2(root2);
		assertEquals("4,5,2,6,7,3,1,",postorder);
	}
	
	public void testLevelOrderTraversal() throws Exception{
		ApTreeProblems apt = new ApTreeProblems();
		TreeNode<Integer> root = apt.createCompleteTree();
		String levelorder = apt.levelOrder(root);
		assertEquals("1,2,3,4,5,6,7,",levelorder);
	}
	
	public void testFindMaximumElementInBinaryTree(){
		ApTreeProblems apt = new ApTreeProblems();
		TreeNode<Integer> root = apt.createCompleteTree();
		int max  = apt.findMaximumInBTree(root);
		assertEquals(7,max);
	}
	
	public void testFindMaximumElementInBinaryTreeWithoutRecursion() throws Exception{
		ApTreeProblems apt = new ApTreeProblems();
		TreeNode<Integer> root = apt.createCompleteTree();
		int max  = apt.findMaximumInBTreeIterative(root);
		assertEquals(7,max);
	}
	
	public void testSearchElementInBinaryTree() throws Exception{
		ApTreeProblems apt = new ApTreeProblems();
		TreeNode<Integer> root = apt.createCompleteTree();
		boolean result  = apt.searchElementUsingRecursion(root,2);
		assertTrue(result);
		result  = apt.searchElementUsingRecursion(root,10);
		assertFalse(result);
		root = null;
		try{
			result  = apt.searchElementUsingRecursion(root,14);	
		}
		catch(Exception e){}
	}
	
	public void testSearchElementWithoutRecursion() throws Exception{
		ApTreeProblems apt = new ApTreeProblems();
		TreeNode<Integer> root = apt.createCompleteTree();
		boolean result  = apt.searchElementWithoutRecursionInBTree(root,2);
		assertTrue(result);
		result  = apt.searchElementWithoutRecursionInBTree(root,10);
		assertFalse(result);
		
		root = null;
		
		try{
			result  = apt.searchElementWithoutRecursionInBTree(root,14);	
		}
		catch(Exception e){}
	}
	
	public void testInsertElementInBinaryTree(){
		ApTreeProblems apt = new ApTreeProblems();
		TreeNode<Integer> root = apt.createCompleteTree();
		TreeNode<Integer> newnode = new TreeNode<Integer>(10);
		apt.insertIntoTree(root,newnode);
		int size = apt.findSizeOfBinaryTree(root);
		assertEquals(8,size);
	}
	
	public void testInsertElementInBinarytreeWithoutRecursion(){
		ApTreeProblems apt = new ApTreeProblems();
		TreeNode<Integer> root = apt.createCompleteTree();
		TreeNode<Integer> newnode = new TreeNode<Integer>(10);
		apt.insertIntoTreeWithoutRecursion(root,newnode);
		int size = apt.findSizeOfBinaryTree(root);
		assertEquals(8,size);
	}
	
	public void testFindSizeOfBinaryTree(){
		ApTreeProblems apt = new ApTreeProblems();
		TreeNode<Integer> root = apt.createCompleteTree();
		int max  = apt.findSizeOfBinaryTree(root);
		assertEquals(7,max);
	}
	
	public void testFindSizeOfBinaryTreeWithoutRecursion(){
		ApTreeProblems apt = new ApTreeProblems();
		TreeNode<Integer> root = apt.createCompleteTree();
		int max  = apt.findSizeOfBinaryTreeIterative(root);
		assertEquals(7,max);
	}
	
	public void testPrintLevelOrderInReverse() throws Exception{
		ApTreeProblems apt = new ApTreeProblems();
		TreeNode<Integer> root = apt.createCompleteTree();
		String levelorder = apt.printLevelOrderInReverse(root);
		assertEquals("4,5,6,7,2,3,1,",levelorder);
	}
	
	public void testFindDepthOfTheBinaryTree(){
		ApTreeProblems apt = new ApTreeProblems();
		TreeNode<Integer> root = apt.createCompleteTree();
		int depth  = apt.findDepthOfTreeRecursive(root);
		assertEquals(3,depth);
	}
	
	public void testFindDepthUsingStack(){
		ApTreeProblems apt = new ApTreeProblems();
		TreeNode<Integer> root = apt.createCompleteTree();
		int depth  = apt.findDepthOfTreeWithStack(root);
		assertEquals(3,depth);
	}
	
	public void testFindMinimumDepthOfBinaryTree() throws Exception{
		ApTreeProblems apt = new ApTreeProblems();
		TreeNode<Integer> root = apt.createHalfTree();
		int depth  = apt.findMinimumDepthOfTreeIterative(root);
		assertEquals(2,depth);
		TreeNode<Integer> root1 = apt.createIncompleteTree();
		depth  = apt.findMinimumDepthOfTreeIterative(root1);
		assertEquals(3,depth);	
	}

	public void testFindMinimumDepthOfBinaryTreeRecursive(){
		ApTreeProblems apt = new ApTreeProblems();
		TreeNode<Integer> root = apt.createHalfTree();
		int depth  = apt.findMinimumDepthOfTree(root);
		assertEquals(2,depth);
		
		TreeNode<Integer> root1 = apt.createIncompleteTree();
		depth  = apt.findMinimumDepthOfTree(root1);
		assertEquals(3,depth);
	}
	
	public void testFindDeepestNodeOfBinaryTree() throws Exception{
		ApTreeProblems apt = new ApTreeProblems();
		TreeNode<Integer> root = apt.createHalfTree();
		TreeNode<Integer> deepest = apt.findDeepestNodeOfTree(root);
		assertEquals(5,(int)deepest.value);
		TreeNode<Integer> root1 = apt.createIncompleteTree();
		deepest  = apt.findDeepestNodeOfTree(root1);
		assertEquals(10,(int)deepest.value);
	}
	
	public void testDeleteANodeByValueOfATree() throws Exception{
		ApTreeProblems apt = new ApTreeProblems();
		TreeNode<Integer> root = apt.createCompleteTree();
		int size = apt.findSizeOfBinaryTree(root);
		apt.deleteANodeByValue(root,4);
		assertEquals(size-1,apt.findSizeOfBinaryTree(root));
	}
	
	public void testFindNumberOfFullNodesInABinaryTreeWithoutRecursion() throws Exception{
		ApTreeProblems apt = new ApTreeProblems();
		TreeNode<Integer> root = apt.createHalfTree();
		//BTreePrinter<Integer> printer = new BTreePrinter<Integer>();
		//printer.printTreeNode(root);
		int count  = apt.findNumberOfFullNode(root);
		assertEquals(2,count);
		
	}
	
	public void testFindNumberOfLeafNodesInABinaryTreeWithoutRecursion() throws Exception{
		ApTreeProblems apt = new ApTreeProblems();
		TreeNode<Integer> root = apt.createHalfTree();
		int count  = apt.findNumberOfLeaveNode(root);
		assertEquals(3,count);
		TreeNode<Integer> root1 = apt.createLargeTree();
		count  = apt.findNumberOfLeaveNode(root1);
		assertEquals(8,count);
	}
	
	public void testFindNumberOfHalfNodesWithoutRecursion() throws Exception{
		ApTreeProblems apt = new ApTreeProblems();
		TreeNode<Integer> root = apt.createIncompleteTree();
		int count  = apt.findNumberOfHalfNode(root);
		assertEquals(1,count);
	}
	
	
	public void testIfTwoTreesAreStructurallyIdentical() throws Exception{
		ApTreeProblems apt = new ApTreeProblems();
		TreeNode<Integer> root = apt.createRandomTree();
		TreeNode<Integer> root1 = apt.createRandomTree();
		boolean result  = apt.checkIfStructurallySimilar(root,root1);
		assertTrue(result);
		
		root1 = apt.createHalfTree();
		result  = apt.checkIfStructurallySimilar(root,root1);
		assertFalse(result);
		
	}
	
	
	public void testFindDiameterOfABinaryTree(){
		
	}
	
	public void testFindTheLevelHavingMaximumSum() throws Exception{
		ApTreeProblems apt = new ApTreeProblems();
		TreeNode<Integer> root = apt.createCompleteTree();
		//BTreePrinter<Integer> printer = new BTreePrinter<Integer>();
		//printer.printTreeNode(root);
		
		int level  = apt.findTheLevelHavingMaxSum(root);
		assertEquals(3,level);
		TreeNode<Integer> root1 = apt.createRandomTree();
		//printer.printTreeNode(root1);
		level  = apt.findTheLevelHavingMaxSum(root1);
	
	}
	public void testPrintAllRootToLeafPaths() throws Exception{
		ApTreeProblems apt = new ApTreeProblems();
		TreeNode<Integer> root = apt.createCompleteTree();
		//BTreePrinter<Integer> printer = new BTreePrinter<Integer>();
		//printer.printTreeNode(root);
		List<String> pth = new ArrayList<String>();
		apt.printAllPathOfTreeRecursion(root,"",pth);
		String paths[] = new String[pth.size()];
		for(int i=0;i<pth.size();i++){
			paths[i] = pth.get(i);
		}
		assertEquals("1,2,4,",paths[0]);
		assertEquals("1,2,5,",paths[1]);
		assertEquals("1,3,6,",paths[2]);
		assertEquals("1,3,7,",paths[3]);
		
	}
	
	public void testIfPathExistsWithGivenSumFromRoot(){
		ApTreeProblems apt = new ApTreeProblems();
		TreeNode<Integer> root = apt.createCompleteTree();
		/*
		BTreePrinter<Integer> printer = new BTreePrinter<Integer>();
		printer.printTreeNode(root);
		*/
		boolean result = apt.checkIfPathExistWithSum(root,7,0);
		assertTrue(result);
		result = apt.checkIfPathExistWithSum(root,9,0);
		assertFalse(result);
	}
	
	public void testSumOfAllElementsWithrecursion(){
		ApTreeProblems apt = new ApTreeProblems();
		TreeNode<Integer> root = apt.createCompleteTree();
		int sum  = apt.findSumOfAllElementsWithRecursion(root);
		assertEquals(28,sum);
	}
	
	public void testSumOfAllElementsWithoutRecursion() throws Exception{
		ApTreeProblems apt = new ApTreeProblems();
		TreeNode<Integer> root = apt.createCompleteTree();
		int sum  = apt.findSumOfAllElementsWithoutRecursion(root);
		assertEquals(28,sum);
	}
	
	public void testConvertATreeToItsMirror(){
		ApTreeProblems apt = new ApTreeProblems();
		TreeNode<Integer> root = apt.createHalfTree();
		TreeNode<Integer> root1 = apt.createHalfTree();
		apt.convertTreeToItsMirror(root);
		boolean result = apt.checkIfTreesAreMirror(root,root1);
		assertTrue(result);
	}
	
	public void testIfTheTreeAreMirrorToEachOther(){
		ApTreeProblems apt = new ApTreeProblems();
		TreeNode<Integer> root = apt.createHalfTree();
		TreeNode<Integer> root1 = apt.createHalfTree();
		apt.convertTreeToItsMirror(root1);
		boolean result = apt.checkIfTreesAreMirror(root,root1);
		assertTrue(result);
		result = apt.checkIfTreesAreMirror(root,root);
		assertFalse(result);
	}
	
	public void testCreateBinaryTreeFromItsInorderAndPreorderTraversal(){
		
	}
	
	public void testCreateBinaryTreeFromItsInorderAndPostOrderTraversal(){
		
	}
	
	public void testPrintAllAncestoralNodeOfaBinaryTreeNode(){
		
	}
	public void testFindLeastCommonAncestorOfTwoNodes(){
		
	}
	
	public void testZigZagTraversal(){
		
	}
	
	public void testFindVerticalSumOfBinaryTree(){
		
	}
	
	public void testFindPossibleBinaryTreeWithNnodes(){
		
	}
	
	public void testGenerateAllDifferentBSTwithNnodes(){
		
	}
	
	public void testIfTreeIsSymmetric(){
		// Given a binary tree, check whether it is a mirror of itself (ie, symmetric around its center).
		
	}
	
	public void findSumFromRootToLeaf(){
		//Given a binary tree containing digits from 0-9 only, each root-to-leaf path could represent a number.
		// An example is the root-to-leaf path 1->2->3 which represents the number 123.
		// Find the total sum of all root-to-leaf numbers.

	}
	
	public void testIfSameTree(){
		// Given two binary trees, write a function to check if they are equal or not.
		// Two binary trees are considered equal if they are structurally identical and 
		// the nodes have the same value.

	}
	
	
}
