package InterviewSamples;

import java.lang.Integer;

class BinaryTree
{
	static Node root;

	public BinaryTree()
	{
		root = null;
	}

	class Node{

			int data;
			Node leftChild;
			Node rightChild;

			public Node(int data)
			{
				this.data = data;
				this.leftChild = null;
				this.rightChild = null;
			}
	}

	public static void main(String[] args)
	{
		BinaryTree bt = new BinaryTree();

		bt.insertRec(root, 100);
		bt.insertRec(root, 10);
		bt.insertRec(root, 8);
		bt.insertRec(root, 11);
		bt.insertRec(root, 15);
		bt.insertRec(root, 9);
		bt.insertRec(root, 111);
		bt.insertRec(root, 12);

		bt.inorder(root);

		if (!bt.isBST(root)) System.out.println("Tree is not BST");

		System.out.println("Minimum value of tree " + bt.findMin(root));

		System.out.println("Maximum value of tree " + bt.findMax(root));

	}

	void insertNode(int data)
	{
		Node node = new Node(data);

		if (root == null)
		{
			root = node;

			return;
		}
		
		Node current = root;

		Node parent;

		while (true)
		{
			parent = current;

			if (data > current.data)
			{
				current = current.rightChild;

				if (current == null)
				{
					parent.rightChild = node;

					System.out.println("Inserting right node " + node);
					return;
				}
			}
			else
			{
				current = current.leftChild;

				if (current == null)
				{
					parent.leftChild = node;
					System.out.println("Inserting left node " + node);
					return;
				}
			}
		}
		
	}

	void insertRec(Node node, int data)
	{
		if (root == null)
		{
			this.root = new Node(data);
			System.out.println("Inserting root " + this.root.data);

			return;
		}

		System.out.println("Calling insert with " + data);
		if (data > node.data)
		{
			if (node.rightChild == null)
			{
				node.rightChild = new Node(data);

				System.out.println("Inserting right child " + data + " of parent " + node.data);

				return;
			}

			insertRec(node.rightChild, data);
		}
		else 
		{
			if (node.leftChild == null)
			{
				node.leftChild = new Node(data);

				System.out.println("Inserting left child " + data + " of parent " + node.data);

				return;
			}

			insertRec(node.leftChild, data);
		}
	}

	Node findNode(Node root, int data)
	{
		if (root.data == data)
			return root;
		else
		{
			if (data > root.data)
			{
				findNode(root.rightChild, data);
			}
			else
			{
				findNode(root.rightChild, data);
			}
		}

		return null;
	}

	Node findNode(int data)
	{
		Node current = root;

		if (current == null)
		{
			return null;
		}

		while (current.data != data)
		{
			if (data > current.data)
			{
				current = current.rightChild;
			}
			else
			{
				current = current.leftChild;
			}

			if (current == null)
			{
				break;
			}
		}

		return current;
	}

	void inorder(Node root)
	{
		if (root == null)
		{
			return;
		}

		inorder(root.leftChild);
		System.out.println(root.data);
		inorder(root.rightChild);
	}

	void postorder(Node root)
	{
		if (root == null)
		{
			return;
		}

		postorder(root.leftChild);
		postorder(root.rightChild);
		System.out.println(root.data);
	}

	void preorder(Node root)
	{
		if (root == null)
		{
			return;
		}
	
		System.out.println(root.data);
		preorder(root.rightChild);
		preorder(root.leftChild);
	}

	boolean isBST(Node root)
	{
		return checkisBST(root, Integer.MAX_VALUE, Integer.MIN_VALUE, "ROOT : ");
	}

	static int counter = 0;
	boolean checkisBST(Node node, int leftData, int rightData, String leftRight)
	{
		counter +=1 ;
		if (node == null)
		{
			System.out.println(leftRight + " done");
			return true;
		}

		System.out.println("Counter : " + counter + " " + leftRight + "Checking node " + node.data + " left data " + leftData + " right data " + rightData);

		if ((node.data > leftData) || (node.data <= rightData))
			return false;

		return (checkisBST(node.leftChild, node.data, rightData, "From left : ") && checkisBST(node.rightChild, leftData, node.data, "From right: "));
	}

	int findMin(Node root)
	{
		while(root.leftChild != null)
		{
			root = root.leftChild;
		}

		return root.data;
	}

	int findMax(Node root)
	{
		while(root.rightChild != null)
		{
			root = root.rightChild;
		}

		return root.data;
	}
}