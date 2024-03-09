
import felsFX.*;

public class Main {
	public static void main(String[] args){
		Init.setInit(true);
		felsFX.setCreateFelsFX(ProjectType.CONSOLE_MESSAGE, "1.0.0","Felek_");
		message.show("Hello,world(title)","Hello,world!", MessageType.INFORMATION);
	}
}