package felsFX;

import javax.swing.*;

public class Window {
	protected static JFrame frame = new JFrame();
	
	public Window(String name){
		frame.setTitle(name);
		Init.isInit();
	}
	
	public Window(){}
	
	public void show() {
		frame.setVisible(true);
	}
	
	public void setTitle(String name) {
		frame.setTitle(name);
	}
	
	public void setSize(int a,int b) {
		frame.setSize(a, b);
	}
	
	public void add(JLabel label) {
		frame.add(label);
	}
	public void add(JButton button) {
		frame.add(button);
	}
	public void add(JTextArea text) {
		frame.add(text);
	}
}
