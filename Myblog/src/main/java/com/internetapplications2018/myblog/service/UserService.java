package com.internetapplications2018.myblog.service;

import com.internetapplications2018.myblog.model.User;

import java.util.Optional;

public interface UserService {

    Optional<User> findByUsername(String username);

    Optional<User> findByEmail(String email);

    User save(User user);
}
