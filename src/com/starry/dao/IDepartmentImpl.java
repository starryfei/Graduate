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
	@Override
	public int DeleteById(String id) {
		int result = this.getSqlSession().delete("delById", id);
		return result;
	}
	@Override
	public List<Department> findName(String info) {
		System.out.println(this.getSqlSession().selectList("getByName", info));
		return this.getSqlSession().selectList("getByName", info);
	}
	@Override
	public List<Department> findId(String info) {
		System.out.println(this.getSqlSession().selectList("getById", info));
		return this.getSqlSession().selectList("getById", info);
	}
	@Override
	public void updateDepart(Department department) {
		this.getSqlSession().update("updateById",department );
		
	}

}
