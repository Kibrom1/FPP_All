package week3lesson11;

import java.util.HashMap;

public class Course {

	String c_name;
	String[] faculty;

	Course(String c_name, String[] faculty) {

		this.c_name = c_name;
		this.faculty = faculty;
	}

	public String getC_Name() {

		return c_name;
	}

	public String[] getFaculty() {

		return faculty;
	}

	public String toString() {
		return c_name + " Faculty " + faculty;
	}

	public static void main(String[] args) {

		HashMap<String, Course> mapCourse = new HashMap<String, Course>();
		String[] fppFaculty = { "Renuka", "Joe Lermon", "Paul" };
		String[] mppFaculty = { "Jhon", "Helena", "Brian" };
		mapCourse.put("CS390", new Course("FPP", fppFaculty));
		mapCourse.put("CS490", new Course("MPP", mppFaculty));

		System.out.println(mapCourse.containsKey("CS390")); // checking if the
															// given id exists
		System.out.println(mapCourse.size());

		System.out.println(mapCourse);

		for (int i = 0; i < mapCourse.size(); i++) {
			

		}
		
		/*
		 * Course cc = mapCourse.get("CS390");
		 * System.out.println(cc.getFaculty());
		 */

	}

}
