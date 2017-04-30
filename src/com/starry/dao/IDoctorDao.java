package com.starry.dao;

import java.util.List;

import com.starry.entity.Department;
import com.starry.entity.Doctor;
import com.starry.entity.DoctorInfo;

public interface IDoctorDao {
	public abstract List<DoctorInfo> selectAll(int pageNum,int pageSize);//

	public abstract int deleteById(String number);// 

	public abstract int insert(Doctor doctor);//

	public abstract int update(Doctor doctor);//
	
	public abstract List<Doctor> getById(String id);
	
	public abstract List<DoctorInfo> findName(String info,int pageNum,int pageSize);
	public abstract List<DoctorInfo> findId(String info,int pageNum,int pageSize);
	public abstract List<DoctorInfo> findDepartName(String info,int pageNum,int pageSize);
}
