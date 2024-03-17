package felsFX;

public class felsFXException extends Exception {

	static int count = 0;
	
	String name;
	
	felsFXException(String name){
		count++;
		this.name = name;
	}
	
	public String toString() {
		String text ="Started error!";
		text+="Description: "+name+"\n";
		text+="Number of error: "+count+"\n";
		return text;
	}
}
