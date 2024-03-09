package felsFX;

import java.awt.Color;

import javax.swing.*;

public class Label implements usedToCreateBlock{
	
	JLabel label = new JLabel();
	
	public Label(String text) {
		label.setText(text);
	}
	
	public Label() {}
	
	public void add(Window frame) {
		frame.add(label);
	}
	
	public void setBounds(int a,int b,int c,int d) {
		label.setBounds(a,b,c,d);
	}
	
	public void setText(String text) {
		label.setText(text);
	}
	
	public void setBackground(FColor color) {
		if(color == FColor.BLACK) {
			label.setBackground(Color.BLACK);
		}else if(color == FColor.BLUE) {
			label.setBackground(Color.BLUE);
		}else if(color == FColor.GREEN) {
			label.setBackground(Color.GREEN);
		}else if(color == FColor.RED) {
			label.setBackground(Color.RED);
		}else if(color == FColor.YELLOW) {
			label.setBackground(Color.YELLOW);
		}
	}
	
	public void setToolTip(String text) {
		label.setToolTipText(text);
	}
}
