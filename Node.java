import java.util.ArrayList;

public class Node {

	private char key;
	private ArrayList<Node> children;
	
	Node(char key) {
		this.key = key;
		this.children = new ArrayList<Node>();
	}

	Node(char key, ArrayList<Node> kids) {
		this.key = key;
		this.children = kids;
	}
	
	public char getKey() {
		return this.key;
	}
	
	public ArrayList<Node> getChildren() {
		return this.children;
	}
}
