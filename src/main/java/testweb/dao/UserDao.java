package testweb.dao;

import testweb.model.User;

import java.util.List;

public interface UserDao {

    List<User> getAllUsers();
    void add(User user);
    void delete(int id);
    void edit(User user);
    User getById(int id);
}
