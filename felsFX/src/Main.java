import felsFX.Init;
import felsFX.MessageType;
import felsFX.felsFXException;
import felsFX.message;

public class Main {
	public static void main(String[] args) throws felsFXException {
		Init.setInit(true);
		message.show("1", "2",MessageType.ERROR);
	}
}
