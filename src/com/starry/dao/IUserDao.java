package com.starry.dao;

import java.util.List;

import com.starry.entity.Administor;
import com.starry.entity.Feedback;
import com.starry.entity.Order;
import com.starry.entity.OrderInfo;
import com.starry.entity.User;
import com.starry.entity.UserRegister;

public interface IUserDao {
	public abstract List<User> selectAll();// 

	public abstract int deleteById(int id);//

	public abstract int register(User users);
	public abstract int update(User user);//
	
	public abstract List<User> userLogin(User user); 
	public abstract int updateUser(User user);
	
	public abstract int insertOrder(Order order);
	public abstract List<OrderInfo> getOrderById(Integer id);
	
	public abstract int insertFeedback(Feedback feedback);
//	public abstract List<User> getUser();
	public abstract int deleteOrderById(Integer  oNumber);
}
