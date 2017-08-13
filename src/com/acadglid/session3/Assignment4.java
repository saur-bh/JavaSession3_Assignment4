/*
 * The user has to give the input as student name, phone number, roll number, class along
with the marks in three subjects. And the output should contain all the information of the
student as his/her name, roll number, class, result.
 */


package com.acadglid.session3;

public class Assignment4 extends StudentResultProcesing {

	public static void main(String[] arg) {

		//Data of the first Student 

		Student std1 = new Student();
		StudentResultProcesing stdResult = new StudentResultProcesing();

		std1.setName("Student1");  //name
		std1.setPhoneNumber("PhoneNumber1");
		std1.setRollno(001);
		std1.setStd("BCA");
		std1.setMarks(new int[]{20,30,80});

		//Data of the Second Student 

		Student std2 = new Student();

		std2.setName("Student2");  //name
		std2.setPhoneNumber("PhoneNumber2");
		std2.setRollno(002);
		std2.setStd("Btech");
		std2.setMarks(new int[]{20,20,10});

		//Data of the Third Student 

		Student std3 = new Student();

		std3.setName("Student3");  //name
		std3.setPhoneNumber("PhoneNumber3");
		std3.setRollno(003);
		std3.setStd("Mtech");
		std3.setMarks(new int[]{90,30,80});

		// Result of the first student 

		stdResult.printResult(std1);
		// Result of the first student 

		stdResult.printResult(std2);
		// Result of the first student 

		stdResult.printResult(std3);

	}





}
