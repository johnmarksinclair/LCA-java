import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class NodeTest {

	@Test
	void testConstructor() {
		Node a = new Node('a');
		assertTrue(a != null);
	}

	@Test
	void testGetKey() {
		Node a = new Node('a');
		assertEquals('a', a.getKey());
	}

	@Test
	void testGetChildren() {
		Node a = new Node('a');
		Node b = new Node('b');
		Node c = new Node('c');
		Node d = new Node('d');
		Node e = new Node('e');
		a.addChild(b);
		b.addChild(c);
		b.addChild(d);
		c.addChild(a);
		d.addChild(e);
		e.addChild(a);
		ArrayList<Character> bsChildren = new ArrayList<Character>();
		bsChildren.add('c');
		bsChildren.add('d');
		assertEquals(bsChildren, b.getChildrensKeys());
	}
	
	@Test
	void testAddChildren() {
		Node a = new Node('a');
		Node b = new Node('b');
		Node c = new Node('c');
		ArrayList<Node> kids = new ArrayList<Node>();
		kids.add(b);
		kids.add(c);
		a.addChildren(kids);
		ArrayList<Character> asChildren = new ArrayList<Character>();
		asChildren.add('b');
		asChildren.add('c');
		assertEquals(asChildren, a.getChildrensKeys());
	}

}
