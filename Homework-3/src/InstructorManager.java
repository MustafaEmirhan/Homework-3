
public class InstructorManager {
	public void add(Instructor instructor) {
		System.out.println(instructor.getUserName() + " eklendi");
	}

	public void delete(Instructor instructor) {
		System.out.println(instructor.getUserName() + " silindi");
	}

	public void update(Instructor instructor) {
		System.out.println(instructor.getUserName() + " güncellendi");
	}
}