package com.kafein.project.Service;

import com.kafein.project.Entities.User;
import java.util.List;

public interface IUserService {
    List<User> getAll();
    void add(User user);
    void update(User user);
    void delete(User user);
    User getById(int id);
}
