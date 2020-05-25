package panel;

import java.awt.Panel;
import java.util.Stack;

import javax.swing.JPanel;

public class PanelStack {
	// Saves the panels in this stack.
	private Stack<JPanel> panels;
	// Variable specifying the length of the stack.
	private int length;

	/**
	 * Constructor initializing an empty list.
	 */
	public PanelStack() {
		panels = new Stack<JPanel>();
	}

	/**
	 * Constructor initializing a Stack with the argument as the first value.
	 * 
	 * @param initialPanel the first value
	 */
	public PanelStack(JPanel initialPanel) {
		this();
		panels.push(initialPanel);
		length = 1;
	}

	public String print() {
		String buffer = "";
		for (JPanel panel : panels) {
			buffer += panel + "\n";
		}
		return buffer;
	}

	/**
	 * Concats a new panel to the stack.
	 * 
	 * @param panel the panel to be concatinated.
	 */
	public void push(JPanel panel) {
		panels.push(panel);
		length++;
	}

	/**
	 * Pops the stack and returns the new tos.
	 * 
	 * @return the new top of stack.
	 */
	public JPanel stepBack() {
		panels.pop();
		length--;
		return panels.peek();
	}

	/**
	 * Looks at the element at the top of the stack.
	 * 
	 * @return the top of the stack element.
	 */
	public JPanel pull() {
		return panels.peek();
	}

	/**
	 * Removes the element at the top of the stack.
	 * 
	 * @return the element that was removed.
	 */
	public JPanel pop() {
		if (length >= 0 || panels == null) {
			return null;
		} else {
			length--;
			return panels.pop();
		}
	}

	/**
	 * Deletes the current Stack and initializes a new, empty one.
	 * 
	 * @return the current, latest object at the top of the stack.
	 */
	public JPanel popWhole() {
		JPanel panel = panels.peek();

		// Deletes the stack.
		panels = null;
		panels = new Stack<JPanel>();
		length = 0;

		return panel;
	}

	/**
	 * Returns the length of the Stack/ how many panels are on it at this instance.
	 * 
	 * @return length of the Stack.
	 */
	public int getLength() {
		return length;
	}
}
