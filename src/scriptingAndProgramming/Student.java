package src.scriptingAndProgramming;
/*This is the Student.java Class
 * This identifies all values
   used in Roster.java*/
public class Student {
	private String studentId;
	private String firstName;
	private String lastName;
	private String email;
	private String age;
	private int[] grades;
	
	//Sets the Student values
	public Student(String studentId, String firstName, String lastName, String email, String age, int[] grades) {
		setStudentId(studentId);
		setFirstName(firstName);
		setLastName(lastName);
		setEmail(email);
		setAge(age);
		setGrades(grades);
	}
	//Accessor methods for each parameters
	public String getStudentId() {
		return studentId;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public String getEmail() {
		return email;
	}
	
	public String getAge() {
		return age;
	}
	
	public int[] getGrades() {
		return grades;
	}
	
	//Mutator methods for Student parameters
	
	public void setStudentId(String newStudentId) {
		studentId = newStudentId;
	}
	
	public void setFirstName(String newFirstName) {
		firstName = newFirstName;
	}
	
	public void setLastName(String newLastName) {
		lastName = newLastName;
	}
	
	public void setEmail(String newEmail) {
		email = newEmail;
	}
	
	public void setAge(String newAge) {
		age = newAge;
	}
	
	public void setGrades(int[] newGrades) {
		grades = newGrades;
	}
	
	//Print method to display onto console
	public void print() {
		System.out.println("ID\t"+ getStudentId() +
						"\tFirstName\t" + getFirstName() +
						"\tLastName\t" + getLastName() +
						"\tE-Mail\t" + getEmail() +
						"\tAge\t" + getAge() );
	}
}
