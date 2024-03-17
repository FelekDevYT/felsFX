package felsFX;

import javax.swing.*;
import felsFX.Init;

public class Window {
	protected static JFrame frame = new JFrame();
	
	public Window(String name) throws felsFXException{
		try {
			Init.isInit();
		} catch (felsFXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		frame.setTitle(name);
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
	
	protected void add(JLabel label) {
		frame.add(label);
	}
	protected void add(JButton button) {
		frame.add(button);
	}
	protected void add(JTextArea text) {
		frame.add(text);
	}
}
