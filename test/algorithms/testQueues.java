package algorithms;

import static org.junit.Assert.*;

import java.util.Comparator;
import java.util.PriorityQueue;

import org.junit.Test;

public class testQueues {
	@Test
	public void testLogin() {
		Comparator<Node> comparator = new PathCostComparator();
		PriorityQueue<Node> queue = new PriorityQueue<Node>(10,comparator);
		
		Node n1 = new Node();
		Node n2 = new Node();
		Node n3 = new Node();
		
		n1.setPathCost(20);
		n2.setPathCost(30);
		n3.setPathCost(40);
		
		queue.add(n2);
		queue.add(n1);
		queue.add(n3);
		
		assertEquals(queue.element().getPathCost(),20);
	}
}
