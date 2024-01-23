/**
This class represents a Course.
@author Leah Bidlake
@author Daniyal Khan 3765942
*/

public class Course{

	//Instance variables:
    //For each Course object, store its name, semester, year, and the
    //number of students enrolled in the course so far.
	private String name;
	private String semester;
	private int year;
	private int students;
	private String instructor;
	

	//The constructor creates a new Course object and initializes the
    //instance variables.
	public Course(String nameIn, String semesterIn, int yearIn, String instructorName){ 
		name = nameIn;
		semester = semesterIn;
		year = yearIn;
		students = 0;	//no students have been added to the course
		instructor = instructorName;
	}
	
	//This is a method we can call to increase the number of students in the course by some amount	
	public void addStudent(int studentNum) {
		students += studentNum;
	}
	

	//This is a method that we can call on a Course object
    //(Specifically, it is an accessor method). This method
    //creates and returns a String containing all the information
    //about the state of the object.
    public String toString(){
		return name + 
				" offered " + semester + 
				" " + year +
				" Students: " + students +
				" Instructor: " + instructor;
	}

}
