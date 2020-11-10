import java.util.ArrayList;

public class Node {

	private char key;
	private ArrayList<Node> parents;

	Node(char key) {
		this.key = key;
		this.parents = new ArrayList<Node>();
	}

	public void addParent(Node parent) {
		this.parents.add(parent);
	}

	public char getKey() {
		return this.key;
	}

	public ArrayList<Node> getParents() {
		return this.parents;
	}

	public ArrayList<Character> getParentsKeys() {
		ArrayList<Character> parentsKeys = new ArrayList<Character>();
		for (int i = 0; i < parents.size(); i++) {
			parentsKeys.add(parents.get(i).getKey());
		}
		return parentsKeys;
	}
	
	public boolean hasParent() {
		if (parents.size() > 0) {
			return true;
		} else {
			return false;
		}
	}
}
