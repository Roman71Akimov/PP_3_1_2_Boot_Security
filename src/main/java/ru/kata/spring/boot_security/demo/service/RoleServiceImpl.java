package ru.kata.spring.boot_security.demo.service;

import ru.kata.spring.boot_security.demo.entity.Role;

import java.util.List;

public class RoleServiceImpl implements RoleService {
    Role role;

    @Override
    public List<Role> getRoles() {
        return null;
    }

    @Override
    public void saveRole(Role roleAdmin) {

    }

    @Override
    public void removeRoleById(Long id) {

    }
}
