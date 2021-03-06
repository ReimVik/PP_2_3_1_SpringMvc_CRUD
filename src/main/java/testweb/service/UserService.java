package testweb.service;

import testweb.model.User;

import javax.validation.Valid;
import java.util.List;

public interface UserService {

    List<User> getAllUsers();
    void add(User user);
    void delete(int id);
    void edit(@Valid User user);
    User getById(int id);
}
