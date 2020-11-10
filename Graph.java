import java.util.ArrayList;

public class Graph {
	
	private ArrayList<Node> nodes;
	
	Graph() {
		this.nodes = new ArrayList<Node>();
	}
	
	public void addNode(Node node) {
		this.nodes.add(node);
	}
	
	public ArrayList<Character> getAncestorsKeys(Node node) {
		ArrayList<Character> ancestors = new ArrayList<Character>();
		for (int i = 0; i < node.getParents().size(); i++) {
			System.out.println("Key: " + node.getParents().get(i).getKey());
			ancestors.add(node.getParents().get(i).getKey());
			System.out.println("Current ancestors: " + ancestors.toString());
			getAncestorsKeys(node.getParents().get(i));
		}
		return ancestors;
	}

}
