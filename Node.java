import java.util.ArrayList;

public class Node {

	private char key;
	private Node left, right;
	
	Node(char key) {
		this.key = key;
		this.right = null;
		this.left = null;
	}

	Node(char key, Node left, Node right) {
		this.key = key;
		this.left = left;
		this.right = right;
	}
	
	public char getKey() {
		return this.key;
	}
	
	public Node getLeftChild() {
		return this.left;
	}
	
	public Node getRightChild() {
		return this.right;
	}
}
