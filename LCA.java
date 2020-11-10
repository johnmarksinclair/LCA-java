import java.util.ArrayList;

public class LCA {

	private static ArrayList<Character> ancestors;
	private static int hops;
	private static int tempHops;

//	public static char getLCA(Node one, Node two) {
//		if (one.getKey() > two.getKey()) {
//			Node temp = two;
//			two = one;
//			one = temp;
//		}
//		ArrayList<Character> onesAncestors = getAncestorsKeys(one, true);
//		ArrayList<Character> twosAncestors = getAncestorsKeys(two, true);
//		System.out.println(onesAncestors.toString());
//		System.out.println(twosAncestors.toString());
//		for (int i = 0; i < twosAncestors.size(); i++) {
//			for (int j = 0; j < onesAncestors.size(); j++) {
//				if (twosAncestors.get(i) == onesAncestors.get(j)) {
//					return twosAncestors.get(i);
//				}
//			}
//		}
//		return '!';
//	}

	public static char getLCA(Node one, Node two) {
		ArrayList<Character> onesAncestors = getAncestorsKeys(one, true);
		ArrayList<Character> twosAncestors = getAncestorsKeys(two, true);
		System.out.println(onesAncestors.toString());
		System.out.println(twosAncestors.toString());
		onesAncestors.retainAll(twosAncestors);

		System.out.println(onesAncestors.toString());
		for (int i = 0; i < onesAncestors.size(); i++) {
			// for each ancestor find one with greatest distance from root
		}
		return '!';
	}

	public static ArrayList<Character> getAncestorsKeys(Node node, boolean firstPass) {
		if (firstPass) {
			ancestors = new ArrayList<Character>();
			ancestors.add(node.getKey()); // can node be its own ancestor?
		}
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

	// get lowest amount of hops
	public static int distanceFromRoot(Node node, boolean firstPass) {
		if (firstPass) {
			hops = Integer.MAX_VALUE;
			tempHops = 0;
		}
			
		for (int i = 0; i <  node.getParents().size(); i++) {
			
		}
		tempHops += 1;
		if (tempHops < hops) {
			hops = tempHops;
		}
		return hops;
	}
}