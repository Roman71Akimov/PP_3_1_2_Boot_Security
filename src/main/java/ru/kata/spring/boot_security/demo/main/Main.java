//package ru.kata.spring.boot_security.demo.main;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
//import ru.kata.spring.boot_security.demo.entity.Role;
//import ru.kata.spring.boot_security.demo.entity.User;
//import ru.kata.spring.boot_security.demo.repository.UserRepository;
//import ru.kata.spring.boot_security.demo.service.RoleService;
//import ru.kata.spring.boot_security.demo.service.UserService;
//import ru.kata.spring.boot_security.demo.service.UserServiceImpl;
//
//import javax.annotation.PostConstruct;
//import java.util.Set;
//@Component
//public class Main {
//    final
//    UserService userService;
//    final
//    RoleService roleService;
//
//    public Main(UserService userService, RoleService roleService) {
//        this.userService = userService;
//        this.roleService = roleService;
//    }
//
//    @PostConstruct
//    public void main() {
//        Role roleAdmin = new Role("ROLE_ADMIN");
//        Role roleUser = new Role("ROLE_USER");
//        roleService.saveRole(roleAdmin);
//        roleService.saveRole(roleUser);
//        User user = new User("user", "user", "user", "user",  Set.of(roleUser));
//        User admin = new User("admin","admin","admin","admin",Set.of(roleAdmin));
//        userService.saveUser(user);
//        userService.saveUser(admin);
//
//    }
//}
