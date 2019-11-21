class Node
{
	int key;
	Node left,right;
	
	public Node(int data)
	{
		key=data;
		left=right=null;;
	}
}
public class checkBST {
	static Node root;
	checkBST()
	 {
		root=null; 
	 }
	 checkBST(int data)
	 {
		 Node root=new Node(data);
		 
	 }
	 public static void insert(int key)
	 {
		 root=insertion_BST(root,key);
	 }
	public static Node insertion_BST(Node root,int key)
	{
		
		if(root==null)
		{
			root=new Node(key);
			return root;
		}
		else if(root.key>key)
		{
			root.left=insertion_BST(root.left,key);
		}
		else if(root.key<key)
		{
			root.right=insertion_BST(root.right,key);
		}
		return root;
	}
	
	public static boolean checkBST(Node root, Node left, Node right){
        if (root==null)
            return true;
        if (left!=null && root.key<=left.key)
            return false;
        if (right!=null && root.key>=right.key)
            return false;
        
        return checkBST(root.left, left, root) && checkBST(root.right, root, right);
    }

	public static void main(String[] args) {
	
		checkBST tree=new checkBST();
		tree.root=new Node(50);
		tree.root.left=new Node(30);
		tree.root.right=new Node(60);
		tree.root.left.left=new Node(20);
		tree.root.left.right=new Node(35);
		tree.root.right.left=new Node(55);
		tree.root.right.right=new Node(80);
		if (checkBST(root,null,null))
			System.out.println("Is a BST");
		else
			System.out.println("Not a Bst");
			}
		
	}



