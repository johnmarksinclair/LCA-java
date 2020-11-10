import java.util.ArrayList;

public class LCA {

	public Node getLCA(Node one, Node two) {
		return null;
	}

	public ArrayList<Character> getAncestorsKeys(Node node) {
		ArrayList<Character> ancestors = new ArrayList<Character>();
		for (int i = 0; i < node.getParents().size(); i++) {
			System.out.println(node.getParents().get(i).getKey());
			ancestors.add(node.getParents().get(i).getKey());
			System.out.println(ancestors.toString());
			getAncestorsKeys(node.getParents().get(i));
		}
		return ancestors;
	}
}