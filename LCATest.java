import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

class LCATest {

//	@Test
//	void testGetAncestorsKeys() {
//		Node a = new Node('a');
//		Node b = new Node('b');
//		Node c = new Node('c');
//		Node d = new Node('d');
//		Node e = new Node('e');
//		b.addParent(a);
//		c.addParent(a);
//		d.addParent(b);
//		d.addParent(c);
//		e.addParent(c);
//		e.addParent(d);
//		assertEquals("[c, a, d, b]", LCA.getAncestorsKeys(e, true).toString());
//	}
	
	//@Test
	void testSimpleGetLCA() {
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
	
	@Test
	void testComplexGetLCA() {
		Node a = new Node('a');
		Node b = new Node('b');
		Node c = new Node('c');
		Node d = new Node('d');
		Node e = new Node('e');
		Node f = new Node('f');
		Node g = new Node('g');
		Node h = new Node('h');
		Node i = new Node('i');
		b.addParent(e);
		c.addParent(a);
		d.addParent(c);
		e.addParent(c);
		e.addParent(g);
		f.addParent(b);
		f.addParent(e);
		g.addParent(d);
		h.addParent(e);
		i.addParent(f);
		i.addParent(h);
		assertEquals('e', LCA.getLCA(f, h));
		assertEquals('c', LCA.getLCA(g, h));
		assertEquals('c', LCA.getLCA(h, g));
		assertEquals('g', LCA.getLCA(b, g));
	}

}
