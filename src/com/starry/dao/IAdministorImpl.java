package com.starry.dao;


import java.util.List;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;

import com.starry.entity.Administor;
import com.starry.entity.Department;
import com.starry.entity.Doctor;

@Repository("administorDao")
public class IAdministorImpl extends SqlSessionDaoSupport implements IAdministorDao {
	@Resource
    public void setSuperSessionFactory(SqlSessionFactory sessionFactory){
        this.setSqlSessionFactory(sessionFactory);
    }
	@Override
	public boolean login(Administor administor) {
		System.out.println("impl");
		List<Administor> list = this.getSqlSession().selectList("adlogin", administor);
		System.out.println("impl"+list);
		if(!list.isEmpty())
			return true;
		return false;
	}
	@Override
	public int addDepart(Department department) {
		System.out.println("department"+department);
		return this.getSqlSession().insert("adDepart",department);
	}
	@Override
	public int addDoctor(Doctor doctor) {
		// TODO Auto-generated method stub
		return 0;
	}
}
