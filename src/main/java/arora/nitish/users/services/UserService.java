package arora.nitish.users.services;

import arora.nitish.users.dto.response.UserResponse;

public interface UserService {
	
	/**
	 * function to get details of user with specific user id
	 * 
	 * @param userId - user id to get the details of user
	 */
	public UserResponse getUserData(String userId);
}
