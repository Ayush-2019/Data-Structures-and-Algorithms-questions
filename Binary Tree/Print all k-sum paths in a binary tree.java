class Solution {

	static void printPath(Vector<Integer> v, int i)
	{
		for (int j = i; j < v.size(); j++)
			System.out.print(v.get(j) + " ");
		System.out.println();
	}

	static Vector<Integer> path = new Vector<Integer>();

	static void solve(Node root, int k)
	{
		if (root == null)
			return;

		path.add(root.data);

		printKPathUtil(root.left, k);

		printKPathUtil(root.right, k);

		int f = 0;
		for (int j = path.size() - 1; j >= 0; j--) {
			f += path.get(j);

			if (f == k)
				printPath(path, j);
		}

		path.remove(path.size() - 1);
	}

	static void printKPath(Node root, int k)
	{
		path = new Vector<Integer>();
		solve(root, k);
	}
	
}

