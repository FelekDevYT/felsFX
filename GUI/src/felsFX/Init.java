package felsFX;

public class Init {
	protected static boolean doInit = false;
	
	public static void setInit(boolean tor) {
		doInit = tor;
	}
	
	protected static boolean isInit() {
		if(doInit) {
			System.out.println("FelsFX loaded!");
		}else {
			System.err.println("felsFX:error 10 - do not init!");
			return false;
		}
		if(felsFX.doSet) {
			System.out.println("developher : "+felsFX.developher);
			System.out.println("version : "+felsFX.version);
			System.out.println("project type : "+felsFX.PROJECTTYPE);	
		}else ;
		return true;
	}
	
	public static boolean getDoInit() {
		return doInit;
	}
}
