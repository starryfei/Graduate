package com.starry.dao;

import java.util.List;




import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;

import com.starry.entity.User;

@Repository("userDao")
public class IUserDaoImpl extends SqlSessionDaoSupport implements IUserDao {

    @Resource
    public void setSuperSessionFactory(SqlSessionFactory sessionFactory){
        this.setSqlSessionFactory(sessionFactory);
    }
    
    
    public List<User> selectAll() {
        // TODO Auto-generated method stub
    	System.out.println("IUserDaoImpl");
        List<User> users = this.getSqlSession().selectList("getUser");
        System.out.println("IUserDaoImpl"+users);
        return users;
    }


	@Override
	public int deleteById(int id) {
		// TODO Auto-generated method stub
		int result = this.getSqlSession().delete("deleteById", id);
		return result;
	}


}
