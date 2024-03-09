package felsFX;


import java.awt.Font;

import javax.swing.*;

public class TextArea {
	JTextArea text = new JTextArea();
	
	public TextArea(int width,int height) {
		text.setSize(width,height);
	}
	
	public void setSize(int width,int height) {
		text.setSize(width,height);
	}
	
	public String getText() {
		return text.getText();
	}
	
	public void add(Window frame) {
		frame.add(text);
	}
	
	public void setFont(String name,int font,int size) {
		text.setFont(new Font("Dialog", font, size));
	}
	//include public!
	private void setText(String text) {
	}
}
