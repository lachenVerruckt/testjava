package com.example.dao;

import com.example.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface domeDao {

    int addUser(User user);

    List<Integer> demandID();

    List<User> getUser();
}
