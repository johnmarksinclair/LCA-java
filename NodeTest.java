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
	void testGetParents() {
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
		ArrayList<Character> esParents = new ArrayList<Character>();
		esParents.add('c');
		esParents.add('d');
		assertEquals(esParents, e.getParentsKeys());
	}

}
