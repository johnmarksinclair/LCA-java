import java.util.ArrayList;

public class Node {

	private char key;
	private ArrayList<Node> children;

	Node(char key) {
		this.key = key;
		this.children = new ArrayList<Node>();
	}

//	Node(char key, ArrayList<Node> kids) {
//		this.key = key;
//		this.children = kids;
//	}

	public char getKey() {
		return this.key;
	}

	public ArrayList<Node> getChildren() {
		return this.children;
	}

	public ArrayList<Character> getChildrensKeys() {
		ArrayList<Character> kidsKeys = new ArrayList<Character>();
		for (int i = 0; i < this.getChildren().size(); i++) {
			kidsKeys.add(this.getChildren().get(i).getKey());
		}
		return kidsKeys;
	}

	public void addChild(Node kid) {
		this.children.add(kid);
	}

	public void addChildren(ArrayList<Node> kids) {
		this.children.addAll(kids);
	}
}
