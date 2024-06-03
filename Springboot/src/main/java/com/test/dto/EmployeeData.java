/**
 * 
 */
package com.test.dto;

/**
 * @author Prasad_Bonam
 *
 */


public class EmployeeData implements java.io.Serializable {
	/**
	 * 
	 */
	private int empID;
	private String empName;
	private static final long serialVersionUID = 1L;
	public int getEmpID() {
		return empID;
	}
	public void setEmpID(int empID) {
		this.empID = empID;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}

	

}
