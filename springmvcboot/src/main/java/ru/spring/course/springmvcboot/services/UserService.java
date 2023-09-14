package ru.spring.course.springmvcboot.services;

import ru.spring.course.springmvcboot.models.User;

import java.util.List;

public interface UserService {
    List<User> index();

    User show(int id);

    void save(User person);

    void update(int id, User person);

    void delete(int id);

}