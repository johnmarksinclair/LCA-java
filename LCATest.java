import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class LCATest {

	@Test
	void testLCA() {
		Node a = new Node('a', new ArrayList<Node>());
		//a.getParentKeys();

		ArrayList<Node> bParents = new ArrayList<Node>();
		bParents.add(a);
		Node b = new Node('b', bParents);
		//b.getParentKeys();

		ArrayList<Node> cParents = new ArrayList<Node>();
		cParents.add(a);
		Node c = new Node('c', cParents);
		//c.getParentKeys();

		ArrayList<Node> dParents = new ArrayList<Node>();
		dParents.add(b);
		dParents.add(c);
		Node d = new Node('d', dParents);
		//d.getParentKeys();

		ArrayList<Node> eParents = new ArrayList<Node>();
		eParents.add(c);
		Node e = new Node('e', eParents);
		//e.getParentKeys();

		ArrayList<Node> fParents = new ArrayList<Node>();
		fParents.add(b);
		fParents.add(e);
		Node f = new Node('f', fParents);
		//f.getParentKeys();
		
		
		assertEquals('a', LCA.getLCA(b, c));
		assertEquals('a', LCA.getLCA(b, d));
		assertEquals('a', LCA.getLCA(c, f));
		assertEquals('c', LCA.getLCA(b, f));
	}

}
