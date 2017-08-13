/*
 * Create another class StudentResultProcesing and extend this class from the student class
	and it will print the result of a student.
 */

package com.acadglid.session3;

public class StudentResultProcesing extends Student {




	void printResult(Student std) {

		System.out.println("Hello "+std.getName()+"! you are in class--> "+std.getStd());
		System.out.println("You have Roll Number :"+std.getRollno()+" phone number is "+std.getPhoneNumber());
		System.out.println("your result is : "+std.result(getMarks(), getRollno()));
		System.out.println("-----------------------------------------------------");
	}
}
