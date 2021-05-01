
public class Instructor extends User {
	String instructorDescription;

	public Instructor() {

	}

	public Instructor(int id , String firsName , String lastName , String userName , String password ,
			String instructorDescription) {
		super(id , firsName , lastName , userName , password);
		this.instructorDescription = instructorDescription;
	}

	public String getInstructorDescription() {
		return instructorDescription;
	}

	public void setInstructorDescription(String instructorDescription) {
		this.instructorDescription = instructorDescription;
	}

}