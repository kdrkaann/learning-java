package com.kafein.project.DataAccess;

import com.kafein.project.Entities.User;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class HibernateUserDal implements IUserDal{

    private EntityManager entityManager;

    @Autowired
    public HibernateUserDal(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    @Transactional
    public List<User> getAll() {
        Session session = entityManager.unwrap(Session.class);
        List<User> users = session.createQuery("from User", User.class).getResultList();
        return users;
    }

    @Override
    @Transactional
    public void add(User user) {
        Session session = entityManager.unwrap(Session.class);
        session.saveOrUpdate(user);
    }

    @Override
    @Transactional
    public void update(User user) {
        Session session = entityManager.unwrap(Session.class);
        session.saveOrUpdate(user);
    }

    @Override
    @Transactional
    public void delete(User user) {
        Session session = entityManager.unwrap(Session.class);
        User userToDelete = session.get(User.class, user.getUserID());
        session.delete(userToDelete);
    }

    @Override
    @Transactional
    public User getById(int id) {
        Session session = entityManager.unwrap(Session.class);
        User user = session.get(User.class, id);
        return user;
    }
}
