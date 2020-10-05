package com.lagou.dao;

import com.lagou.pojo.User;

import java.io.IOException;
import java.util.List;

public interface IUserDao {

    //查询所有用户
    public List<User> findAll() throws IOException;

    //多条件组合查询：演示if
    public List<User> findByCondition(User user);


    //多值查询：演示foreach
    public List<User> findByIds(int[] ids);

    //添加用户
    public void saveUser(User user);

    //删除用户
    public void deleteUser(int id);

    //更新用户
    public void updateUser(User user);


}
