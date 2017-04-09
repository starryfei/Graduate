package com.starry.dao;

import java.util.List;

import com.starry.entity.Doctor;

public interface IDoctorDao {
	public abstract List<Doctor> selectAll();//

	public abstract int deleteById(int number);// 

	public abstract int insert(Doctor doctor);//

	public abstract int update(Doctor doctor);//
}
