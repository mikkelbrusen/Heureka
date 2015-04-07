package algorithms;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;

public class UniformSearch {
	
	// data structure setup
	private Map<String,Node> inFrontierNotExplored = new HashMap<String,Node>();
	private PriorityQueue<Node> frontier = new PriorityQueue<Node>(20,new PathCostComparator());
	private Map<String,Node> explored = new HashMap<String,Node>();
	
	/**
	 * Solve takes a "Graph" and two "GNode"s (Graph Node) as input, one for start, one for the goal.
	 **/
	public List<Node> Solve(Graph graph, GNode start, GNode target) {
		Node node = new Node(start,null, 0 /* Change this number to calculated distance!!!!!!!!!!!!*/);
		frontier.add(node);
		
		Node goal = null;
		while(!frontier.isEmpty()) {
			Node x = frontier.poll();
			inFrontierNotExplored.remove(x.getState());
			explored.put(x.getState(), x);
			
			// if Frontier Node is target Node
			if(x.getState().equals(target.getState())) {
				goal = x;
				break;
			}
			
			else {
				Set<GNode> neighbors = null; // = graph.getNeightbors(x.getState) or something like that ---- To be implemented with the graph
				for(GNode neighbor : neighbors) {
					//Check if the node have been explored
					if(explored.get(neighbor.getState()) == null){
						
						Node n = inFrontierNotExplored.get(neighbor.getState());
						double g = x.getG() + 0/* some calculated manhattanDistance between x and n*/;
						
						//Check if the neighbor is in the frontier queue
						if( n == null) {

							//It wasn't so now construct the node and add it to frontier and inFrontierNotExplored
							Node n1 = new Node(neighbor, x, 0 /*Need to implement distance calculator!!!!!!!!!! */);
							inFrontierNotExplored.put(n1.getState(), n1);
							frontier.add(n1);
						} else if(g < n.getG()){
							n.setParent(x);
							n.setG(g);
							n.setH(0 /* some calculated manhattanDistance between neightboor and target*/);
						}		
					}	
				}
			}
		}
		
		// Now construct the path by backtracking throught the nodes and their parents.
		
		return null;
	}
}
