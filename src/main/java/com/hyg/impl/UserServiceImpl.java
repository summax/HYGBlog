package com.hyg.impl;

import com.hyg.dao.IUserDao;
import com.hyg.entity.User;
import com.hyg.service.IUserService;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements IUserService {

    private IUserDao userDao;

    public User GetUserById(int userId) {
        return userDao.selectByPrimaryKey(userId);
    }
}
