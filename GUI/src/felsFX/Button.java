package felsFX;

import javax.swing.JButton;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Button implements ActionListener,usedToCreateBlock{

	JButton button = new JButton();
	
	public Button(String text) {
		button.setText(text);
		button.addActionListener(this);
	}
	
	public Button() {}
	
	public void add(Window frame) {
		frame.add(button);
	}
	
	public void setBounds(int a,int b,int c,int d) {
		button.setBounds(a,b,c,d);
	}
	
	public void setLayout() {
		button.setLayout(null);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("FelsFX:button is clicked");
	}

	@Override
	public void setBackground(FColor color) {
		if(color == FColor.BLACK) {
			button.setBackground(Color.BLACK);
		}else if(color == FColor.BLUE) {
			button.setBackground(Color.BLUE);
		}else if(color == FColor.GREEN) {
			button.setBackground(Color.GREEN);
		}else if(color == FColor.RED) {
			button.setBackground(Color.RED);
		}else if(color == FColor.YELLOW) {
			button.setBackground(Color.YELLOW);
		}
	}

	@Override
	public void setToolTip(String text) {
		button.setToolTipText(text);
	}
}
