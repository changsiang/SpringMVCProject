package sg.edu.nus.service;

import java.util.ArrayList;

import sg.edu.nus.model.User;

public interface UserService {
	
	ArrayList<User> findAllUsers();

	User findUser(String userId);

	User createUser(User user);

	User changeUser(User user);

	void removeUser(User user);

	ArrayList<String> findRoleNamesForUser(String userId);
	
	User authenticate(String uname, String pwd);

}
