import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

class LCATest {

	@Test
	void testGetAncestorsKeys() {
		Node a = new Node('a');
		Node b = new Node('b');
		Node c = new Node('c');
		Node d = new Node('d');
		Node e = new Node('e');
		b.addParent(a);
		c.addParent(a);
		d.addParent(b);
		d.addParent(c);
		e.addParent(c);
		e.addParent(d);
		assertEquals("[c, a, d, b]", LCA.getAncestorsKeys(e, true).toString());
	}
	
	@Test
	void testGetLCA() {
		Node a = new Node('a');
		Node b = new Node('b');
		Node c = new Node('c');
		Node d = new Node('d');
		Node e = new Node('e');
		b.addParent(a);
		c.addParent(a);
		d.addParent(b);
		d.addParent(c);
		e.addParent(c);
		e.addParent(d);
		assertEquals('c', LCA.getLCA(d, e));
		assertEquals('a', LCA.getLCA(b, e));
		assertEquals('a', LCA.getLCA(b, c));
		assertEquals('a', LCA.getLCA(c, d));
	}

}
