package com.starry.dao;

import java.util.List;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;

import com.github.pagehelper.PageHelper;
import com.starry.entity.Department;
import com.starry.entity.Doctor;
import com.starry.entity.DoctorInfo;

@Repository("doctorDao")
public class IDoctorImpl extends SqlSessionDaoSupport implements IDoctorDao {
	  @Resource
	    public void setSuperSessionFactory(SqlSessionFactory sessionFactory){
	        this.setSqlSessionFactory(sessionFactory);
	    }
	  
	@Override
	public List<DoctorInfo> selectAll(int pageNum,int pageSize) {
		List<DoctorInfo> list = this.getSqlSession().selectList("getAllDoctor");
		 PageHelper.startPage(pageNum,pageSize);
		System.out.println("IDoctorImpl"+list);
		return list;
	}

	@Override
	public int deleteById(String number) {
		int result=this.getSqlSession().delete("deleteByNumber",number);
		return result;
	}

	@Override
	public int insert(Doctor doctor) {
		 int result =this.getSqlSession().insert("addDoctor",doctor);
		 return result;
	}

	@Override
	public int update(Doctor doctor) {
		// TODO Auto-generated method stub
		return this.getSqlSession().update("updateDoctor", doctor);
	}

	@Override
	public List<Doctor> getById(String dNumber) {
		// TODO Auto-generated method stub
		return this.getSqlSession().selectList("getDoctorById", dNumber);
	}

	@Override
	public List<DoctorInfo> findName(String info,int pageNum,int pageSize) {
		// TODO Auto-generated method stub
		 PageHelper.startPage(pageNum,pageSize);
		return this.getSqlSession().selectList("getDoctorByName", info);
	}

	@Override
	public List<DoctorInfo> findId(String info,int pageNum,int pageSize) {
		 PageHelper.startPage(pageNum,pageSize);
		return this.getSqlSession().selectList("getDById", info);
	}

	@Override
	public List<DoctorInfo> findDepartName(String info,int pageNum,int pageSize) {
		 PageHelper.startPage(pageNum,pageSize);
		return this.getSqlSession().selectList("getDoctorBycNumber", info);
	}

}
