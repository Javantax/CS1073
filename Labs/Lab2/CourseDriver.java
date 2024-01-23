/**
This is an example of a driver class; its purpose
is to try out the Course class.
@author Leah Bidlake
@author Daniyal Khan 3765942
*/

public class CourseDriver{

	public static void main(String[] args){
	
	//Create some Course objects
	Course course1 = new Course("CS1073", "Fall", 2020, "Leah Bidlake");		
	Course course2 = new Course("CS1083", "Winter", 2021, "Leah Bidlake");		
	Course course3 = new Course("MATH1013", "Summer", 2021, "Justine Gauthier");	
	Course course4 = new Course("MATH1503", "Winter", 2024, "Mahin Salmani");
	
	//Adding students to the courses
	course1.addStudent(23);
	course2.addStudent(17);
	course3.addStudent(31);
	course4.addStudent(4);

	//Now I can print out my courses to confirm they 
	//were created properly
	System.out.println("course1: " + course1.toString());
	System.out.println("course2: " + course2.toString());
	System.out.println("course3: " + course3.toString());
	System.out.println("course4: " + course4.toString());

	}

}
