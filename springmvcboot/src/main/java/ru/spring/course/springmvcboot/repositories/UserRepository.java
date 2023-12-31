package ru.spring.course.springmvcboot.repositories;


import ru.spring.course.springmvcboot.models.User;

import java.util.List;

public interface UserRepository {
    List<User> index();

    User show(int id);

    void save(User person);

    void update(int id, User person);

    void delete(int id);

}
