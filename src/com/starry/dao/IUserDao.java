package com.starry.dao;

import java.util.List;

import com.starry.entity.User;
import com.starry.entity.UserRegister;

public interface IUserDao {
	public abstract List<User> selectAll();// 查询所有用户

	public abstract int deleteById(int id);// 按照id删除

	public abstract int register(User users);// 注册

	public abstract int update(User user);// 修改
}
