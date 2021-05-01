
public class Main {
	public static void main(String[] args) {

		User user = new User(1, "Ali", " Demir", "aliDemir", "123456");
		UserManager userManager = new UserManager();
		userManager.add(user);
		userManager.delete(user);
		userManager.update(user);

		System.out.println("*********");

		Instructor instructor = new Instructor();
		instructor.id = 2;
		instructor.firsName = "Engin";
		instructor.lastName = "Demiroğ";
		instructor.userName = "enginDemiroğ";
		instructor.password = "654321";
		instructor.instructorDescription = "Kursa Hazır mıyız?";

		InstructorManager instructorManager = new InstructorManager();
		instructorManager.add(instructor);
		instructorManager.delete(instructor);
		instructorManager.update(instructor);

		System.out.println("**********");

		Student student = new Student(3, "Emirhan", "Kahraman", "emirhanKahraman", "13579", "Java & React");

		StudentManager studentManager = new StudentManager();
		studentManager.add(student);
		studentManager.delete(student);
		studentManager.update(student);

	}

}