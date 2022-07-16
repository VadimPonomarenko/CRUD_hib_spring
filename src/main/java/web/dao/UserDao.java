package web.dao;

import web.model.User;

import java.util.List;

public interface UserDao {
    void save(User user);

    void removeUser(int id);

    List<User> getAllUsers();

    User show(int id);

    void update(int id, User user);
}
