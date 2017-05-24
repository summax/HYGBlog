package com.hyg.dao;

import com.hyg.entity.User;

public interface IUserDao {

    User selectByPrimaryKey(Integer id);
}
