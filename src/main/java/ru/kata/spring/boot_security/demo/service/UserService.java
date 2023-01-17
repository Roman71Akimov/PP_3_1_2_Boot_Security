package ru.kata.spring.boot_security.demo.service;
import ru.kata.spring.boot_security.demo.entity.User;
import java.util.List;

public interface UserService {
    void saveUser (User user);

    List<User> getAllUsers();

    User getUserById(Long id);

    User getUserByUsername(String userName);

    void updateUser(Long id, User user);

    void removeUserById(Long id);
}
