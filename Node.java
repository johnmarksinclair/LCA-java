import java.util.ArrayList;

public class Node {

	private char key;
	private ArrayList<Node> parents;

	Node(char key, ArrayList<Node> passedParents) {
		this.key = key;
		this.parents = new ArrayList<Node>(passedParents);
	}

	public void getParentKeys() {
		System.out.print("Node " + this.key + "'s parents: ");
		for (int i = 0; i < parents.size(); i++) {
			System.out.print(this.parents.get(i).key + ", ");
		}
		System.out.println();
	}
	
	public ArrayList<Node> getParents() {
		return this.parents;
	}
	
	public char getKey() {
		return this.key;
	}
}
