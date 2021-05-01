
public class UserManager {
	public void add(User user) {
		System.out.println(user.getUserName() + " added");
	}

	public void delete(User user) {
		System.out.println(user.getUserName() + " deleted");
	}

	public void update(User user) {
		System.out.println(user.getUserName() + " updated");
	}
}