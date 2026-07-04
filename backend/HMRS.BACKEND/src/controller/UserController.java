package controller;

import model.User;
import service.UserService;

public class UserController {

    private UserService userService = new UserService();

    public User login(String username, String password) {
        return userService.login(username, password);
    }
}