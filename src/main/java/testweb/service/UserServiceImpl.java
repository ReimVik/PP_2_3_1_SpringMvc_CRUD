package testweb.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import testweb.dao.UserDao;
import testweb.model.User;

import javax.validation.Valid;
import java.util.List;


@Service
public class UserServiceImpl implements UserService {

    private UserDao userDAO;

    public void setUserDAO(UserDao userDAO) {
        this.userDAO = userDAO;
    }

    @Transactional(readOnly = true)
    @Override
    public List<User> getAllUsers() {
        return userDAO.getAllUsers();
    }

    @Transactional
    @Override
    public void add(User user) {
        userDAO.add(user);
    }

    @Transactional
    @Override
    public void delete(int id) {
        userDAO.delete(id);
    }

    @Transactional
    @Override
    public void edit(@Valid User user) {
        userDAO.edit(user);
    }

    @Override
    public User getById(int id) {
        return userDAO.getById(id);
    }
}
