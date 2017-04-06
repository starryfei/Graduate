package com.starry.dao;

import java.util.List;

import com.starry.entity.Doctor;

public interface IDoctorDao {
	public abstract List<Doctor> selectAll();// 查询所有医生信息

	public abstract int deleteById(int number);// 按照工号删除

	public abstract int insert(Doctor doctor);// 添加

	public abstract int update(Doctor doctor);// 修改
}
