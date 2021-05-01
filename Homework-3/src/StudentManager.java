
public class StudentManager {
	public void add(Student student) {
		System.out.println(student.getUserName() + " added");
	}

	public void delete(Student student) {
		System.out.println(student.getUserName() + " deleted");
	}

	public void update(Student student) {
		System.out.println(student.getUserName() + " updated");
	}
}