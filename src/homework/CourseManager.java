package homework;

public class CourseManager {
	
	
	public void createCourse(Course course) {
		System.out.println("Kurs olu�turdunuz: " + course.name);
		System.out.println(course.details);
	}
	
	public Course[] getCourses(Course[] courses) {
	   for (Course course : courses) {
		System.out.println(course.name);
	}
	   return courses;
	}
}
