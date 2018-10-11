import java.util.Scanner;
/**
 * Class for binary search tree.
 *
 * @param      <Key>    The key
 * @param      <Value>  The value
 */
class BST<Key extends Comparable<Key>, Value> {
	/**
	 * Class for node.
	 */
	private class Node {
		/**
		 * Key variable.
		 */
		Key key;
		/**
		 * Value variable.
		 */
		Value value;
		/**
		 * Left node address.
		 */
		Node left;
		/**
		 * Right node address.
		 */
		Node right;
		/**
		 * Constructs the object.
		 *
		 * @param      key    The key
		 * @param      value  The value
		 */
		Node(Key key, Value value) {
			this.key = key;
			this.value = value;
		}
	}
	/**
	 * Root node class variable.
	 */
	private Node root;
	/**
	 * Puts a value in the tree.
	 *
	 * @param      key    The key
	 * @param      value  The value
	 */
	public void put(Key key, Value value) {
		root = put(root, key, value);
	}
	/**
	 * Puts a value in the tree.
	 *
	 * @param      root   The root
	 * @param      key    The key
	 * @param      value  The value
	 *
	 * @return     Root node.
	 */
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
	/**
	 * Get the value of a key in the tree.
	 *
	 * @param      key   The key
	 *
	 * @return     Value.
	 */
	public Value get(Key key) {
		return get(root, key);
	}

	/**
	 * Gets the value of a key in the tree.
	 *
	 * @param      root  The root
	 * @param      key   The key
	 *
	 * @return     Value.
	 */
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
				break;
			case "get":
				String out = bst.get(key);
				System.out.println(out);
				break;
			default:
				break;
			}
		}
	}
}
