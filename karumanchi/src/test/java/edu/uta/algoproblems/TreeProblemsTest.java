package edu.uta.algoproblems;

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
	
	public void testDeleteATree(){
		
	}
	
	public void testPrintLevelOrderInReverse(){
		
	}
	
	public void testFindDepthOfTheBinaryTree(){
		
	}
	public void testFindDepthUsingStack(){
		
	}
	public void testFindDepthWithoutRecursion(){
		
	}
	public void testFindMinimumDepthOfBinaryTree(){
		
	}
	public void testFindDeepestNodeOfBinaryTree(){
		
	}
	public void testDeleteANodeByValueOfATree(){
		
	}
	public void testFindNumberOfFullNodesInABinaryTreeWithoutRecursion(){
		
	}
	public void testFindNumberOfHalfNodesWithoutRecursion(){
		
	}
	public void testIfTwoTreesAreStructurallyIdentical(){
		
	}
	public void testFindDiameterOfABinaryTree(){
		
	}
	public void testFindTheLevelHavingMaximumSum(){
		
	}
	public void testPrintAllRootToLeafPaths(){
		
	}
	public void testIfPathExistsWithGivenSumFromRoot(){
		
	}
	public void testSumOfAllElementsWithrecursion(){
		
	}
	public void testSumOfAllElementsWithoutRecursion(){
		
	}
	public void testConvertATreeToItsMirror(){
		
	}
	public void testIfTheTreeAreMirrorToEachOther(){
		
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
}
