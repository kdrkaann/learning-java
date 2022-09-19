package com.kafein.project.Service;

import com.kafein.project.Entities.User;
import com.kafein.project.DataAccess.IUserDal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Service
public class UserManager implements IUserService{

    private IUserDal userDal;

    @Autowired
    public UserManager(IUserDal userDal) {
        this.userDal = userDal;
    }

    @Override
    @Transactional
    public List<User> getAll() {
        return this.userDal.getAll();
    }

    @Override
    @Transactional
    public void add(User user) {
        this.userDal.add(user);
    }

    @Override
    @Transactional
    public void update(User user) {
        this.userDal.update(user);
    }

    @Override
    @Transactional
    public void delete(User user) {
        this.userDal.delete(user);
    }

    @Override
    @Transactional
    public User getById(int id) {
        return this.userDal.getById(id);
    }
}
