import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

class LCATest {
	
	@Test
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
		assertEquals('d', LCA.getLCA(d, e));
		assertEquals('b', LCA.getLCA(b, e));
		assertEquals('a', LCA.getLCA(b, c));
		assertEquals('c', LCA.getLCA(c, d));
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
		Node x = new Node('x');
		b.addParent(e);
		c.addParent(a);
		d.addParent(c);
		e.addParent(c);
		f.addParent(b);
		f.addParent(e);
		g.addParent(d);
		h.addParent(e);
		i.addParent(f);
		i.addParent(h);
		assertEquals('a', LCA.getLCA(a, a));
		assertEquals('!', LCA.getLCA(d, x));
		assertEquals('c', LCA.getLCA(d, e));
		assertEquals('e', LCA.getLCA(f, h));
		assertEquals('c', LCA.getLCA(g, h));
		assertEquals('c', LCA.getLCA(i, g));
		assertEquals('b', LCA.getLCA(f, b));
	}

}
