package ru.kata.kataTask3_1_2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ru.kata.kataTask3_1_2.model.User;
import ru.kata.kataTask3_1_2.repositories.UserRepository;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {


    public UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        super();
        this.userRepository = userRepository;
    }
    public UserServiceImpl() {
    }

    public List<User> findAll() {
        return (List<User>) userRepository.findAll();
    }
    @Override
    public User findOne(Long id) {
        User user = userRepository.findById(id).get();
        return user;
    }

    @Transactional
    @Override
    public void save(User user) {
        userRepository.save(user);
    }

    @Transactional
    @Override
    public void update(Long id, User updateUser) {
        updateUser.setId(id);
        userRepository.save(updateUser);
    }

    @Transactional
    @Override
    public void delete(Long id) {
        userRepository.deleteById(id);
    }


}
