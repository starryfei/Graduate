package com.starry.dao;

import java.util.List;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;

import com.starry.entity.Department;
@Repository("departmentDao")
public class IDepartmentImpl extends SqlSessionDaoSupport implements IDepartmentDao {

	@Resource
    public void setSuperSessionFactory(SqlSessionFactory sessionFactory){
        this.setSqlSessionFactory(sessionFactory);
    }
	@Override
	public List<Department> getAll() {
		return getSqlSession().selectList("getcla");
	}

}
