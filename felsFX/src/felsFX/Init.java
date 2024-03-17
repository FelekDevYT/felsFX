package felsFX;

import felsFX.felsFXException;

public class Init {
	protected static boolean doInit = false;
	
	public static void setInit(boolean tor) {
		doInit = tor;
	}
	
	protected static boolean isInit() throws felsFXException {
		if(doInit) {
			;
		}else {
			throw new felsFXException("GUI is do not init!");
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
