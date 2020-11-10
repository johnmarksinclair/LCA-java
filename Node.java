import java.util.ArrayList;

public class Node {

	private char key;
	private ArrayList<Node> parents;

	Node(char key) {
		this.key = key;
		this.parents = new ArrayList<Node>();
	}

//	Node(char key, ArrayList<Node> kids) {
//		this.key = key;
//		this.children = kids;
//	}

	public char getKey() {
		return this.key;
	}

	public ArrayList<Node> getParents() {
		return this.parents;
	}

	public ArrayList<Character> getParentsKeys() {
		ArrayList<Character> parentsKeys = new ArrayList<Character>();
		for (int i = 0; i < this.getParents().size(); i++) {
			parentsKeys.add(this.getParents().get(i).getKey());
		}
		return parentsKeys;
	}

	public void addParent(Node parent) {
		this.parents.add(parent);
	}
}
