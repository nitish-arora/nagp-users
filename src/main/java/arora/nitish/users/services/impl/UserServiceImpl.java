package arora.nitish.users.services.impl;

import static arora.nitish.users.constant.ErrorMessages.NO_USER_FOUND;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import arora.nitish.users.dto.response.UserResponse;
import arora.nitish.users.entities.User;
import arora.nitish.users.exception.UserRuntimeException;
import arora.nitish.users.services.UserService;

@Service
public class UserServiceImpl implements UserService {

	List<User> users = new ArrayList<>();

	public UserServiceImpl() {
		this.createUsers();
	}

	/**
	 * {@inheritDoc}
	 */
	public UserResponse getUserData(String userId) {
		Optional<User> resultingUser = this.users.stream().filter(user -> user.getUserId().equalsIgnoreCase(userId))
				.findFirst();
		if (resultingUser.isPresent()) {
			return new UserResponse(HttpStatus.OK, resultingUser.get());
		}
		throw new UserRuntimeException(NO_USER_FOUND);
	}

	/**
	 * function to create list of users
	 */
	private void createUsers() {
		this.users.add(new User("User1", 22, "user1@dummy.com"));
		this.users.add(new User("User2", 25, "user2@dummy.com"));
		this.users.add(new User("User3", 20, "user3@dummy.com"));
		this.users.add(new User("User4", 29, "user4@dummy.com"));
		this.users.add(new User("User5", 32, "user5@dummy.com"));
		this.users.add(new User("User6", 45, "user6@dummy.com"));
		this.users.add(new User("User7", 20, "user7@dummy.com"));
		this.users.add(new User("User8", 42, "user8@dummy.com"));
		this.users.add(new User("User9", 30, "user9@dummy.com"));
		this.users.add(new User("User10", 18, "user10@dummy.com"));
	}

}
