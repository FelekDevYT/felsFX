package felsFX;

import javax.swing.JOptionPane;

public class message {
	public static String show(String title,String text,MessageType type) throws felsFXException {
		try {
			Init.isInit();
		} catch (felsFXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(type == MessageType.ERROR) {
			JOptionPane.showMessageDialog(null, text, title,JOptionPane.ERROR_MESSAGE);
			return "";
		}else if(type == MessageType.INFORMATION) {
			JOptionPane.showMessageDialog(null, text, title,JOptionPane.INFORMATION_MESSAGE);
			return "";
		}else if(type == MessageType.QUESTION) {
			JOptionPane.showMessageDialog(null, text, title,JOptionPane.QUESTION_MESSAGE);
			return "";
		}else if(type == MessageType.WARNING) {
			JOptionPane.showMessageDialog(null, text, title,JOptionPane.WARNING_MESSAGE);
			return "";
		}else if(type == MessageType.INPUT) {
			return input(title,text);
		}
		return "";
	}
	
	public static  String input(String title,String text) {
		 String result = String.valueOf(JOptionPane.showInputDialog(title,text));
		return result;
	}
	
}