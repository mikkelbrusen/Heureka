package algorithms;
import java.util.Comparator;


public class PathCostComparator implements Comparator<Node> {

	public int compare(Node n1, Node n2) {
		// Will return negative if n2 > n1
		// Will return positive if n1 > n2
		// Will return 0 if equally big
		if(n1.getF() < n2.getF()) return -1;
		if(n1.getF() > n2.getF()) return 1;
		else return 0;
	}

}
