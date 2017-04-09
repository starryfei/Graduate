package com.starry.dao;


import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;

import com.starry.entity.UserRegister;
@Repository("registerDao")
public class IRegisterImpl extends SqlSessionDaoSupport implements IRegisterDao {
	
	 @Resource
	    public void setSuperSessionFactory(SqlSessionFactory sessionFactory){
	        this.setSqlSessionFactory(sessionFactory);
	    }
	public int register(UserRegister userRegister) {
        int result =this.getSqlSession().insert("register",userRegister);
        System.out.println("registerImpl  "+result);
		return result;
	}

}
