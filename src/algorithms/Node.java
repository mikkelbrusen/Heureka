package algorithms;

public class Node {
	private GNode graphNode;
	private Node parent;
	private double g;
	private double h;
	private double f;
	// Possible also some kind of action ?
	
	public Node(GNode gn, Node p, double h) {
		this.setGraphNode(gn);
		this.setParent(p);
		this.setH(h);
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
	public GNode getGraphNode() {
		return graphNode;
	}
	public void setGraphNode(GNode graphNode) {
		this.graphNode = graphNode;
	}
	public String getState() {
		return graphNode.getState();
	}

	public double getG() {
		return g;
	}

	public void setG(double g) {
		this.g = g;
	}

	public double getH() {
		return h;
	}

	public void setH(double h) {
		this.h = h;
	}

	public double getF() {
		return f;
	}

	public void setF(double f) {
		this.f = f;
	}
}
