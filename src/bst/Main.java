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
		BST bst=new BST();
		
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
		bst.insert(3);
		bst.insert(11);
		bst.insert(22);
		bst.insert(16);
		bst.insert(40);
		bst.insert(60);
		bst.insert(65);
		bst.insert(63);
		bst.insert(67);
		bst.insert(95);









		/**
		 * 3.printing binary search tree inorder traversal
		 */
		System.out.println("The BST Created with input data Inorder Traversal(Left-root-right):"); 
		/**
		 * 4.inorder traversal of binary search tree
		 */
		bst.inorder();
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
		/**
		 * 9.size of the binary search tree 
		 */
		System.out.println();
		bst.getSize();
		/**
		 * 10. search a key (63) in the BST
		 * 
		 */
		
        boolean ret_val = bst.search(63);
        System.out.println("\nKey 63 found in BST:" + ret_val );
	}

}
