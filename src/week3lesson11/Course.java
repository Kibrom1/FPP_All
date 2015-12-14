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

		System.out.println("Contains: " + mapCourse.containsKey("CS390")); // checking if the
															// given id exists
		System.out.println("Size: " + mapCourse.size());

		System.out.println(mapCourse);
		for (String key : mapCourse.keySet()) {
			System.out.print(key + " ");
		}
		for (String key : mapCourse.keySet()) {
			System.out.println(mapCourse.get(key).getC_Name() + " ");
		}
		for (String key : mapCourse.keySet()) {
			System.out.println("Course Id: " + key + " Course Name: " + mapCourse.get(key).getC_Name() + "Faculties :");
			int num = 1;
			for(String faculty: mapCourse.get(key).getFaculty()){
				System.out.println(num + ". " + faculty  + " ");
				num++;
			}
			
		}

	}

}
/*
 Contains: true
Size: 2
{CS390=FPP Faculty [Ljava.lang.String;@2a139a55, CS490=MPP Faculty [Ljava.lang.String;@15db9742}
CS390 CS490 FPP 
MPP 
Course Id: CS390 Course Name: FPPFaculties :
1. Renuka 
2. Joe Lermon 
3. Paul 
Course Id: CS490 Course Name: MPPFaculties :
1. Jhon 
2. Helena 
3. Brian 
*/
