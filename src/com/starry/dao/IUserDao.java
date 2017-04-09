package com.starry.dao;

import java.util.List;

import com.starry.entity.User;
import com.starry.entity.UserRegister;

public interface IUserDao {
	public abstract List<User> selectAll();// 

	public abstract int deleteById(int id);//

	public abstract int register(User users);
	public abstract int update(User user);//
}
