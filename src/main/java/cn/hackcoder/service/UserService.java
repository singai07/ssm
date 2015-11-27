package cn.hackcoder.service;

import cn.hackcoder.domain.User;

import java.util.List;

/**
 * Created by hackcoder on 15-11-27.
 */
public interface UserService {
    void add(User user);

    void update(User user);

    void delete(User user);

    User get(long uid);

    List<User> findAll();
}
