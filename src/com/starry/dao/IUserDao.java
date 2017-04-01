package com.starry.dao;

import java.util.List;

import com.starry.entity.User;

public interface IUserDao {
	  public abstract List<User> selectAll();
	  public abstract  int deleteById(int id);
}
