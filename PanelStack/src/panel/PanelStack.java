package panel;

import java.util.Stack;

import javax.swing.JPanel;

public class PanelStack {
	// Saves the panels in this stack.
	private Stack<JPanel> panels;
	
	/**
	 * Constructor initializing an empty list.
	 */
	public PanelStack() {
		panels = new Stack<JPanel>();
	}
	/**
	 * Constructor initializing a Stack with the argument as the first value.
	 * @param initialPanel the first value
	 */
	public PanelStack(JPanel initialPanel) {
		this();
		panels.push(initialPanel);
	}
	/**
	 * Concats a new panel to the stack.
	 * @param panel the panel to be concatinated.
	 */
	public void push(JPanel panel) {
		panels.push(panel);
	}
	/**
	 * Looks at the element at the top of the stack.
	 * @return the top of the stack element.
	 */
	public JPanel pull() {
		return panels.peek();
	}
	
	/**
	 * Removes the element at the top of the stack.
	 * @return the element that was removed.
	 */
	public JPanel pop() {
		return panels.pop();
	}
	/**
	 * Deletes the current Stack and initializes a new, empty one.
	 * @return the current, latest object at the top of the stack.
	 */
	public JPanel popWhole() {
		JPanel panel = panels.peek();
		
		// Deletes the stack.
		panels = null;
		panels = new Stack<JPanel>();
		
		return panel;
	}
}
