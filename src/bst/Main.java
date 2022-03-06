package bst;
/**
 * Main method for manipulating Binary search tree
 * @author mounika
 *@param args - Default Java param (Not used)
 */
public class Main {
	public static void main(String[] args) {
		/**
		 * PROCEDURE
		 * 1.Creating object for binary search tree
		 * 2.inserting data into BST
		 * 3.printing binary search tree inorder traversal
		 * 4.inorder traversal of binary search tree
		 * 5.printing binary search tree preorder traversal
		 * 6.preorder traversal of binary search tree
		 * 7.printing binary search tree preorder traversal
		 * 8.postorder traversal of binary search tree
		 * 9.to find size of the binary search tree to check all nodes are present
		 */
		/**
		 * 1.Creating object for binary search tree
		 */
		BST<Integer> bst=new BST<>();
		
		/**
		 BST tree example
              56
           /     \ 
           30    70

        	2.insert data into BST
		 */
		bst.insert(56);
		bst.insert(30);
		bst.insert(70);
	
		/**
		 * 3.printing binary search tree inorder traversal
		 */
		System.out.println("The BST Created with input data Inorder Traversal(Left-root-right):"); 
		/**
		 * 4.inorder traversal of binary search tree
		 */
		bst.inorder();
		System.out.println();

		System.out.println();
		/**
		 * 5.printing binary search tree preorder traversal
		 */
		System.out.println("The BST Created with input data Preorder Traversal(Root-Left-Right):"); 
		/**
		 * 6.preorder traversal of binary search tree
		 */
		bst.preorder();
		/**
		 * 7.printing binary search tree preorder traversal
		 */
		System.out.println();
		System.out.println("The BST Created with input data PostOrder Traversal(Root-Left-Right):"); 
		/**
		 * 8.postorder traversal of binary search tree
		 */
		bst.postorder();






	}

}
