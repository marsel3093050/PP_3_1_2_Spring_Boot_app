package ru.kata.kataTask3_1_2.service;

import org.springframework.stereotype.Service;
import ru.kata.kataTask3_1_2.model.User;

import java.util.List;

@Service
public interface UserService {
    List<User> findAll();

    void save(User user);

    User findOne(Long id);

    void update(Long id, User updateUser);

    void delete(Long id);
}
