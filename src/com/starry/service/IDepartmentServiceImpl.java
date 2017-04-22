package com.starry.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.starry.dao.IDepartmentDao;
import com.starry.entity.Department;
@Service("departService")
public class IDepartmentServiceImpl implements IDepartmentService {
	@Autowired
	private IDepartmentDao departmentDao;
	
	public void setDepartmentDao(IDepartmentDao departmentDao) {
		this.departmentDao = departmentDao;
	}
	
	public IDepartmentDao getDepartmentDao() {
		return departmentDao;
	}
	@Override
	public List<Department> getAll() {
		return departmentDao.getAll();
	}

	@Override
	public int delById(String id) {
		return departmentDao.DeleteById(id);
	}

	@Override
	public List<Department> findName(String info) {
		return departmentDao.findName(info);
	}

	@Override
	public List<Department> findId(String info) {
		return departmentDao.findId(info);
	}

	@Override
	public void update(Department department) {
		departmentDao.updateDepart(department);
		
	}

}
