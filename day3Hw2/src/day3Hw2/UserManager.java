package day3Hw2;

public class UserManager {
	public void add(User user) {
		System.out.println("Kullan�c� eklendi: " + user.getUserName());
	}
	
	public void addMultiple(User[] users) {
		for(User user: users) {
			add(user);
		}
	}
}
