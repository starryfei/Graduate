package com.starry.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.starry.dao.IUserDao;
import com.starry.entity.User;

@Service("userService")
public class IUserServiceImpl implements IUserService {
	 private IUserDao userDao;
	 
	public IUserDao getUserDao() {
		return userDao;
	}
	 @Resource
	public void setUserDao(IUserDao userDao) {
		this.userDao = userDao;
	}

	@Override
	public List<User> selectAll() {
		// TODO Auto-generated method stub
		System.out.println("UserServiceImpl"+userDao.selectAll());
		return userDao.selectAll();
	}
	@Override
	public int deleteById(int id) {
		int result = userDao.deleteById(id);
		return result;
	}
	@Override
	public int register(User user) {
		int result = userDao.register(user);
	//	System.out.println("RegisterServiceImpl"+result);
		return result;
	}

}
