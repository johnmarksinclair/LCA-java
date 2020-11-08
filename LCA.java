import java.util.ArrayList;

public class LCA {

	public static char getLCA(Node one, Node two) {
		ArrayList<Node> oneParents = one.getParents();
		ArrayList<Node> twoParents = two.getParents();
		oneParents.retainAll(twoParents);
		if (oneParents.size() > 0) {
			return one.getParents().get(0).getKey();
		} else {
			
		}
		return '0';
	}
}