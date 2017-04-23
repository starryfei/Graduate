package com.starry.service;

import java.util.List;

import com.starry.entity.Doctor;
import com.starry.entity.DoctorInfo;

public interface IDoctorService {
	public abstract List<DoctorInfo> selectAll();

	public abstract int deleteById(String number);

	public abstract int insert(Doctor doctor);// 

	public abstract int update(Doctor doctor);// 
	
	public abstract List<Doctor> getById(String id);
}
