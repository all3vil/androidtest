package org.all3vil.androidtest;
import java.util.ArrayList;

public class Test {
	private static void printNode(int parentId, ArrayList<DecisionTreeNode> nodes) {
		System.out.println("[" + parentId + "]" + nodes.get(parentId).getDisplayString());
		// get children for the specified parent node
		for (int i = 0; i < nodes.size(); i++) {
			if (nodes.get(i).getParentNodeId() == parentId) {
				DecisionTreeNode child = nodes.get(i);
				System.out.print(child.getEntryString() + " --> ");
				System.out.println("[" + child.getNodeId() + "]" + child.getDisplayString());
			}
		}		
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList<DecisionTreeNode> nodes = new ArrayList<DecisionTreeNode>();
		nodes.add(new DecisionTreeNode(0, -1, "Do you like working with people?", null, null));
		nodes.add(new DecisionTreeNode(1, 0, "Do you like food?", "Yes", null));
		nodes.add(new DecisionTreeNode(2, 1, "You should be a caterer.", "Yes", null));
		nodes.add(new DecisionTreeNode(3, 1, "You should be a chef.", "No", null));
		nodes.add(new DecisionTreeNode(4, 0, "Do you like computers?", "No", null));
		nodes.add(new DecisionTreeNode(5, 4, "You should be a programmer.", "Yes", null));
		nodes.add(new DecisionTreeNode(6, 4, "You should be a hermit.", "No", null));
		
		for (int i=0; i < nodes.size(); i++) {
			printNode(i, nodes);
			System.out.println("");
		}
	}

}
