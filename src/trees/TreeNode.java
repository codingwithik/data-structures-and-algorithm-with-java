package trees;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class TreeNode {
	
	private int data;
	private TreeNode leftChild;
	private TreeNode rightChild;
	
	public TreeNode(int data) {
		this.data = data;
	}
	
	
	public void insert(int value) {
		if(value == data) {
			return;
		}
		
		if(value < data) {
			if(leftChild == null) {
				leftChild = new TreeNode(value);
			}else {
				leftChild.insert(value);
			}
		}else {
			if(rightChild == null) {
				rightChild = new TreeNode(value);
			}else {
				rightChild.insert(value);
			}
		}
	}
	
	public boolean contains(int value) {
		if(value == data) {
			return true;
		}
		
		boolean contains = false;
		if(value < data) {
			if(leftChild != null) {
				contains = leftChild.contains(value);
			}
		}else {
			if(rightChild != null) {
				contains = rightChild.contains(value);
			}
		}
		
		return contains;
	}
	
	public void traverseInorder() {
		if(leftChild != null) {
			leftChild.traverseInorder();
		}
		System.out.print(data +", ");
		if(rightChild != null) {
			rightChild.traverseInorder();
		}
	}
	
	//  BFS
	public void levelOrder(TreeNode node){
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		queue.add(node);
		
		while(!queue.isEmpty()) {
			
			TreeNode tempNode = queue.poll();
			System.out.print(tempNode.data +", ");
			
			if(tempNode.leftChild != null) {
				queue.add(tempNode.leftChild);
			}
			
			if(tempNode.rightChild != null) {
				queue.add(tempNode.rightChild);
			}
		}
		
	}
	
	
	public TreeNode get(int value) {
		if(value == data) {
			return this;
		}
		
		if(value < data) {
			if(leftChild != null) {
				return leftChild.get(value);
			}
		}else {
			
			if(rightChild != null) {
				return rightChild.get(value);
			}
		}
		
		return null;
	}
	
	public int min() {
		if(leftChild == null) {
			return data;
		}else {
			return leftChild.min();
		}
	}
	
	public int max() {
		if(rightChild == null) {
			return data;
		}else {
			return rightChild.max();
		}
	}
	
	public int maxDepth(TreeNode root) {
		if(root == null) return 0;
		
		int leftHeight = maxDepth(root.leftChild);
		int rightHeight = maxDepth(root.rightChild);
		
		return 1 + Math.max(leftHeight, rightHeight);
	}
	
	public int bsHeight(TreeNode root) {
		if(root == null) return 0;
		
		int leftHeight = maxDepth(root.leftChild);
		if(leftHeight == -1) return -1;
		
		int rightHeight = maxDepth(root.rightChild);
		if(rightHeight == -1) return -1;
		
		if(Math.abs(leftHeight - rightHeight) > 1) return -1;
		return 1 + Math.max(leftHeight, rightHeight);
	}
	
	public boolean isBalance(TreeNode root) {
		return bsHeight(root) != -1;
	}
	
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public TreeNode getLeftChild() {
		return leftChild;
	}
	public void setLeftChild(TreeNode leftChild) {
		this.leftChild = leftChild;
	}
	public TreeNode getRightChild() {
		return rightChild;
	}
	public void setRightChild(TreeNode rightChild) {
		this.rightChild = rightChild;
	}
	
}
