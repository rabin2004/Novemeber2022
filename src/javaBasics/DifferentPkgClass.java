package javaBasics;

 	public class DifferentPkgClass {

	public String msg;
	
	public String returnMsgFromDifferentPkg() {
		return msg;
	}
	
	private String returnMsgFromDifferentPkgPrivate() {
		return msg;
	}
	
	String returnMsgFromDifferentPkgDefault() {
		return msg;
	}
	
	protected String returnMsgFromDifferentPkgProtected() {
		return msg;
	}
	
	void test() {
		returnMsgFromDifferentPkgPrivate();
	}
}
