package arora.nitish.users.controller;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import arora.nitish.users.dto.response.UserResponse;
import arora.nitish.users.services.UserService;

@RestController
@RequestMapping(value = "/user")
public class UserController {

	@Resource
	UserService userService;

	@GetMapping(value = "/{userId}")
	public UserResponse getUserData(@PathVariable("userId") String userId) {
		return userService.getUserData(userId);
	}
}
