package com.user.role.controller;

import com.user.role.entity.User;
import com.user.role.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

    private final UserService service;

    public UserController(UserService service) {
        this.service = service;
    }

    // Add User
    @PostMapping
    public User addUser(@RequestBody User user) {
        return service.addUser(user);
    }

    // Fetch all users
    @GetMapping
    public List<User> getAllUsers() {
        return service.getAllUsers();
    }

    // Fetch users by role
    @GetMapping("/role/{role}")
    public List<User> getUsersByRole(@PathVariable String role) {
        return service.getUsersByRole(role);
    }
}
