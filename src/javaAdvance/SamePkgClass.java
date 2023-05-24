package javaAdvance;

	public class SamePkgClass {
	
	public String msg;
	
	public String returnMsgFromSamePkg() {
		return msg;
	}
	
	private String returnMsgFromSamePkgPrivate() {
		return msg;
	}
	
	String returnMsgFromSamePkgDefault() {
		return msg;
	}
	
	protected String returnMsgFromSamePkgProtected() {
		return msg;
	}
	
	void test() {
		returnMsgFromSamePkgPrivate();
	}

}
