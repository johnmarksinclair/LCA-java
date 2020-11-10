import java.util.ArrayList;

public class LCA {

	public static ArrayList<Character> ancestors;

	public static char getLCA(Node one, Node two) {
		ArrayList<Character> onesAncestors = getAncestorsKeys(one, true);
		ArrayList<Character> twosAncestors = getAncestorsKeys(two, true);
//		System.out.println(onesAncestors.toString());
//		System.out.println(twosAncestors.toString());
		for (int i = 0; i < twosAncestors.size(); i++) {
			for (int j = 0; j < onesAncestors.size(); j++) {
				if (twosAncestors.get(i) == onesAncestors.get(j)) {
					return twosAncestors.get(i);
				}
			}
		}
		return '!';
	}

	public static ArrayList<Character> getAncestorsKeys(Node node, boolean firstPass) {
		if (firstPass)
			ancestors = new ArrayList<Character>();
		for (int i = 0; i < node.getParents().size(); i++) {
			// System.out.println(node.getParents().get(i).getKey());
			char temp = node.getParents().get(i).getKey();
			boolean flag = false;
			for (int j = 0; j < ancestors.size(); j++) {
				if (temp == ancestors.get(j)) {
					flag = true;
				}
			}
			if (flag == false) {
				ancestors.add(temp);
				// System.out.println(ancestors.toString());
			}
			getAncestorsKeys(node.getParents().get(i), false);
		}
		return ancestors;
	}
}