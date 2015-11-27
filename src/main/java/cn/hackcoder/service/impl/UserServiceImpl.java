package cn.hackcoder.service.impl;

import cn.hackcoder.domain.User;
import cn.hackcoder.mapper.UserMapper;
import cn.hackcoder.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by hackcoder on 15-11-27.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public void add(User user) {
        userMapper.add(user);
    }

    @Override
    public void update(User user) {
        userMapper.update(user);
    }

    @Override
    public void delete(User user) {
        userMapper.delete(user.getId());
    }

    @Override
    public User get(long uid) {
        return userMapper.findById(uid);
    }

    @Override
    public List<User> findAll() {
        return userMapper.findAll();
    }
}
