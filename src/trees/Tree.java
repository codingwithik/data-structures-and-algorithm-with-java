package trees;

public class Tree {

	private TreeNode root;
	
	public void insert(int value) {
		if(root == null) {
			root = new TreeNode(value);
		}else {
			root.insert(value);
		}
	}
	
	public boolean contains(int value) {
		return root.contains(value);
	}
	/**
	 * Traversal
	 * 1. Level - visit nodes on each level
	 * 2. Pre-Order - visit the root of every subtree first
	 * 3. Post-Order - visit the root of every subtree last
	 * 4. In-Order - vist the left child, then root, then right
	 * child
	 */
	public void traverseInorder() {
		if(root != null) {
			root.traverseInorder();
		}
	}
	
	public TreeNode get(int value) {
		if(root != null) {
			return root.get(value);
		}
		
		return null;
	}
	
	public int min() {
		if(root == null) {
			return Integer.MIN_VALUE;
		}else {
			return root.min();
		}
	}
	
	public int max() {
		if(root == null) {
			return Integer.MAX_VALUE;
		}else {
			return root.max();
		}
	}
	
	/**
	 * Delete
	 * 1. The Node is a leaf
	 * 2. The Node has one Child
	 * 3. The Node has two Children
	 */
	public void delete(int value) {
		root = delete(root, value);
	}
	
	private TreeNode delete(TreeNode subtreeRoot, int value) {
		if(subtreeRoot == null) {
			return null;
		}
		
		if(value < subtreeRoot.getData()) {
			
			subtreeRoot.setLeftChild(delete(subtreeRoot.getLeftChild(), value));
			
		}else if(value > subtreeRoot.getData()) {
			
			subtreeRoot.setRightChild(delete(subtreeRoot.getRightChild(), value));
			
		}else {
			// Case 1 and 2: node to delete has 0 or 1 child
			if(subtreeRoot.getLeftChild() == null) {
				return subtreeRoot.getRightChild();
			}else if(subtreeRoot.getRightChild() == null) {
				return subtreeRoot.getLeftChild();
			}
			
			// Case 3: node to delete has 2 children
			
			// Replace the value in the subtree node with the smallest value
			// from the right subtree
			subtreeRoot.setData(subtreeRoot.getRightChild().min());
			
			// Delete the node that has the smallest value in the right subtree
			subtreeRoot.setRightChild(delete(subtreeRoot.getRightChild(), subtreeRoot.getData()));
		}
		
		return subtreeRoot;
	}
}
