package by.academy.homework7;

public class User extends Person{
	private String login; 
	public String password; 
	protected String email;
	
	public User() {
		super();
	}

	public void printUserInfo() {
		System.out.println("User [firstName= " + getFirstName() + ", lastName= " + getLastName() + ", age= " + getAge() + ", dateOfBirth= " + getDateOfBirth() + ", login= " + login + ", password= " + password + ", email= " + email + "]");
	};
	
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public String toString() {
		System.out.println("User [firstName= " + getFirstName() + ", lastName= " + getLastName() + ", age= " + getAge() + ", dateOfBirth= " + getDateOfBirth() + ", login= " + login + ", password= " + password + ", email= " + email + "]");
		return "User [firstName= " + getFirstName() + ", lastName= " + getLastName() + ", age= " + getAge() + ", dateOfBirth= " + getDateOfBirth() + ", login= " + login + ", password= " + password + ", email= " + email + "]";
	}
}
