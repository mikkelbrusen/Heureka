package algorithms;
import java.util.Comparator;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Set;

public class UniformSearch {
	
	// data structure setup
	private Comparator<Node> comparator = new PathCostComparator();
	private PriorityQueue<Node> frontier = new PriorityQueue<Node>(20,comparator);
	private Set<Node> explored = new HashSet<Node>();
	private Node node;
	
	public boolean Solve(Graph graph, GNode start, GNode goal) {
		node = new Node(0, null, start.getState());
		frontier.add(node);
		
		while(!frontier.isEmpty()) {
			Node x = frontier.poll();
			if(x.getState().equals(p.goal-state)) {
				return true;
			}
			else {
				explored.add(x);
				Set<Node> neighbors = // Something? 
				for(neighbor : neighbors) {
					
				}
				
			}
			
			
			
			
		}
		
		return false;
	}
	
	
	
	
	
	//Priority Queue for frontier ordered by PATH-COST
	//HashSet for explored
}
