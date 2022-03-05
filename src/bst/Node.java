package bst;
/**
 * 
 * @author mounika
 *
 *node class that defines BST node
 */
public class Node {
	int key;
	Node left;
	Node right;
	/**
	 * creating constructor for the node class
	 * @param data - taking input as data
	 */
	public Node(int data) {
		
		key = data;
		left=right=null;
	}
	
}
