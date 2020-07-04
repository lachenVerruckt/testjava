package com.example.service.Imp;

import com.example.entity.User;
import com.example.dao.domeDao;
import com.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImp implements UserService {

    @Autowired
    private domeDao domeDao;

    @Override
    public int addUser(User user) {
        return  domeDao.addUser(user);
    }
    @Override
    public List<User> getUser() {
        return domeDao.getUser();
    }

    @Override
    public List<Integer> queryAllID() {
        return domeDao.demandID();
    }

}
