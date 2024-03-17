package felsFX;

public class felsFX {
	public static final String VERSION = "0.0.3 - dev";
	public static final String DOVERSIONTYPE = "Alpha";
	public static final String DEVELHER = "FelekStudio,Felek_";
	
	//User vars
	
	public static String version;
	static ProjectType PROJECTTYPE = ProjectType.CONSOLE;
	public static String developher;
	
	//boolean do var
	
	protected static boolean doSet = false;
	
	public static void setCreateFelsFX(ProjectType projectType,String version,String developher) 
	{
		doSet = true;
		PROJECTTYPE = projectType;
		felsFX.version = version;
		felsFX.developher = developher;
	}
}
