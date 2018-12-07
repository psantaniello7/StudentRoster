package src.scriptingAndProgramming;
/*This is the Roster.java Class file
 * Sets Student values in the Student.java class
   main method found here*/

import java.util.ArrayList;

public class Roster {
	
	static ArrayList<Student> newRoster = new ArrayList<>();
	

	public static void main(String[] args) {
		//Adds data to create new students for the Roster
		Roster.addStudent("1","John","Smith","John1989@gmail.com","20",88,79,59); 
		Roster.addStudent("2","Suzan","Erickson","Erickson_1990@gmailcom","19",91,72,85);
		Roster.addStudent("3","Jack","Napoli","The_lawyer99yahoo.com","19",85,84,87);
		Roster.addStudent("4","Erin","Black","Erin.black@comcast.net","22",91,98,82);
		Roster.addStudent("5","Paolo","Santaniello","Psanta2@wgu.edu","33",82, 95, 88);
		
		//Print methods for Part C
		print_all();
		print_invalid_emails();
		loop_average_grade();
		remove("3");
		remove("3");
		print_all(); // extra print_all() method to display the removal of studentId 3
		}
	
	public static void addStudent(String studentId, String  firstName, String lastName, String email, String age, int grade1, int grade2, int grade3 ) {
		//Create Array for grades
		int[] grades = {grade1, grade2, grade3};
		Student newStudent = new Student(studentId, firstName, lastName, email, age, grades);
		newRoster.add(newStudent);
	}
	
	public static void loop_average_grade() {
		//Loops students with their average grades
		for (Student a : newRoster) {
			int average = (a.getGrades()[0]+ a.getGrades()[1]+ a.getGrades()[2])/ 3;
			System.out.println("Student: " + a.getStudentId() + "\tAvg: "+ average);
		}
			
		}
	
	public static void remove(String studentId) {
		//Removes Student from Roster
		
		for (Student a : newRoster) {
			if(a.getStudentId().equals(studentId)) {
				newRoster.remove(a);
				return;
			}
		}
		System.out.println("Student ID does not exist");
	}
		
				
	
	public static void print_all() {
		//Loop through Array newRoster
		for (int i = 0; i < newRoster.size(); i++) {
			//get each student and call print()
			newRoster.get(i).print();
		}
	}
	
	public static void print_average_grade(String studentId) {
		//Loop ArrayList newRoster and get average grade for student by studentId
		for (Student a : newRoster) {
			while( a.getStudentId().equals(studentId)) {
			int average = (a.getGrades()[0]+ a.getGrades()[1]+ a.getGrades()[2])/ 3;
			System.out.println("Student: " + a.getStudentId() + "\tAvg: " + average);
			return;
		}	
		}
	}

	public static void print_invalid_emails() {
		for (Student a : newRoster) {
			if(!a.getEmail().contains("@") || !a.getEmail().contains(".") || a.getEmail().contains(" ")){
				System.out.println("Invalid Email: " + a.getEmail());
			}
			}
		
	}
}
