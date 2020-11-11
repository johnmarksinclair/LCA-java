import static org.junit.jupiter.api.Assertions.*;

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
	void testGetParentsKeys() {
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
		assertEquals("[b, c]", d.getParentsKeys().toString());
	}
	
	@Test 
	void testGetDistanceFromRoot() {
		Node a = new Node('a');
		Node b = new Node('b');
		Node c = new Node('c');
		Node d = new Node('d');
		b.addParent(a);
		c.addParent(b);
		d.addParent(c);
		assertEquals(1, b.getDistanceFromRoot());
		assertEquals(3, d.getDistanceFromRoot());
		d.addParent(b);
		assertEquals(2, d.getDistanceFromRoot());
	}

}
