package com.user.role.service;

import com.user.role.entity.User;
import com.user.role.repository.UserRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UserService {

    private final UserRepository repo;

    public UserService(UserRepository repo) {
        this.repo = repo;
    }

    public User addUser(User user) {
        return repo.save(user);
    }

    public List<User> getAllUsers() {
        return repo.findAll();
    }

    public List<User> getUsersByRole(String role) {
        return repo.findByRole(role);
    }
}
