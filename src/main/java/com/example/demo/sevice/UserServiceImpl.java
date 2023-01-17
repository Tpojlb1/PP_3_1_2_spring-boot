package com.example.demo.sevice;

import com.example.demo.DAO.UserDAO;
import com.example.demo.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class UserServiceImpl implements UserService {
@Autowired
private UserDAO userDAO;

@Override
public List<User> findAll() {
    return userDAO.findAll();
}

@Override
public User findById(long id) {
    return userDAO.findById(id);
}

@Override
public void saveUser(User user) {
    userDAO.saveUser(user);
}

@Override
public void update(long id, User updatedUser) {
    userDAO.update(id, updatedUser);
}

@Override
public void deleteUser(long id) {
    userDAO.deleteUser(id);
}
}
