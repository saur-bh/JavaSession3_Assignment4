
/*
 * Create a class Student which has some private data like name, phone number, roll
	number, class, use getter and setters to access this private data.
 */

package com.acadglid.session3;

public class Student {

	private String name;
	private int rollno;
	private String phoneNumber;
	private String std;
	private int[] marks = new int[3];

	// getter and Setter method to access the private data 

	public int[] getMarks() {
		return marks;
	}
	public void setMarks(int[] marks) {
		this.marks = marks;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getStd() {
		return std;
	}
	public void setStd(String std) {
		this.std = std;
	}

	/*
	 * Create a method result which accepts marks in three subjects along with the student roll
		number and return the result of that student as pass or fails.
	 */
	String result(int[] marks,int rollno){

		int sum = 0;
		for(int i=0;i<this.marks.length;i++) {
			sum = sum + this.marks[i];
		}

		if(sum > 60) {
			return "pass";
		}
		else {
			return "fail";
		}

	}


}
