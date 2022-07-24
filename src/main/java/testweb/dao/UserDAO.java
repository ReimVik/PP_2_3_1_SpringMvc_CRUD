package testweb.dao;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import testweb.model.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository

public class UserDao {

    @PersistenceContext
    private EntityManager entityManager;

    public List<User> getAllUsers() {
        return entityManager.createQuery("select u from User u", User.class).getResultList();
    }

    public void add(User user) {
        entityManager.persist(user);
    }

    public void delete(int id) {
        entityManager.remove(entityManager.find(User.class, id));
    }

    public void edit(User user) {
        entityManager.merge(user);
    }

    public User getById(int id) {
        return entityManager.find(User.class, id);
    }
}
