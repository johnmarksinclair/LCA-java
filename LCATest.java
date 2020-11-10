import org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LCATest {

	@Test
	void testGetAncestors() {
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
		
		System.out.println("Parents: " + e.getParentsKeys().toString());
		//System.out.println("Ancestors: " + LCA.getAncestorsKeys(e).toString());
		
	}

}
