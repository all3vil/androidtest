package org.all3vil.androidtest;
import java.util.ArrayList;

public class DecisionTreeNode {
	
/**
 * String to display for this node (could be a question, e.g., "Is the patient
 * older than 18?"; could be an informative statement, followed by a "continue"	
 */
private String displayString;

/**
 * name of the image to display on this node
 */
private String imageName;

/**
 * Number identifying this node; could be a private key from a database row,
 * or arbitrarily assigned ID.  Should be unique amongst nodes in a tree.
 */
private int nodeId;

/**
 * The nodeId of the parent node, if any (if -1, then this is the root node)
 */
private int parentNodeId;

/**
 * This is the text displayed on the parent node that leads to this child
 * e.g., "yes", "no", "continue", etc.
 */
private String entryString;

	/**
	 * Constructor for a DecisionTreeNode
	 * @param nodeId the node's unique ID
	 * @param parentNodeId the node's parent's nodeId
	 * @param displayString the string to display on this node
	 * @param entryString the string on the button leading to this node 
	 * @param imageName the name of the image to display on this node
	 * @param children this node's children
	 */
	public DecisionTreeNode(int nodeId, int parentNodeId, String displayString, String entryString, String imageName) {
		this.nodeId = nodeId;
		this.parentNodeId = parentNodeId;
		this.displayString = displayString;
		this.entryString = entryString;
		this.imageName = imageName;
	}

	/**
	 * A simple string representation of a node and its children
	 */
	public String toString() {
		String retval = "{";
		retval += "nodeId:" + this.nodeId + ", ";
		retval += "parentNodeId:" + this.parentNodeId + ", ";
		
		if (displayString != null)
			retval += "displayString:'" + this.displayString + "', ";
		else
			retval += "displayString:[null], ";

		if (entryString != null)
			retval += "entryString:" + this.entryString + ", ";
		else
			retval += "entryString:[null], ";
		
		if (imageName != null)
			retval += "imageName:" + this.imageName + ", ";
		else
			retval += "imageName:[null], ";
		retval += "}";
		return retval;
	}
	
	public String getDisplayString() {
		return displayString;
	}

	public void setDisplayString(String displayString) {
		this.displayString = displayString;
	}

	public String getImageName() {
		return imageName;
	}

	public void setImageName(String imageName) {
		this.imageName = imageName;
	}

	public String getEntryString() {
		return entryString;
	}

	public void setEntryString(String entryString) {
		this.entryString = entryString;
	}

	public int getNodeId() {
		return nodeId;
	}

	public int getParentNodeId() {
		return parentNodeId;
	}
}
