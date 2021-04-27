package homework;

public class Main {

	public static void main(String[] args) {
		
		
		Instructor instructor1 = new Instructor();
		instructor1.id = 1;
		instructor1.firstName = "Engin";
		instructor1.lastName = "Demirog";
		
		Instructor instructor2 = new Instructor();
		instructor2.id = 2;
		instructor2.firstName = "Mustafa";
		instructor2.lastName = "Murat";
		
		Course course1 = new Course();
		course1.id = 1;
		course1.name = "Java-React";
		course1.instructor = instructor1;
		course1.price = 0;
		course1.details = "Nitelikli Yazılımcı Yetiştirme";
		
		Course course2 = new Course(2, "C#-Angular", instructor2, 0, "Nitelikli Yazılımcı Yetiştirme");
		
		Course[] courses = {course1, course2};
		
		CourseManager courseManager = new CourseManager();
		InstructorManager instructorManager = new InstructorManager();
		
		System.out.println("----------------------");
		
		instructorManager.beInstructor(instructor1);
		courseManager.createCourse(course1);
		
		
		System.out.println("----------------------");
		
		instructorManager.beInstructor(instructor2);
		courseManager.createCourse(course2);
		
		
		System.out.println("----------------------");
		
		courseManager.getCourses(courses);


	}

}
