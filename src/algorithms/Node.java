package algorithms;

public class Node {
	private int pathCost;
	private Node parent;
	private int state;
	// Possible also some kind of action ?
	
	public Node(int pC, Node p, int s) {
		this.pathCost = pC;
		this.parent = p;
		this.state = s;
	}
	
	
	/****************************************
	 * 										*
	 * 			Getters and Setters			*
	 * 										*
	 * **************************************/
	public Node getParent() {
		return parent;
	}
	public void setParent(Node parent) {
		this.parent = parent;
	}
	public int getPathCost() {
		return pathCost;
	}
	public void setPathCost(int pathCost) {
		this.pathCost = pathCost;
	}
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
}
