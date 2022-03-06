package bst;
/**
 * 
 * @author mounika
 *
 *node class that defines BST node
 */
public class Node<K extends Comparable<K>> {
	K key;
	Node<K> left;
	Node<K>right;
	/**
	 * creating constructor for the node class
	 * @param data - taking input as data
	 */
	public Node(K data) {
		
		key = data;
		left=right=null;
	}
	
}

