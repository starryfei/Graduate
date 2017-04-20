package com.starry.service;

import java.util.List;

import com.starry.entity.Department;

public interface IDepartmentService {
	public abstract List<Department> getAll();
	
	public abstract int delById(String id);
	
	public abstract List<Department> findName(String info);
	public abstract List<Department> findId(String info);
}
