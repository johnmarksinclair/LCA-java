import java.util.ArrayList;

public class LCA {

	private static ArrayList<Node> ancestors;

	public static char getLCA(Node one, Node two) {
		ArrayList<Node> common = getCommonAncestors(one, two);
		if (common.size() > 1) {
			Node temp = common.get(0);
			for (int i = 1; i < common.size(); i++) {
				if (common.get(i).getDistanceFromRoot() > temp.getDistanceFromRoot()) {
					temp = common.get(i);
				}
			}
			return temp.getKey();
		} else if (common.size() == 1) {
			return common.get(0).getKey();
		} else {
			return '!';
		}

	}

	public static ArrayList<Node> getCommonAncestors(Node one, Node two) {
		ArrayList<Node> onesAncestors = getAncestors(one, true);
		//printNodeList(onesAncestors);
		ArrayList<Node> twosAncestors = getAncestors(two, true);
		//printNodeList(twosAncestors);
		onesAncestors.retainAll(twosAncestors);
		//printNodeList(onesAncestors);
		return onesAncestors;
	}

	public static ArrayList<Node> getAncestors(Node node, boolean firstPass) {
		if (firstPass) {
			ancestors = new ArrayList<Node>();
			ancestors.add(node);
		}
		for (int i = 0; i < node.getParents().size(); i++) {
			Node temp = node.getParents().get(i);
			boolean flag = false;
			for (int j = 0; j < ancestors.size(); j++) {
				if (temp == ancestors.get(j)) {
					flag = true;
				}
			}
			if (flag == false) {
				ancestors.add(temp);
			}
			getAncestors(node.getParents().get(i), false);
		}
		return ancestors;
	}

	public static void printNodeList(ArrayList<Node> nodes) {
		for (int i = 0; i < nodes.size(); i++) {
			System.out.println(
					"Node: " + nodes.get(i).getKey() + ", distance from root: " + nodes.get(i).getDistanceFromRoot());
		}
		System.out.println();
	}

}