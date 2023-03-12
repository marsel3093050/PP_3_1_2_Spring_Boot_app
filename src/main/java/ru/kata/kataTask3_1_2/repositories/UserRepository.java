package ru.kata.kataTask3_1_2.repositories;

import org.springframework.data.repository.CrudRepository;
import ru.kata.kataTask3_1_2.model.User;

public interface UserRepository extends CrudRepository<User, Long> {

}
