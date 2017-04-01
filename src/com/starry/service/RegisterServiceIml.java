package com.starry.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.starry.dao.IRegisterDao;
import com.starry.entity.UserRegister;
@Service("registerService")
public class RegisterServiceIml implements IRegisterService {
	private IRegisterDao registerDao;
	public IRegisterDao getRegisterDao() {
		return registerDao;
	}
@Resource
	public void setRegisterDao(IRegisterDao registerDao) {
		this.registerDao = registerDao;
	}
	@Override
	public int register(UserRegister userRegister) {
		// TODO Auto-generated method stub
		int result = registerDao.register(userRegister);
		System.out.println("RegisterServiceImpl"+result);
		return result;
	}

}
