package com.example.demo.DAO;

import com.example.demo.models.User;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserDaoImpl implements UserDAO {

@PersistenceContext
private EntityManager entityManager;

public List<User> findAll() {
    return entityManager.createQuery("select u from User u", User.class).getResultList();
}

@Override
public User findById(long id) {
    return entityManager.find(User.class, id);
}

@Override
public void saveUser(User user) {
    entityManager.persist(user);
}

@Override
public void update(long id, User updatedUser) {
    entityManager.merge(updatedUser);

}

@Override
public void deleteUser(long id) {
    User user = entityManager.find(User.class, id);
    entityManager.remove(user);
}
}
