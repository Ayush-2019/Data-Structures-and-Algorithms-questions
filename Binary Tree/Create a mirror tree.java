class GFG{

public static Node mirrorTree(Node root)
{
	if (root == null)
		return null;

	Node left = mirrorTree(root.left);
	Node right = mirrorTree(root.right);

	root.left = right;
	root.right = left;

	return root;
}
}
