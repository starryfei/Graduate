package com.starry.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.starry.dao.IUserDao;
import com.starry.entity.Administor;
import com.starry.entity.Feedback;
import com.starry.entity.Order;
import com.starry.entity.OrderInfo;
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
	@Override
	public List<User> checkLogin(String name, String pwd) {
		// TODO Auto-generated method stub
		User user=  new User();
		user.setUname(name);
		user.setPwd(pwd);
		List<User> result = userDao.userLogin(user);
		return result;
	}
	@Override
	public int insertOrder(Order order) {
		return userDao.insertOrder(order);
	}
	@Override
	public List<OrderInfo> getOrderById(Integer id) {
		// TODO Auto-generated method stub
		return userDao.getOrderById(id);
	}
	@Override
	public int updateUser(User user) {
		// TODO Auto-generated method stub
		return userDao.updateUser(user);
	}
	@Override
	public int insertFeedback(Feedback feedback) {
		// TODO Auto-generated method stub
		return userDao.insertFeedback(feedback);
	}
	@Override
	public int deleteOrderById(Integer  oNumber) {
		// TODO Auto-generated method stub
		return userDao.deleteOrderById(oNumber);
	}

}
