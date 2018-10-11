import java.util.Scanner;

class BST<Key extends Comparable<Key>, Value> {
	private class Node {
		Key key;
		Value value;
		Node left;
		Node right;

		Node(Key key, Value value) {
			this.key = key;
			this.value = value;
		}
	}

	private Node root;

	public void put(Key key, Value value) {
		root = put(root, key, value);
	}

	private Node put(Node root, Key key, Value value) {
		if (root == null) {
			return new Node(key, value);
		}
		int comp = key.compareTo(root.key);
		if (comp < 0) {
			root.left = put(root.left, key, value);
		} else if (comp > 0) {
			root.right = put(root.right, key, value);
		} else {
			root.value = value;
		}
		return root;
	}

	public Value get(Key key) {
		return get(root, key);
	}

	public Value get(Node root, Key key) {
		if (root == null) {
			return null;
		}
		int comp = key.compareTo(root.key);
		if (comp < 0) {
			return get(root.left, key);
		} else if (comp > 0) {
			return get(root.right, key);
		} else {
			return root.value;
		}
	}
}

/**
 * Class for Solution.
 */
public final class Solution {
	/**
	 * Constructs the object.
	 */
	private Solution() {
		// unused
	}
	/**
	 * Main function.
	 *
	 * @param      args  The arguments
	 */
	public static void main(final String[] args) {
		Scanner scan = new Scanner(System.in);
		BST<String, String> bst = new BST<String, String>();
		while (scan.hasNext()) {
			String[] inputs = scan.nextLine().split(",");
			String key = inputs[1] + inputs[2] + inputs[3];
			switch (inputs[0]) {
			case "put":
				bst.put(key, inputs[4]);
			case "get":
				System.out.println(bst.get(key));
			}
		}
	}
}
