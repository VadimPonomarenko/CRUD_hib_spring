package web.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import web.model.User;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

@Repository
public class UserDaoImpl implements UserDao {
    @PersistenceContext
    private EntityManager em;

    @Override
    public void save(User user) {
        em.persist(user);
    }

    @Override
    public void removeUser(int id) {
        em.remove(show(id));
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<User>  getAllUsers() {
        TypedQuery<User> typedQuery = em.createQuery("from User", User.class);
        return  typedQuery.getResultList();
    }

    @Override
    public User show(int id) {
        return em.find(User.class, id);
    }

    @Override
    public void update(int id, User user) {
        User updatedUser;
        updatedUser = show(id);
        em.detach(updatedUser);
        updatedUser.setName(user.getName());
        updatedUser.setSurname(user.getSurname());
        em.merge(updatedUser);
    }
}
