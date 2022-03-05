package bst;

public class BST{

	/**
	 * insert - insert a node in BST and it calls insert_recursive method
	 * insert_Recursive -  used to call insert method recursively to insert a node into a particular position
	 * inOrder - method to call inOrder traversal of BST
	 * inorder_Recursive -recursively checking the inOrder traversal of tree 
	 * preOrder -  method to call pre-order traversal of BST 
	 * preOrder_Recursive - PreOrder Traversal (rootNode:Left:Right (nLR))
	 * postorder - method to call post-order traversal of BST 
	 *postOrder_Recursive -PostOrder Traversal (rootNode:Left:Right (nLR))
	 *  
	 * @param root - accepting root node of BST to manipulate it
	 * @param key - accepting data to put it into the BST
	 * @return root - it returns root of BST
	 */

	Node root;
	/**
	 * Constructor for BST =>initial empty tree
	 */

	BST()
	{
		root=null;
	}
	/**
	 *  insert a node in BST and it calls insert_recursive method
	 * @param key -input data for the node
	 */
	public void insert(int key) {

		root=insert_Recursive(root, key); 
	}
	/**
	 * This method is used to call insert method recursively to insert a node into a particular position
	 * @param root - root node which we need to insert other nodes
	 * @param key - input data for the node
	 * @return
	 */
	private Node insert_Recursive(Node root, int key) {
		//check if root node is null
		if(root==null) {
			root=new Node(key);
			return root;
		}
		//traverse the tree
		if(key < root.key) //insert in the left subtree
			root.left=insert_Recursive(root.left, key);

		else if(key > root.key)//insert in the right subtree
			root.right=insert_Recursive(root.right,key);
		// return pointer
		return root;
	}
	/**
	 * method for inorder traversal of BST 
	 */
	void inorder() { 
		inorder_Recursive(root); 
	}
	/**
	 * recursively checking the inorder traversal of tree
	 * InOrder Traversal - Left:rootNode:Right (LnR) 
	 * @param root - taking input of root node
	 */
	public void inorder_Recursive(Node root) {
		//check if root is not null
		if(root!=null) {
			//first traverse left subtree recursively
			inorder_Recursive(root.left);
			//then go for root node
			System.out.print(root.key +"  ");
			//next traverse right subtree recursively
			inorder_Recursive(root.right);
		}
	}
	/**
	 * method for pre-order traversal of BST 
	 */
	public void preorder() {
		preOrder_Recursive(root);  

	}
	/**
	 * PreOrder Traversal - rootNode:Left:Right (nLR)
	 * @param root - input parameter for bst
	 */
	void preOrder_Recursive(Node root)  { 
		if (root == null) 
			return; 

		//first print root node first
		System.out.print(root.key + " "); 
		// then traverse left subtree recursively
		preOrder_Recursive(root.left); 
		// next traverse right subtree recursively
		preOrder_Recursive(root.right); 
	}
	/**
	 * method to call post-order traversal of BST 
	 */
	public void postorder() {
		postOrder_Recursive(root);

	}
	/**
	 * PostOrder Traversal - rootNode:Left:Right (nLR)
	 * @param roto - input parameter for bst

	 */

	void postOrder_Recursive(Node root)
	{
		if (root == null) 
            return; 
		//traverse left subtree recursively
		postOrder_Recursive(root.left);
		//next traverse right subtree recursively
		postOrder_Recursive(root.right); 
		System.out.print(root.key+" ");
	}

}
