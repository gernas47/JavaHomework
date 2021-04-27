package homework;

public class Course {
	
	public Course() {
		System.out.println("Bir kurs oluþturun");
	}
	
	public Course(int id, String name, Instructor instructor, double price, String details) {
		this();
		this.id = id;
		this.name = name;
		this.instructor = instructor;
		this.price = price;
		this.details = details;
	}
	
	int id;
	String name;
	Instructor instructor;
	double price;
	String details;
}