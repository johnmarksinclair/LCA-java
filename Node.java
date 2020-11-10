import java.util.ArrayList;

public class Node {

	private char key;
	private ArrayList<Node> parents;
	private int distanceFromRoot;

	Node(char key) {
		this.key = key;
		this.parents = new ArrayList<Node>();
		initDistanceFromRoot();
	}

	public void addParent(Node parent) {
		this.parents.add(parent);
		initDistanceFromRoot();
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
	
	public void initDistanceFromRoot() {
		if (this.parents.size() == 0) {
			this.distanceFromRoot = 0;
		} else {
			int tempDistance = Integer.MAX_VALUE;
			for (int i = 0; i < parents.size(); i++) {
				if (this.parents.get(i).getDistanceFromRoot() < tempDistance) {
					tempDistance = this.parents.get(i).getDistanceFromRoot();
				}
			}
			this.distanceFromRoot = tempDistance + 1;
		}
	}
	
	public int getDistanceFromRoot() {
		initDistanceFromRoot();
		return this.distanceFromRoot;
	}
}
