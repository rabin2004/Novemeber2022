package oOPSconcept;

public class EncapsulationConcept {
	// Encapsulation: medicine inside a capsule - data hiding
	
	// Requirement: 
		// 1. define variable as private	
		// 2. assigning and accessing variable -> though public getter & setter methods
	
	private String DOB, SSN;
	
	public String getSSN() {
		return SSN;
	}

	public void setSSN(String sSN) {
		SSN = sSN;
	}

	public void setDOB(String dob) {
		this.DOB = dob;
	}
	
	public String getDOB() {
		return DOB;
	}
	
	
	
	
}
