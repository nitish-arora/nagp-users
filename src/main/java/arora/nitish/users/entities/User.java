package arora.nitish.users.entities;

import java.io.Serializable;

public class User implements Serializable {

	private static final long serialVersionUID = 1L;

	private static final String USER_ID_PREFIX = "USER_";

	private static Integer id = 1;

	private String userId;

	private String name;

	private Integer age;

	private String email;

	public User(String name, Integer age, String email) {
		this.userId = USER_ID_PREFIX + id;
		this.name = name;
		this.age = age;
		this.email = email;
		id++;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
